package aula2;
import java.util.*;
public class Exercicio_4 {
	
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		int mes, ano, dia;
		
		do {
			System.out.print("Ano: ");
			ano = kb.nextInt();
		} while(ano < 0);
		
		do {
			System.out.print("Mês: ");
			mes = kb.nextInt();
		} while(mes < 1 || mes > 12);
		
		int maxDia = getDia(mes, ano);
		
		System.out.printf("O mês %d do ano %d tem %d dias.", mes, ano, maxDia);
		
		System.out.println();
		
		do {
			System.out.print("Escolha um dia: ");
			dia = kb.nextInt();
		} while(dia < 1 || dia > 31);
		
		do {
			System.out.print("Escolha um mês: ");
			mes = kb.nextInt();
		} while(mes < 1 || mes > 12);
		
		do {
			System.out.print("Escolha um ano: ");
			ano = kb.nextInt();
		} while(ano < 1);
		
		if(dia == 1) {
			if(mes == 1) {
				ano = ano - 1;
				mes = 12;
				maxDia = getDia(mes, ano);
				dia = maxDia;
			} 
			else {
				mes = mes - 1;
				maxDia = getDia(mes, ano);
				dia = maxDia;
			}
		}
		else {
			dia = dia - 1;
		}
		
		System.out.printf("Dia anterior: %02d-%02d-%04d", dia, mes, ano);	
	}
	
	public static int getDia(int mes, int ano) {
		
		int maxDia;
		
		if(mes == 1) 		maxDia = 31;
		else if(mes == 3)	maxDia = 31;
		else if(mes == 4)	maxDia = 30;
		else if(mes == 5)	maxDia = 31;
		else if(mes == 6)	maxDia = 30;
		else if(mes == 7)	maxDia = 31;
		else if(mes == 8)	maxDia = 31;
		else if(mes == 9)	maxDia = 30;
		else if(mes == 10)	maxDia = 31;
		else if(mes == 11)	maxDia = 30;
		else if(mes == 12)	maxDia = 31;		
		else {
			if(ano % 4 == 0) {
				maxDia = 29;
			}
			else {
				maxDia = 28;
			}
		}
		return maxDia;
	}
	
	
}
