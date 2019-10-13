package testeSimu;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RunTemperatures
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args)
	{
		int choice = 1;
		Tempo[] valores = null;
		boolean fileRead = false;
		while(choice != 0)
		{
			choice = menu();
			if(choice == 1 && !fileRead)
			{
				valores = readFile();
				fileRead = true;
			}
			else if(choice == 2 && fileRead)
			{
				valores = adicionarMedida(valores);	
			}
			else if(choice == 3 && fileRead)
			{
				listarValores(valores);	
			}
			else if(choice == 4 && fileRead)
			{
				listarTemp(valores);	
			}
			else if(choice == 5 && fileRead)
			{
				listarHum(valores);	
			}
			else if(choice == 6 && fileRead)
			{
				averageTime(valores);
			}
			else if(choice == 7 && fileRead)
			{
				valuesMaxMin(valores);
			}
			else if(choice == 8 && fileRead)
			{
				printHist(valores);
			}
			else if(choice == 0)
			{
				System.exit(0);
			}
			else if(!fileRead)
			{
				System.out.println("Ficheiro ainda não foi lido");
			}
			else if(fileRead)
			{
				System.out.println("Já leu o ficheiro!\nTerminar programa para ler outro ficheiro!");
			}
		}
	}
	
	public static int menu()
	{
		int choice;
		System.out.println("<-------------------------------------------------------->");
		System.out.println("Estação metereológica");
		System.out.println("1 - Ler ficheiro de dados");
		System.out.println("2 - Acrescentar medida");
		System.out.println("3 - Listar valores de temperatura e humidade");
		System.out.println("4 - Listar medidas ordenadas por valor de temperatura");
		System.out.println("5 - Listar medidas ordenadas por valor de humidade");
		System.out.println("6 - Calcular valores médios de temperatura e humidade");
		System.out.println("7 - Calcular valores máximos e mínimos de temperatura e humidade");
		System.out.println("8 - Calcular histograma das temperaturas e humidade");
		System.out.println("0 - Terminar o programa");
		while(true)
		{
			System.out.print("Opção -> ");
			try 
			{
				choice = Integer.parseInt(kb.nextLine());
				if(choice >= 0 && choice <= 8)
				{
					break;
				}
			}
			catch(Exception e)
			{
				System.out.println("Escolha não válida");
			}
		}
		return choice;
	}
	
	public static Tempo[] readFile()
	{
		Tempo[] guardarTempo = new Tempo[31];
		String fileName;
		System.out.println("Nome do ficheiro: ");
		fileName = kb.nextLine();
		int i = 0;
		try 
		{
			File f = new File("src/testeSimu/" + fileName + ".txt");
			Scanner read = new Scanner(f);
			while(read.hasNextLine())
			{
				int temp = read.nextInt();
				int hum = read.nextInt();
				if(validTime(temp, hum))
				{
					guardarTempo[i] = new Tempo();
					guardarTempo[i].temperatura = temp;
					guardarTempo[i].humidade = hum;	
					i++;
				}
			}
			read.close();
			System.out.println("Ficheiro lido com sucesso");
		} catch (FileNotFoundException e) 
		{
			System.out.println("Erro a ler ficheiro!");
		}
		Tempo[] finalTempo = new Tempo[i];
		System.arraycopy(guardarTempo, 0, finalTempo, 0, finalTempo.length);
		return finalTempo;
	}
	
	public static Tempo[] adicionarMedida(Tempo[] t)
	{
		boolean valid = false;
		System.out.println("Valor da temperatura: ");
		int temp = Integer.parseInt(kb.nextLine());
		System.out.println("Valor da humidade: ");
		int hum = Integer.parseInt(kb.nextLine());
		if(validTime(temp, hum))
		{
			Tempo[] novoT = new Tempo[t.length + 1];
			System.arraycopy(t, 0, novoT, 0, t.length);
			novoT[novoT.length - 1] = new Tempo();
			novoT[novoT.length - 1].temperatura = temp;
			novoT[novoT.length - 1].humidade = hum;
			valid = true;
			return novoT;
		}
		if(!valid)
		{
			System.out.println("Valores inválidos");
		}
		return t;
	}
	
	public static void listarValores(Tempo[] tempos)
	{
		System.out.println("Lista de temperaturas:");
		for(Tempo t : tempos)
		{
			System.out.printf("Temperatura: %3dºC <---> Humidade: %2d%% \n", t.temperatura, t.humidade);
		}
		System.out.println();
	}
	
	public static void listarTemp(Tempo[] tempos)
	{
		System.out.println("Temperaturas ordenadas:");
		int[] tempOrdenadas = new int[tempos.length];
		int i = 0;
		for(Tempo t : tempos)
		{
			tempOrdenadas[i] = t.temperatura;
			i++;
		}
		for(int j = 0; j < tempOrdenadas.length; j++)
		{
			int min = tempOrdenadas[j];
			for(int k = j; k < tempOrdenadas.length; k++)
			{
				if(tempOrdenadas[k] < min)
				{
					min = tempOrdenadas[k];
					tempOrdenadas[k] = tempOrdenadas[j];
					tempOrdenadas[j] = min;
				}
			}
		}
		for(int tempo : tempOrdenadas)
		{
			System.out.println(tempo + "ºC");
		}
	}
	
	public static void listarHum(Tempo[] tempos)
	{
		System.out.println("Humidades ordenadas:");
		int[] humOrdenadas = new int[tempos.length];
		int i = 0;
		for(Tempo t : tempos)
		{
			humOrdenadas[i] = t.humidade;
			i++;
		}
		for(int j = 0; j < humOrdenadas.length; j++)
		{
			int min = humOrdenadas[j];
			for(int k = j; k < humOrdenadas.length; k++)
			{
				if(humOrdenadas[k] < min)
				{
					min = humOrdenadas[k];
					humOrdenadas[k] = humOrdenadas[j];
					humOrdenadas[j] = min;
				}
			}
		}
		for(int tempo : humOrdenadas)
		{
			System.out.println(tempo + "%");
		}
	}
	
	public static boolean validTime(int temp, int hum)
	{
		if(temp >= -10 && temp <= 40 && hum >= 0 && hum <= 100)
		{
			return true;
		}
		return false;
	}
	
	public static void averageTime(Tempo[] tempos)
	{
		double[] media = new double[2];
		int[] soma = {0, 0};
		for(Tempo t : tempos)
		{
			soma[0] = soma[0] + t.temperatura;
			soma[1] = soma[1] + t.humidade;
		}
		for(int i = 0; i < media.length; i++)
		{
			media[i] = (double)soma[i] / tempos.length;
		}
		System.out.printf("Médias:\nTemperatura: %4.2fºC\nHumidade: %5.2f%%\n", media[0], media[1]);
	}
	
	public static void valuesMaxMin(Tempo[] tempos)
	{
		int max[] = {tempos[0].temperatura, tempos[0].humidade};
		int min[] = {tempos[0].temperatura, tempos[0].humidade};
		for(Tempo t : tempos)
		{
			if(t.temperatura < min[0])
			{
				min[0] = t.temperatura;
			}
			if(t.temperatura > max[0])
			{
				max[0] = t.temperatura;
			}
			if(t.humidade < min[1])
			{
				min[1] = t.humidade;
			}
			if(t.humidade > max[1])
			{
				max[1] = t.humidade;
			}
		}
		System.out.printf("Temperatura Máxima: %dºC <---> Temperatura Mínima: %dºC\n", max[0], min[0]);
		System.out.printf("Humidade Máxima: %d%% <---> Humidade Mínima: %d%%\n", max[1], min[1]);
	}
	
	public static void printHist(Tempo[] tempos)
	{
		System.out.println("Histograma de temperatura");
		System.out.println("-------------------------");
		for(int i = -10; i <= 40; i++)
		{
			System.out.printf("%3d | ", i);
			for(Tempo t : tempos)
			{
				if(t.temperatura == i)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("Histograma de humidade");
		System.out.println("----------------------");
		for(int i = 0; i <= 100; i++)
		{
			System.out.printf("%3d | ", i);
			for(Tempo t : tempos)
			{
				if(t.humidade == i)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

class Tempo
{
	int temperatura;
	int humidade;
}

