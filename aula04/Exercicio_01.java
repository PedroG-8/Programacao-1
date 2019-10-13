package aula4;
import java.util.Scanner;

public class Exercicio_01 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n, x = 0;
		do {
			System.out.print("N: ");
			n = kb.nextInt();
			x++;
		} while(n >= 0);
		x--;
		System.out.print("Foram introduzidos " + x + " números.");

	}

}
