package aula08;
import java.util.Scanner;

public class Exercicio06 
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args)
	{
		Dias[] dia = new Dias[5];
		int min, max;
		for (int i = 0; i < dia.length; i++) {
			while(true)
			{
				System.out.println("Dia " + (i + 1));
				System.out.print("Temperatura minima: ");
				min = kb.nextInt();
				System.out.print("Temperatura máxima: ");
				max = kb.nextInt();
				if(checkDif(min, max) == true)
				{
					break;
				}
			}
			dia[i] = new Dias(max - min);
		}
		System.out.println("Dia " + maxDif(dia) + " foi o dia com maior diferença de temperatura: " + dia[maxDif(dia)].getAmplitudeTermica());
	}

	public static boolean checkDif(int min, int max)
	{
		if(min >= -20 && min <= 50 && min >= -20 && min <= 50 && max >= min)
		{
			return true;
		}
		else 
		{
			System.out.println("Insira outra vez: ");
			return false;	
		}
	}
	
	public static int maxDif(Dias[] dia)
	{
		int max = 0, diaMax = 0;
		for(int i = 0; i < dia.length; i++)
		{
			if(dia[i].getAmplitudeTermica() > max)
			{
				max = dia[i].getAmplitudeTermica();
				diaMax = i;
			}
		}
		return diaMax;
	}
}

class Dias
{
	private int amplitudeTermica;
	
	public Dias(int amplitudeTermica)
	{
		this.amplitudeTermica = amplitudeTermica;
	}
	
	public void setAmplitudeTermica(int temp)
	{
		amplitudeTermica = temp;
	}
	
	public int getAmplitudeTermica()
	{
		return amplitudeTermica;
	}
}
