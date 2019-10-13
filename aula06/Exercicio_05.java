package aula6;
import java.util.Scanner;

public class Exercicio_05 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		while(true) {
			System.out.print("Total de números: ");
			n = kb.nextInt();
			if(n > 0) break;
		}
		
		double[] nReais = new double[n];
		escreverLista(nReais);
		System.out.println("Média: " + media(nReais));
		System.out.println("Desvio padrão: " + desvioPadrao(nReais));
		System.out.println("Valores superiores à média: ");
		printAcimaDaMedia(nReais);
	}
	
	public static double[] escreverLista(double[] lista) {
		for(int i = 0; i < lista.length; i++) {
			System.out.print("N: ");
			lista[i] = kb.nextDouble();
		}
		return lista;
	}
	
	public static double media(double[] lista) {
		double sum = 0;
		for(double l : lista) {
			sum = sum + l;
		}
		return sum / lista.length;
	}
	
	public static void printAcimaDaMedia(double[] lista) {
		for(double l : lista) {
			if(l > media(lista)) {
				System.out.println(l);
			}
		}
	}
	
	public static double desvioPadrao(double[] lista) {
		double sum = 0, a;
		for(double l : lista) {
			double dif = l - media(lista);
			double sqr = Math.pow(dif, 2);
			sum = sum + sqr;
		}
		a = (double) 1 / lista.length;
		return Math.sqrt(sum * a);
	}

}
