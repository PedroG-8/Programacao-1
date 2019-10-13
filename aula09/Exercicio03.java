package aula09;

public class Exercicio03 {

	public static void main(String[] args) 
	{
		System.out.println(countWords("Isto sao quatro palavras."));
	}

	public static int countWords(String str)
	{
		int numOfWords = 0;
		boolean oneWord = false;
		for(int i = 0; i < str.length() - 1; i++)
		{
			if(!Character.isWhitespace(str.charAt(i)))
			{
				if(oneWord == false)
				{
					numOfWords = 1;	
					oneWord = true;
				}
			}
			if(Character.isWhitespace(str.charAt(i)) && !Character.isWhitespace(str.charAt(i + 1)))
			{
				numOfWords++;
			}
		}
		return numOfWords;
	}
}
