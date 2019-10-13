package aula1;
import java.util.*;
public class Exercicio_16 {
	
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		double money, sum = 0, average;
		do {
		System.out.print("Total gasto no 1º dia: ");
		money = kb.nextDouble();
		} while(money <= 0);
		
		System.out.printf("Gastos\n");
		
		for(int i = 1; i < 5; i++) {
			System.out.printf("%dº dia - %4.2f€\n", i, money);
			sum += money;
			money = money + (money * 0.2);
		}
		average = sum / 4;
		System.out.printf("Despesa média diária - %4.2f€", average);
	}

}
