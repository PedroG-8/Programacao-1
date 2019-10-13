package aula5;
import java.util.Scanner;

public class Exercicio_05 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		printRect(4, 5);
		printRect(14, 10);
		printRect(25, 15);

	}
	
	public static void printRect(int x, int y) {
		for(int i = 1; i <= x; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int j = 1; j <= (y - 2); j++) {
			System.out.print("*");
			for(int i = 1; i <= (x - 2); i++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for(int i = 1; i <= x; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
