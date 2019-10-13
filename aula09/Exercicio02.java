package aula09;

public class Exercicio02 {

	public static void main(String[] args) {
		
		String s1 = "Organizaçao das Nações Unidas";
		String s2 = "Universidade de Aveiro";
		printAcronym(s1);
		printAcronym(s2);
	}

	public static void printAcronym(String str)
	{
		for(int i = 0; i < str.length(); i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
	}
}
