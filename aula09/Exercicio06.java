package aula09;
import java.util.Scanner;

public class Exercicio06 
{

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String frase;
		System.out.println("Introduzir frase: ");
		frase = kb.nextLine();
		String nova = tradutor(frase);
		System.out.println("Tradução:\n" + nova);
	}
	
	private static String tradutor(String str)
	{
		String s = "";
		String a = "";
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i) == 'r' || str.charAt(i) == 'R')
			{
				a = "";
			}
			else if(str.charAt(i) == 'l')
			{
				a = "u";
			}
			else if(str.charAt(i) == 'L')
			{
				a = "U";
			}
			else
			{
				a = "" + str.charAt(i);
			}
			s = s + a;
		}
		return s;
	}

}
