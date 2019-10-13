package aula5;
import java.util.Scanner;

public class Exercicio_07 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		int num1, num2, tmp;
		do {
			System.out.print("Número 1: ");
			num1 = kb.nextInt();
		} while(!isPositive(num1));
		do {
			System.out.print("Número 2: ");
			num2 = kb.nextInt();
		} while(!isPositive(num2));
		if(num2 > num1) {
			tmp = num2;
			num2 = num1;
			num1 = tmp;	
		}
		System.out.printf("(%d, %d) = %d", num1, num2, mdc(num1, num2));

	}
	
	public static int mdc(int a, int b) {
		int tmp;
		while(true) {
			tmp = a % b;		
			a = b;
			b = tmp;
			if(tmp == 0) break;
		}
		
		return a;
	}
	
	public static boolean isPositive(int a) {
		if(a > 0) {
			return true;
		}
		return false;
	}

}
