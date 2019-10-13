package aula07;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Exercicio_03 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {

		int[] list = null;
		int choice;
		while(true) {
			while(true) {
				System.out.println("----------------> MENU <----------------");
				System.out.println("(1) ->  Ler a sequ�ncia");
				System.out.println("(2) ->  Escrever a sequ�ncia");
				System.out.println("(3) ->  Calcular o m�ximo da sequ�ncia");
				System.out.println("(4) ->  Calcular o m�nimo da sequ�ncia");
				System.out.println("(5) ->  Calcular a m�dia da sequ�ncia");
				System.out.println("(6) ->  Detetar se � uma sequ�ncia par");
				System.out.println("(7) ->  Ler sequ�ncia de um ficheiro");
				System.out.println("(8) ->  Adicionar n�meros � sequ�ncia");
				System.out.println("(9) ->  Adicionar sequ�ncia ao ficheiro");
				System.out.println("(0) ->  Terminar o programa");
				System.out.println("----------------------------------------");
				choice = kb.nextInt();
				if(choice >= 0 && choice <= 9) {
					break;
				}
			}
			if(choice == 1) {
				list = writeSequence();
				getRealLength(list);
			}
			else if(list == null && choice != 7 && choice != 8) {
				System.out.print("Sequ�ncia vazia\n");
			}
			else if(choice == 2) {
				printSequence(list);	
			}	
			else if(choice == 3) System.out.println("M�ximo: " + maxValue(list));
			else if(choice == 4) System.out.println("M�nimo: " + minValue(list));
			else if(choice == 5) System.out.printf("M�dia: %2.2f\n", averageValue(list));
			else if(choice == 6) {
				String ans;
				if(isEven(list) == true) {
					ans = "";
				}
				else {
					ans = "n�o ";
				}
				System.out.printf("A sequ�ncia %s� composta apenas por n�meros pares!\n", ans);
				
			}
			else if(choice == 7) readFromFile();
			else if(choice == 8) {
				int grl = getRealLength(list);
				int[] newList = addNumbers(list, grl);
				list = newList;
			}
			else if(choice == 9) addToFile(list);
			else break;
		}
	}


	public static int[] writeSequence() {
		int i = 0;
		int[] nums = new int[1000];
		while(true) {
			System.out.print("N: ");
			nums[i] = kb.nextInt();
			if(nums[i] == 0) {
				return nums;
			}
			else if(i == nums.length - 1) {
				return nums;
			}
			i++;
		}
	}
	
	public static void printSequence(int[] list) {
		for(int i = 0; i < list.length; i++) {
			if(list[i] == 0) {
				break;
			}
			System.out.println("N: " + list[i]);
		}
		
	}
	
	public static int maxValue(int[] list) {
		int max = list[0];
		for(int i = 0; i < list.length; i++) {	
			if(list[i] == 0) {
				break;
			}
			if(list[i] > max) {
				max = list[i];
			}
		}
		return max;
	}
	
	public static int minValue(int[] list) {
		int min = list[0];
		for(int i = 0; i < list.length; i++) {	
			if(list[i] == 0) {
				break;
			}
			else if(list[i] < min) {
				min = list[i];
			}
		}
		return min;
	}
	
	public static double averageValue(int[] list) {
		double sum = 0;
		int i;
		for(i = 0; i < list.length; i++) {	
			if(list[i] == 0) {
				break;
			}
			sum = sum + list[i];
		}
		return sum / i;
	}
	
	public static boolean isEven(int[] list) {
		for(int i = 0; i < list.length; i++) {
			if(list[i] == 0) {
				break;			
			}
			if(list[i] % 2 != 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void readFromFile() {
		System.out.print("Nome do ficheiro para ler: ");
		String fileName = kb.next();
		File f = new File(fileName);
		try {
			Scanner fr = new Scanner(f);
			while(fr.hasNextLine()) {
				int n = fr.nextInt();
				System.out.print(n + " ");	
			}
			fr.close();
			System.out.println();
		} catch(Exception e) {
			if(!f.isFile()) {
				System.out.println("Ficheiro n�o encontrado!");
			} else if(!f.canRead()) {
				System.out.println("N�o � poss�vel ler ficheiro!");
			} else {
				System.out.println(e.getMessage());		
			}
		}
	}
	
	public static int[] addNumbers(int[] list, int l) {
		int[] newList = new int[1000];
		if(list != null) {
			newList = list;
		}
		for(int i = l; i < newList.length; i++) {
			System.out.print("N: ");
			int num = kb.nextInt();
			if(num == 0) break;
			newList[i] = num;
		}
		return newList;
	}
	
	public static int getRealLength(int[] list) {
		int listRealLength = 0;
		if(list == null) {
			return listRealLength;
		}
		for(int i = 0; i < list.length; i++) {
			if(list[i] == 0) {
				break;
			}
			listRealLength++;
		}
		return listRealLength;
	}
	
	public static void addToFile(int[] list) {
		int choice;
		System.out.println("Para adicionar a ficheiro existente -> (1)");
		System.out.println("Para criar um ficheiro novo -> (2)");
		System.out.println("Para cancelar -> (3)");
		while(true) {
			System.out.print(": ");	
			choice = kb.nextInt();
			if(choice == 1 || choice == 2 || choice == 3) break;
		}
		if(choice == 1) {
			System.out.print("Nome do ficheiro: ");
			String existantFile = kb.next();
			File f = new File(existantFile);
			try 
			{				
				for(int i = 0; i < existantFile.length(); i++) 
				{
					if(existantFile.charAt(i) == '.') 
					{
						f = new File(existantFile);
						break;
					}
					else 
					{
						f = new File(existantFile + ".txt");	
					}
				}
				FileWriter fw = new FileWriter(f, true);
				PrintWriter pw = new PrintWriter(fw);
				for(int i = 0; i < list.length; i++)
				{
					if(list[i] == 0)
					{
						break;
					}
					else
					{
						pw.println(list[i]);	
					}
				}
				pw.close();	
				System.out.println("Sequ�ncia adicionada com sucesso");
			} 
			catch(Exception e) 
			{
				if(!f.isFile()) 
				{
					System.out.print("Ficheiro n�o encontrado!");
				}
			}
		}
		else if(choice == 2) 
		{	
			System.out.print("Nome do ficheiro: ");
			String fileName = kb.next();
			File testFile = new File(fileName);
			try
			{
			for(int i = 0; i < fileName.length(); i++) 
			{
				if(fileName.charAt(i) == '.')
				{
					break;
				}
				else
				{
					testFile = new File(fileName + ".txt");
				}
			}
				System.out.println("Ficheiro criado com sucesso");
				FileWriter fw = new FileWriter(testFile, true);
				PrintWriter pw = new PrintWriter(fw);
				for(int j = 0; j < list.length; j++)
				{
					if(list[j] == 0)
					{
						break;
					}
					else
					{
						pw.println(list[j]);	
					}
				}
				pw.close();
				System.out.println("Sequ�ncia adicionada com sucesso");
			}
			catch (IOException e) 
			{
				System.out.println("Ficheiro n�o existe");
			}	
		}
	}
}