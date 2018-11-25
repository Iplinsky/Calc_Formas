package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.enums.Color;
import entities.Rectangle;
import entities.Circle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Shape> list = new ArrayList<>();
		
		System.out.print("Entre com o número de figuras: ");
		int x = sc.nextInt();
		System.out.println();
		for(int i=1; i<=x; i++) {
			System.out.println("Figura #" + i + ": ");
			System.out.print("Retângulo ou Circulo (r/c)? ");
			char f = sc.next().charAt(0);
			System.out.print("Cor (PRETO/AZUL/VERMELHO)? ");
			Color color = Color.valueOf(sc.next());
			if (f == 'r') {
				
				System.out.print("Largura: ");
				double lar = sc.nextDouble();
				System.out.print("Altura: ");
				double alt = sc.nextDouble();
				list.add(new Rectangle(color, lar, alt));
				
			} else {
				
				System.out.println("Raio: ");
				double rd = sc.nextDouble();
				list.add(new Circle(color, rd));
			}		
		}
		
		System.out.println("--------------------------------------");
		System.out.println("Área das figuras: ");
		
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
			
		}
		
		sc.close();		
	}
}
