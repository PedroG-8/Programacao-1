package aula3;
import java.util.Scanner;

public class Exercicio_03 {
	
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		int m, f = 1;
		do {
			System.out.print("Introduza o valor de M (entre 1 e 10): ");
			m = kb.nextInt();
			if(m < 1 || m > 10) {
				System.out.print("Valor inválido!\n");
			}
		} while(m < 1 || m > 10);
		
		for(int i = 1; i <= m; i++) {
			f = f * i;
			System.out.printf("%d! = %d\n", i, f);			
		}
	}
}
