package aula1;

import java.util.Scanner;

public class Rectangle {
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		double c, l, area, perimetero;
		System.out.print("Introduza o comprimento do ret�ngulo: ");
		c = kb.nextDouble();
		System.out.print("Introduza a largura do ret�ngulo: ");
		l = kb.nextDouble();
		
		area = c * l;
		perimetero = (c * 2) + (l * 2);
		
		System.out.println();
		System.out.printf("�rea do ret�ngulo: %4.2f", area);
		System.out.printf("\nPer�metero do ret�ngulo: %4.2f", perimetero);
		
	}

}
