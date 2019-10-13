package aula5;
import java.util.Scanner;

public class Exercicio_03 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		int mes, ano;
		mes = getIntRange(1, 12, "Mês: ");
		ano = getIntPos("Ano: ");
		isLeapYear(ano);
		System.out.print(printMonth(mes) + " de " + ano + " tem " + numDays(mes, ano) + " dias!");
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
	
	public static int getIntPos(String n) {
		int num;
		do {
			System.out.print(n);
			num = kb.nextInt();
		} while(num < 0);
		return num; 	
	}
	
	// Verifica se é bissexto
	public static boolean isLeapYear(int n) {
		if(n % 100 == 0 && n % 400 != 0) {
			return false;
		}
		else if(n % 4 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int numDays(int m, int a) {
		int days;
		if(m == 2) {
			if(isLeapYear(a) == true) {
				days = 29;
			}
			else {
				days = 28;
			}
		}
		else if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			days = 31;
		}
		else {
			days = 30;
		}
		return days;
	}
	
	public static String printMonth(int m) {
		if(m == 1) return "Janeiro";
		else if(m == 2) return "Fevereiro";
		else if(m == 3) return "Março";
		else if(m == 4) return "Abril";
		else if(m == 5) return "Maio";
		else if(m == 6) return "Junho";
		else if(m == 7) return "Julho";
		else if(m == 8) return "Agosto";
		else if(m == 9) return "Setembro";
		else if(m == 10) return "Outubro";
		else if(m == 1) return "Novembro";
		else return "Dezembro";
	}

}
