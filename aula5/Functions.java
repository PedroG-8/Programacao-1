package aula5;
import java.util.Scanner;

public class Functions {

	static Scanner kb = new Scanner(System.in);
	public static void main (String args[]) {
		
		// Testar função sqr:
		System.out.printf("sqr(%2.2f) = %2.2f\n", 15.0, sqr(15.0));
		System.out.printf("sqr(%d) = %d\n", -5, sqr(-5));
		
		// Testar função f:
		System.out.printf("f(%d) = %f\n", 5, f(5));
		System.out.printf("f(%2.2f) = %f\n", 3.2, f(3.2));
		
		// Testar função max:
		System.out.printf("max(%2.2f,%2.2f) = %2.2f\n", 3.1, 5.2, max(3.1, 5.2));
		System.out.printf("max(%d,%d) = %d\n", 3, 2, max(3, 2));
		
		// Testar função poly3:
		System.out.printf("P(%2.2f) = %2.2f\n", 5.0, poly3(3.0, 4.2, 1.5, 2.7, 5.0));
		System.out.printf("P(%2.2f) = %2.2f\n", 3.1, poly3(8.1, 6.0, 2.3, 1.5, 3.1));
		
		// Testar função fact:
		System.out.printf("%d! = %d\n", 4, fact(4));
		System.out.printf("%d! = %d\n", 8, fact(8));
		
		getIntPos("Número: ");
		getIntRange(2, 5, "N: ");
		printNtimes(5, "Pedro");
		
		//int ano = getIntPos("Ano? ");
		//System.out.printf("ano = %d\n", ano);

	}

	/*
	 * sqr - calcula o quadrado de um número (real).
	 */
	public static double sqr(double x) {
		double y;	// variavel para resultado
		y = x*x;	// calculo do resultado a partir dos dados
		return y;	// devolver o resultado
	}
	
	/*
	 * sqr - calcula o quadrado de um número (inteiro).
	 */
	public static int sqr(int x) {
		int y;	
		y = x*x;	
		return y;	
	}

	/*
	 * max - calcula o maior de dois números (reais).
	 */
	public static double max(double x, double y) {
		double max = x;
		if(y > max) {
			return y;
		}
		else {
			return x;
		}
	}
	
	/*
	 * max - calcula o maior de dois números (inteiros).
	 */
	public static int max(int x, int y) {
		int max = x;
		if(y > max) {
			return y;
		}
		else {
			return x;
		}
	}
	
	public static double f(double n) {
		return (1/(1 + sqr(n)));
	}
	
	public static double poly3(double a, double b, double c, double d, double x) {
		return ((a*Math.pow(x, 3)) + (b*sqr(x)) + (c*x) + d);
	}
	
	/*
	 * fact - calcula o fatorial de um número (inteiro).
	 */
	public static int fact(int n) {
		int fac = 1;
		for(int i = 1; i <= n; i++) {
			fac = fac * i;
		}
		return fac;
	}
	
	/*
	 * getIntPos - pede um número (inteiro) ao utilizador.
	 */
	public static int getIntPos(String n) {
		int num;
		do {
			System.out.print(n);
			num = kb.nextInt();
		} while(num < 0);
		return num; 	
	}
	
	public static int getIntRange(int x, int y, String n) {
		int num, prov;
		if(x > y) {
			prov = y;
			y = x;
			x = prov;
		}
		while(true) {
			System.out.print(n);
			num = kb.nextInt();	
			if(num >= x && num <= y) break;
			else System.out.print("Não está dentro do intervalo\n");
		}
		return num;
	}

	/*
	 * printNtimes - Imprime uma palavra n vezes.
	 */
	public static void printNtimes(int n, String toPrint) {
		for(int i = 1; i <= n; i++) {
			System.out.print(toPrint);
		}
	}
	

}
