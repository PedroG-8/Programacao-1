package aula3;
import java.util.*;

public class Exercicio_06 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		int largura, altura;
		do {
			System.out.print("Introduza a largura: ");
			largura = kb.nextInt();
			if(largura < 1) {
				System.out.print("Valor inválido!\n");
			}
		} while(largura < 1);
		
		do {
			System.out.print("Introduza a altura: ");
			altura = kb.nextInt();
			if(altura < 1) {
				System.out.print("Valor inválido!\n");
			}
		} while(altura < 1);
		
		System.out.println();
		for(int i = 1; i <= altura; i++) {
			for(int j = 1; j <= largura; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}
