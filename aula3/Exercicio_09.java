package aula3;
import java.util.Scanner;

public class Exercicio_09 {
	
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n, sum = 0;
		do {
			System.out.print("Número de pares (Entre 1 e 1000): ");
			n = kb.nextInt();
		} while(n < 1 || n > 1000);
		
		for(int i = 2; i <= (n * 2); i = i + 2) {
			System.out.print(i + " ");
			sum = sum + i;
		}
		System.out.print("\nA soma é: " + sum);

	}

}
