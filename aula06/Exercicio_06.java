package aula6;
import java.util.Scanner;

public class Exercicio_06 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Introduza uma frase: ");
		String frase = kb.nextLine();
		chars(frase);
		// chars2(frase);
	}
	
	public static void charTest(String s) {
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
	
	public static char[] abecedario() {
		char[] ch = new char[26];
		char c = 'a';
		for(int i = 0; i < ch.length; i++) {
			ch[i] = c;
			c++;
		}
		return ch;
	}
	
	public static void chars(String s) {
		int[] a = new int[abecedario().length];
		for(int i = 0; i < abecedario().length; i++) {
			int numLetras = 0;
			for(int j = 0; j < s.length(); j++) {
				if(abecedario()[i] == s.charAt(j)) {
					numLetras++;
					a[i] = numLetras;
				}
			}
			if(a[i] != 0) {
				System.out.println(abecedario()[i] + " -> " + a[i]);				
			}
		}	
	}

	public static void chars2(String s) {
		for(int i = 0; i < s.length(); i++) {
			int numLetras = 0;
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					numLetras++;
				}
			}
				System.out.println(s.charAt(i) + " -> " + numLetras);
		}
	}
}
