package aula4;
import java.util.Scanner;

public class Exercicio_03 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		int count = 0, soma = 0, min, max;
		int n, a, media = 0;
		System.out.println("Lista de números (introduzir nº igual ao 1º para terminar): ");
		a = kb.nextInt();
		min = a;
		max = a;
		do {
			n = kb.nextInt();
			soma = soma + n;
			count++;
			if(n > max) {
				max = n;
			}
			if(n < min) {
				min = n;
			}
		} while(n != a);
		
		media = soma / count;
		System.out.println("Média: " + media);
		System.out.println("Mínimo: " + min);
		System.out.println("Máximo: " + max);
		
	}

}
