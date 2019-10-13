package aula3;
import java.util.Scanner;

public class Exercicio_02 {
	
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n;
		do {
			System.out.print("Introduza um valor para N (entre 1 e 99): ");
			n = kb.nextInt();
			if(n < 1 || n > 99) {
				System.out.print("Valor inválido!\n");
			}
		} while(n < 1 || n > 99);
		
		System.out.printf("------------------\n");
		System.out.printf("| Tabuada dos %2d |\n", n);
		System.out.printf("------------------\n");
		
		for(int i = 1; i < 11; i++) {
			System.out.printf("| %2d x %2d | %3d  |\n", n, i, n*i);
		}
		
		System.out.printf("------------------");
	}
}
