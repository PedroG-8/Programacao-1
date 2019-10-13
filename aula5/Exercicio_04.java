package aula5;
import java.util.Scanner;

public class Exercicio_04 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n;
		System.out.print("Número entre 1 e 10\n");
		n = getIntRange(1, 10, "N: ");
		for(int i = n; i >= 1; i--) {
			System.out.println(i + "! = " + fact(i));
		}
	}
	
	public static int fact(int n) {
		int fac = 1;
		for(int i = 1; i <= n; i++) {
			fac = fac * i;
		}
		return fac;
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

}
