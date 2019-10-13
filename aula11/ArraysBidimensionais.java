package aula11;
import java.util.Scanner;

public class ArraysBidimensionais 
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String[][] library = new String[200][5];
		int index = 0;
		while(true)
		{
			System.out.println("---------------> Biblioteca <----------------");
			System.out.println("1 - Introduzir livro");
			System.out.println("2 - Remover um livro");
			System.out.println("3 - Apagar a base de dados");
			System.out.println("4 - Verificação de cotas repetidas");
			System.out.println("5 - Alterar o estado de um livro");
			System.out.println("6 - Listar os livros requisitados");
			System.out.println("7 - Listar os livros ordenados pela cota");
			System.out.println("8 - Listar os livros ordenados pela data");
			System.out.println("0 - Terminar o programa");
			System.out.println("Escolha -> ");
			int choice = Integer.parseInt(kb.nextLine());
			if(choice == 1)
			{
				library[index] = addBook();
				System.out.println("Livro adicionado com sucesso");
				index++;
			}	
			if(choice == 2)
			{
				listAllBooks(library);
			}
			if(choice == 0)
			{
				break;
			}
		}
	}
	
	static String[] addBook()
	{
		String[] library = new String[5];
		for(int j = 0; j < 5; j++)
		{
			if(j == 0)
			{
				library[j] = getCota();
			}
			if(j == 1)
			{
				library[j] = getAutor();
			}
			if(j == 2)
			{
				library[j] = getTitulo();
			}
			if(j == 3)
			{
				System.out.println("Data de aquisição:");
				library[j] = getData();
			}
			if(j == 4)
			{
				library[j] = getEstado();
			}
		}
		return library;
	}
	
	static String getCota()
	{
		boolean valid = false;
		String s;
		while(true)
		{
			System.out.print("Cota: ");
			s = kb.nextLine();					
			if(s.length() > 20)
			{
				System.out.println("Cota inválida");
				valid = false;
			}
			else
			{
				for(int k = 0; k < s.length(); k++)
				{
					if(!Character.isDigit(s.charAt(k)))
					{
						System.out.println("Cota inválida");
						valid = false;
						break;
					}
					valid = true;
				}
				if(valid)
				{
					break;
				}
			}
		}
		return s;
	}
	
	static String getAutor()
	{
		boolean valid = false;
		String s;
		while(true)
		{
			System.out.print("Autor: ");
			s = kb.nextLine();					
			if(s.length() > 40)
			{
				System.out.println("Nome inválido");
				valid = false;
			}
			else
			{
				for(int k = 0; k < s.length(); k++)
				{
					if(!Character.isLetter(s.charAt(k)))
					{
						System.out.println("Nome inválido");
						break;
					}
					valid = true;
				}
				if(valid)
				{
					break;
				}
			}
		}
		return s;
	}
	
	static String getTitulo()
	{
		boolean valid = false;
		String s;
		while(true)
		{
			System.out.print("Titulo: ");
			s = kb.nextLine();					
			if(s.length() > 60 || s.isEmpty())
			{
				System.out.println("Titulo inválido");
				valid = false;
			}
			else
			{
				valid = true;
			}
			if(valid)
			{
				break;
			}
		}
		return s;
	}
	
	static String getData()
	{
		boolean valid = false;
		String s;
		while(true)
		{
			int dia, mes, ano;
			while(true)
			{
				System.out.print("Dia: ");	
				try
				{
					dia = Integer.parseInt(kb.nextLine());	
					if(dia > 0 && dia <= 31)
					{
						break;
					}
				}
				catch(Exception e) {}
				System.out.println("Dia inválido");
			}
			while(true)
			{
				System.out.print("Mês: ");	
				try
				{
					mes = Integer.parseInt(kb.nextLine());
					if(mes > 0 && mes < 13)
					{
						break;
					}	
				}
				catch(Exception e) {}
				System.out.println("Mês inválido");
			}
			while(true)
			{
				System.out.print("Ano: ");	
				try
				{
					ano = Integer.parseInt(kb.nextLine());
					if(ano >= 0 && ano < 2019)
					{
						break;
					}	
				}
				catch(Exception e) {}
				System.out.println("Ano inválido");
			}
			if(mes == 4 || mes == 6 || mes == 9 || mes == 1)
			{
				if(dia == 31)
				{
					valid = false;
				}
			}
			if(mes == 2)
			{
				if(ano % 4 == 0)
				{
					if(dia > 29)
					{
						valid = false;
					}
				}
				else
				{
					if(dia > 28)
					{
						valid = false;
					}
				}
			}
			else
			{
				valid = true;
			}
			if(valid)
			{
				s = Integer.toString(dia) + "-" + Integer.toString(mes) + "-" + Integer.toString(ano);
				break;
			}
			System.out.println(dia + "-" + mes + "-" + ano + " é uma data inválida");
		}
		return s;
	}
	
	static String getEstado()
	{
		String s;
		while(true)
		{
			System.out.print("Estado ('R' ou 'L'): ");
			s = kb.nextLine();
			s = s.toLowerCase();
			if(s.equals("r") || s.equals("l"))
			{
				break;
			}
		}
		return s;
	}
	
	static void listAllBooks(String[][] str)
	{
		System.out.println(str.length);
		System.out.println(str[0].length);
		try 
		{
			System.out.println(str[0][0].equals("ola"));
		}
		catch(Exception e)
		{
			System.out.println("y");
		}
	}
}
