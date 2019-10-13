package aula12;
import java.io.*;
import java.util.*;

public class Teste 
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) throws IOException
	{
		Cidade[] cidades;
		cidades = lerFichTemp("src/aula12/temperaturas.txt");
		procurarListar(cidades, "os");
		int[] maxmin = maxMin(cidades);
		System.out.printf("Máximo = %5d %3d %s%n", cidades[maxmin[0]].dia, cidades[maxmin[0]].temperatura, cidades[maxmin[0]].nome);
		System.out.printf("Mínimo = %5d %3d %s%n", cidades[maxmin[1]].dia, cidades[maxmin[1]].temperatura, cidades[maxmin[1]].nome);
		gravarCidade(cidades, "Aveiro");
		int[] freq = freqTemp(cidades);
		printFreq(freq);
	}

	static Cidade[] lerFichTemp(String nomeF) throws IOException
	{
		File f = new File(nomeF);
		Scanner read = new Scanner(f);
		int size = read.nextInt();
		Cidade[] cidades = new Cidade[size];
		int i = 0;
		while(read.hasNextLine())
		{
			cidades[i] = new Cidade();
			cidades[i].dia = read.nextInt();
			cidades[i].temperatura = read.nextInt();
			String n = read.nextLine();
			cidades[i].nome = n.trim();
			i++;
		}
		read.close();
		return cidades;
	}
	
	static void procurarListar(Cidade[] c, String frase)
	{
		boolean contains;
		for(int i = 0; i < c.length; i++)
		{
			contains = false;
			String d = Integer.toString(c[i].dia);
			if(d.contains(frase))
			{
				contains = true;
			}
			String t = Integer.toString(c[i].temperatura);
			if(t.contains(frase))
			{
				contains = true;
			}
			String n = c[i].nome;
			if(n.contains(frase))
			{
				contains = true;
			}
			if(contains)
			{
				System.out.println(d + " " + t + " " + n);
			}
		}
	}
	
	static int[] maxMin(Cidade[] c)
	{
		int[] tMaxMin = new int[2];
		int min = c[0].temperatura;
		int max = c[0].temperatura;
		int indexMax = 0, indexMin = 0;
		for(int i = 0; i < c.length; i++)
		{
			if(c[i].temperatura > max)
			{
				max = c[i].temperatura;
				indexMax = i;
			}
			if(c[i].temperatura < min)
			{
				min = c[i].temperatura;
				indexMin = i;
			}
		}
		tMaxMin[0] = indexMax;
		tMaxMin[1] = indexMin;
		return tMaxMin;
	}
	
	static void gravarCidade(Cidade[] c, String nome) throws IOException
	{
		String nomeF = nome + ".txt";
		File f = new File("src/aula12/" + nomeF);
		for(int i = 0; i < c.length; i++)
		{
			if(c[i].nome.equals(nome))
			{
				String str = c[i].dia + " " + c[i].temperatura + " " + c[i].nome;
				PrintWriter pw = new PrintWriter(f);
				pw.print(str);
				pw.close();
				break;
			}
		}
	}
	
	static int[] freqTemp(Cidade[] c)
	{
		int[] freq = new int[101];
		for(int i = 0; i < c.length; i++)
		{
			for(int j = 0; j < freq.length; j++)
			{
				if(c[i].temperatura == j - 50 && c[i].temperatura <= 50 && c[i].temperatura >= -50)
				{
					freq[j]++;
				}
			}
		}
		return freq;
	}
	
	static void printFreq(int[] f)
	{
		System.out.println("Temp Freq");
		for(int i = 0; i < f.length; i++)
		{
			if(f[i] != 0)
			{
				System.out.printf("%4d %4d\n", i - 50, f[i]);
			}
		}
	}
}
class Cidade
{
	int dia;
	int temperatura;
	String nome;
}
