package aula5;
import java.util.Scanner;

public class Exercicio_08 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		double x, y, dif, increment;
		int totNums;
		
		// double z = 1.4;
		// System.out.println(z);
		// System.out.printf("%2.1f\n", z);
		
		while(true) {
			System.out.print("Valor inicial de x: ");
			x = kb.nextDouble();
			System.out.print("Valor final de y: ");
			y = kb.nextDouble();
			if(x < y) break;
			System.out.println("x tem de ser maior que y!");
		}
		while(true) {
			System.out.print("Número de elementos da sequência: ");
			totNums = kb.nextInt();		
			if(totNums > 1) break;
			
		}
		
		dif = y - x;
		increment = dif / totNums;	
		printTableHead();
		for(double i = x; i < y; i = i + increment) {
			printTable(i);
		}
		System.out.println("------------------------------------");
	}
	
	
	public static double secDegreePol(double x) {
		return (5 * Math.pow(x, 2)) + (10 * x) + 3;
	}
	
	public static double thirdDegreePol(double x) {
		return (7 * Math.pow(x, 3)) + (3 * Math.pow(x, 2)) + (5 * x) + 2;
	}
	
	public static void printTable(double x) {
		System.out.printf("| %5.1f |  %8.2f | %11.3f  |\n", x, secDegreePol(x), thirdDegreePol(x));
	}
	
	public static void printTableHead() {
		System.out.println("------------------------------------");
		System.out.println("|   x   | 5x2+10x+3 | 7x3+3x2+5x+2 |");
		System.out.println("------------------------------------");
	}

}
