package aula09;
import java.util.*;

public class Exercicio01 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		int upperCase = 0, lowerCase = 0, digits = 0, vowels = 0, consonants = 0;
		System.out.println("Análise de uma frase");
		System.out.print("Frase de entrada -> ");
		String frase = kb.nextLine();
//		char[] printVowels = new char[frase.length()];
//		ArrayList<Character> printConsonants = new ArrayList<Character>();
//		int a = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			if(Character.isLowerCase(frase.charAt(i)))
			{
				lowerCase++;
			}
			else if(Character.isUpperCase(frase.charAt(i)))
			{
				upperCase++;
			}
			else if(Character.isDigit(frase.charAt(i)))
			{
				digits++;
			}
			if(isVowel(frase.charAt(i)))
			{
				vowels++;
//				printVowels[a] = frase.charAt(i);
//				a++;
			}
			if(!isVowel(frase.charAt(i)) && Character.isLetter(frase.charAt(i)))
			{
				consonants++;
//				printConsonants.add(frase.charAt(i));
			}
		}
		System.out.printf("Número de caracteres minúsculos -> %2d\n", lowerCase);
		System.out.printf("Número de caracteres maiúsculos -> %2d\n", upperCase);
		System.out.printf("Número de caracteres numéricos -> %2d\n", digits);
		System.out.printf("Número de vogais -> %2d\n", vowels);
		System.out.printf("Número de consoantes -> %2d\n", consonants);
	
//		for(char ch : printVowels)
//		{
//			System.out.print(ch);
//		}
//		System.out.println();
//		for (Character character : printConsonants) {
//			System.out.print(character);
//		}
	}
	
	public static boolean isVowel(char c)
	{
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
				c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
		{
			return true;
		}
		return false;
	}

}
