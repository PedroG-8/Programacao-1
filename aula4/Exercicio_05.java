package aula4;
import java.util.Scanner;

public class Exercicio_05 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean primo = true;
		int n, count = 3, div = 0;
		do {
			System.out.print("Número que quer verificar: ");
			n = kb.nextInt();
		} while(n <= 0);
		
		do {
			if(n % 2 == 0) {
				primo = false;
				div = 2;
				break;
			}
			else if(n % count == 0) {
				primo = false;
				div = count;
				break;
			}
			count = count + 2;
		} while(count <= (n / 2));
		
		if(primo == true) System.out.print("É primo!");
		else System.out.print("Não é primo, é divisível por " + div);
	}
}
