package aula4;
import java.util.Scanner;

public class Exercicio_02 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n, prod = 1;
		System.out.println("Introduza uma lista de números (terminada com 0): ");
		do {
			n = kb.nextInt();
			if(n == 0) {
				break;
			}
			prod = prod * n;
		} while(true);
		
		System.out.print("Produto: " + prod);
	}

}
