package aula1;

import java.util.Scanner;

public class Rectangle {
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		double c, l, area, perimetero;
		System.out.print("Introduza o comprimento do retângulo: ");
		c = kb.nextDouble();
		System.out.print("Introduza a largura do retângulo: ");
		l = kb.nextDouble();
		
		area = c * l;
		perimetero = (c * 2) + (l * 2);
		
		System.out.println();
		System.out.printf("Área do retângulo: %4.2f", area);
		System.out.printf("\nPerímetero do retângulo: %4.2f", perimetero);
		
	}

}
