package aula3;
import java.util.*;

public class Exercicio_04 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
	
		double erro;
		double sum = 1;
		int n, f = 1;
		do {
			System.out.print("Introduza o valor de n: ");
			n = kb.nextInt();
			if(n < 1) {
				System.out.print("Valor inválido!\n");
			}
		} while(n < 1);
	
		for(int i = 1; i <= n; i++) {
			f = f + 2;
			sum = sum + (Math.pow(-1, i) / f);
		}
		System.out.printf("Soma: %1.15f\n", sum);
		erro = sum - (Math.PI / 4);
		System.out.printf("Erro: %1.15f", Math.abs(erro));
	}
}
