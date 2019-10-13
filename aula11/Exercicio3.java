package aula11;
import java.util.Scanner;

public class Exercicio3 
{
	public static void main(String[] args)
	{
		printInverted(inputString());
	}

	static String[] inputString()
	{
		String[] allStrings = new String[10];
		Scanner kb = new Scanner(System.in);
		int i;
		for(i = 0; i < allStrings.length; i++)
		{
			System.out.print("Frase " + (i + 1) + ": ");
			String str = kb.nextLine();
			if(str.equals("fim"))
			{
				break;
			}
			allStrings[i] = str;
		}
		kb.close();
		String[] allStringsFinal = new String[i];
		System.arraycopy(allStrings, 0, allStringsFinal, 0, allStringsFinal.length);
		return allStringsFinal;
	}
	
	static void printInverted(String[] allStrings)
	{
		System.out.println("Resultado:");
		for(int i = allStrings.length - 1; i >= 0; i--)
		{
			for(int j = allStrings[i].length() - 1; j >= 0; j--)
			{
				System.out.print(allStrings[i].charAt(j));
			}
			System.out.println();
		}
	}
}
