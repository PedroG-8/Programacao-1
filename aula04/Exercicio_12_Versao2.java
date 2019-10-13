package aula4;
import java.util.Scanner;

public class Exercicio_12_Versao2 {
	
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
	
		int num, numImpares = 0, numTotal = 0;
		
		do {
			System.out.print("N: ");
			num = kb.nextInt();
			if(isNegative(num)) {
				System.out.println("Numero negativo!");
				continue;
			}
			else if(isImpar(num)) {
				numImpares++;
			}
			else if(num == 0) {
				break;
			}
			numTotal++;
		} while(num != 0);
	
		if(numImpares == numTotal) {
			System.out.print("A sequência de números é exclusivamente constituída por números ímpares!");
		}
		else {
			System.out.print("A sequência de números não é exclusivamente constituída por números ímpares!");
		}
	}
	
	public static boolean isImpar(int n) {
		if(n % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isNegative(int n) {
		if(n < 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
