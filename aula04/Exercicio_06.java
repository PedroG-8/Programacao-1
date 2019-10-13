package aula4;
import java.util.Scanner;

public class Exercicio_06 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n, m, resto;
		do {
			System.out.print("Número 1: ");
			n = kb.nextInt();
		} while(n <= 0);
		do {
			System.out.print("Número 2: ");
			m = kb.nextInt();
		} while(m <= 0);
		System.out.printf("mdc(%d,%d) = ", n, m);
		do {
			resto = n % m;  // 18
			n = m;	// n = 30
			m = resto; 
		} while(resto != 0);  
		
		System.out.print(n);
		
	}
}
