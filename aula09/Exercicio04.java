package aula09;

public class Exercicio04 {

	public static void main(String[] args) {
		
		System.out.println(matchPattern("BA-12-31", 1));
	}

	public static boolean matchPattern(String str, int pattern)
	{
		boolean start = false;
		int a = 0;
		if(pattern == 1)
		{
			for(int i = 0; i < str.length(); i++)
			{
				if(!Character.isWhitespace(str.charAt(i)))
				{
					if(start == false)
					{
						a = i;
						start = true;
					}
				}
				if(Character.isUpperCase(str.charAt(a)) && Character.isUpperCase(str.charAt(a + 1)) &&
						str.charAt(a + 2) == '-' && Character.isDigit(str.charAt(a + 3)) && Character.isDigit(str.charAt(a + 4)) && 
						str.charAt(a + 5) == '-' && Character.isDigit(str.charAt(a + 6)) && Character.isDigit(str.charAt(a + 7)) &&
						a + 7 == str.length() - 1)
				{
					return true;
				}
			}
		}
		
		return false;
	}
	
}
