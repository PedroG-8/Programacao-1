package aula4;
import java.util.Scanner;

public class Exercicio_04 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n, tentativas = 0;
		int secret = (int)(100 * Math.random()) + 1;
		
		do {
			System.out.print("Número: ");
			n = kb.nextInt();
			tentativas++;
			if(n > secret) {
				System.out.println("Demasiado alto!");
			}
			else if(n < secret) {
				System.out.println("Demasiado baixo!");
			}
		} while(n != secret);
		
		System.out.print("Acertaste após " + tentativas + " tentativas!");
	}

}
