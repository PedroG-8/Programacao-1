package aula6;
import java.util.Scanner;
public class Exercicio_02 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		int i = 0;
		int[] listOfNums = new int[100];
		
		while(true) {
			System.out.print("N: ");
			listOfNums[i] = kb.nextInt();
			if(listOfNums[i] < 0) {
				break;
			}
			else if(i == 99) {
				i++;
				break;
			}
			i++;
		}
		System.out.printf("Introduziu %d números válidos", i);
	}
}
