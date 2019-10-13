package aula5;
import java.util.Scanner;

public class Exercicio_06 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		while(true) {
			System.out.print("N (Entre 1 e 99): ");
			num = kb.nextInt();
			if(num > 0 && num < 100) {
				break;
			}
		}
		printTabuada(num);
	}
	
	public static void printTabuada(int n) {
		System.out.printf("------------------\n");
		System.out.printf("| Tabuada dos %2d |\n", n);
		System.out.printf("------------------\n");
		for(int i = 1; i <= 10; i++) {
			System.out.printf("| %2d x %2d  | %3d |\n", n, i, n * i);
		}
		System.out.printf("------------------\n");
	}

}
