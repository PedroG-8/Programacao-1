package aula4;
import java.util.Scanner;

public class Exercicio_12 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		int nImpares = 0, nTotal = 0;
		int n;
		 
		do {
			System.out.print("N: ");
			n = kb.nextInt();
			if(n < 0) {
				System.out.println("N�o � positivo!");
				continue;
			}
			if(n % 2 != 0) {
				nImpares++;
			}
			nTotal++;
		} while(n != 0);
		nTotal--;	 // Para descontar o zero
		
		if(nImpares == nTotal) {
			System.out.print("A sequ�ncia de n�meros � exclusivamente constitu�da por n�meros �mpares!");
		}
		else {
			System.out.print("A sequ�ncia de n�meros n�o � exclusivamente constitu�da por n�meros �mpares!");
		}
	}
}
