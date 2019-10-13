package aula5;
import java.util.Scanner;

public class Exercicio_09 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		int num, num2;
		while(true) {
			System.out.print("N > 0: ");
			num = kb.nextInt();
			if(num > 0) {
				break;
			}
		}
		if(isPrime(num)) {
			System.out.println("É primo!");
		}
		else {
			System.out.println("Não é primo!");
		}
		while(true) {
			System.out.print("M > 0: ");
			num2 = kb.nextInt();
			if(num2 > 0) {
				break;
			}
		}
		listPrimes(num2);
	}

	public static boolean isPrime(int n) {
		if(n % 2 == 0) {
			return false;
		}
		for(int i = 3; i <= (n / 2); i = i + 2) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void listPrimes(int n) {
		for(int i = 1; i <= n; i++) {
			if(isPrime(i)) {
				System.out.println(i);	
			}
		}
	}
}
