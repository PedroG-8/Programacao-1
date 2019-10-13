package aula6;
import java.util.Scanner;

public class Exercicio_04 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		while(true) {
			System.out.print("Número de estudantes: ");
			num = kb.nextInt();
			if(num > 0) break;
		}
		System.out.println("Notas: ");
		int[] grades = new int[num];
		for(int i = 0; i < grades.length; i++) {
			do {
				System.out.printf("Aluno [%d]: ", i + 1);
				grades[i] = kb.nextInt();
			} while(grades[i] < 0 || grades[i] > 20);
		}
		histogram(grades);
	}
	
	public static void histogram(int[] grades) {
		System.out.println();
		System.out.println("Histograma de notas");
		System.out.println("-------------------------------------------");			
		for(int i = 20; i >= 0; i--) {
			System.out.printf("%2d | ", i);
			for(int j = 0; j < grades.length; j++) {
				if(grades[j] == i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
