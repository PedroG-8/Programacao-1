package aula3;
import java.util.Scanner;
public class Exercicio_10 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num, total = 0, count = 0, resto = 0, cima = 0, baixo = 0;
		System.out.print("N�mero: ");
		num = kb.nextInt();
		System.out.print(num + " = ");
		
		for(int i = 1; total < num; i++) {
			count = i;
			total = total + i;
			if(total < num) {
				System.out.print(i + " + ");
			}
			else if(total > num) {
				int a = total - i;
				int b = num - a;
				System.out.print(b);
				resto = b;
			}
			else {
				System.out.print(i);
				break;
			}
		}
		
		System.out.println();
		if(num == total) {
			System.out.print("O n�mero � perfeito!");
		}
		else {
			System.out.print("O n�mero n�o � perfeito!");
			System.out.println();
			cima = num + (count - resto);
			baixo = num - resto;
			if(count - resto < resto) {
				System.out.printf("O n�mero perfeito mais pr�ximo � o %d\n", cima);
			}
			else if(count - resto > resto){
				System.out.printf("O n�mero perfeito mais pr�ximo � o %d\n", baixo);
			}
			else {
				System.out.printf("Os n�meros perfeitos mais pr�ximos s�o o %d e o %d\n", cima, baixo);
			}
		}	
	}
}
