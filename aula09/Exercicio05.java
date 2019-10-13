package aula09;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int numero = 17;
		int base = 2;
		String s = numToBase(numero, 2);
		int num = baseToNum("10001", 2);
		System.out.println(numero + " em base " + base + ": " + s);
		System.out.println(s + " em base 10: " + num);
	}

	public static String numToBase(int num, int base)
	{
		String s = "";
		while(num > 0)
		{
			int result = num % base;
			s = s + result;				// Vai escrever ao contrário. Ex: 122 vai escrever 221
			num = num / base;
		}
		String finalStr = "";
		for(int i = s.length() - 1; i >= 0; i--)
		{
			char a = s.charAt(i);
			finalStr = finalStr + a;
		}
		return finalStr;
	}
	
	// 10001 = 1 * 1 + 0 * 2 + 0 * 4 + 0 * 8 + 1 * 16
	
	public static int baseToNum(String s, int base)
	{
		int result = 0;
		try
		{
			String finalStr = "";
			for(int i = s.length() - 1; i >= 0; i--)
			{
				char a = s.charAt(i);
				finalStr = finalStr + a;
			}
			int numDigits = 0;
			while(numDigits < finalStr.length())
			{
				int value = Integer.parseInt("" + finalStr.charAt(numDigits));
				int power = (int)(Math.pow(2, numDigits));
				result = result + (value * power);
				numDigits++;
			}
		}
		catch(Exception e)
		{
			System.out.println("Não pode ser convertido para inteiro");
		}
		return result;
	}
}
