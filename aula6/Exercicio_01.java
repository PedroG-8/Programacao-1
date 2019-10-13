package aula6;
import java.util.Scanner;
public class Exercicio_01 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		while(true) {
			System.out.print("Quantos números quer escrever? ");
			n = kb.nextInt();
			if(n > 0) break;
		}
		
		int[] nums = new int [n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("N: ");
			nums[i] = kb.nextInt();
		}
		System.out.println("Ordem inversa");
		for(int i = n - 1; i >= 0; i--) {
			System.out.println("N: " + nums[i]);
		}
	}
}
