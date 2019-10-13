package aula4;
import java.util.Scanner;

public class Exercicio_08 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		String t;
		int x, y;
		int sum = 0;
		do {
			System.out.print("x: ");
			x = kb.nextInt();
		} while(x < 0);
		do {
			System.out.print("y: ");
			y = kb.nextInt();
		} while(y < 0);
		
		if(x == 0 || y == 0) {
			System.out.print("Resultado: 0");
		}
		else {
			System.out.println(" X  |  Y  | soma");
			System.out.println("----------------");
			while(x >= 1) {
				if(x % 2 != 0) {
					t = "sim";
					sum = sum + y;
				}
				else {
					t = "nao";
				}
				System.out.printf("%3d | %3d | %s\n", x, y, t);
				x = x / 2;
				y = y * 2;		
			}
			System.out.println("----------------");
			System.out.print("Resultado: " + sum);
		}
	
		
		
	}

}
