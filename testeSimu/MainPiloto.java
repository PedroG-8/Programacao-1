package testeSimu;
import java.util.Scanner;

public class MainPiloto
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int choice = menu();
		Pilot[] p = null;
		boolean pilotExists = false;
		while(choice != 0)
		{
			if(choice == 1)
			{
				p = insertInfo();
				pilotExists = true;
			}
			else if(choice == 2 && pilotExists)
			{
				sortVehicleNum(p);
			}
			else if(choice == 3 && pilotExists)
			{
				changePilot(p);
			}
			else if(choice == 4 && pilotExists)
			{
				p = removePilot(p);
			}
			else if(choice == 5 && pilotExists)
			{
				listName(p);
			}
			else if(choice == 6 && pilotExists)
			{
				p = removePilotName(p);
			}
			else if(choice == 7 && pilotExists)
			{
				p = validPlate(p);
			}
			choice = menu();
		}
	}

	public static int menu()
	{
		int op;
		System.out.println("-------------------------<>-------------------------");
		System.out.println("Gestão de uma prova automóvel:");
		System.out.println("1 - Inserir informação dos pilotos");
		System.out.println("2 - Listar pilotos ordenados pelo número da viatura");
		System.out.println("3 - Alterar informação de uma viatura");
		System.out.println("4 - Remover piloto com base no número da viatura");
		System.out.println("5 - Listar pilotos ordenados pelo nome");
		System.out.println("6 - Remover piloto(s) com base no nome");
		System.out.println("7 - Validar matriculas");
		System.out.println("0 - Terminar programa");
		while(true)
		{
			System.out.print("Opção -> ");
			try
			{
				op = Integer.parseInt(kb.nextLine());
				if(op >= 0 && op <= 7)
				{
					break;
				}
			}
			catch(Exception e)
			{
				System.out.println("Escolha inválida");
			}
		}
		System.out.println();
		return op;
	}
	
	public static Pilot[] insertInfo()
	{
		Pilot[] racers = new Pilot[10];
		int i = 0;
		for(i = 0; i < 10; i++)
		{
			System.out.println("---> Novo Piloto <---");
			System.out.print("Nome do piloto: ");
			String name = kb.nextLine().trim();
			if(name.isEmpty())
			{
				break;
			}
			racers[i] = new Pilot();
			racers[i].pilotName = name;
			System.out.print("Matrícula: ");
			racers[i].plate = kb.nextLine().trim().toUpperCase();
			racers[i].vehicleNum = i + 1;
			System.out.println(racers[i].vehicleNum);
		}
		Pilot[] finalRacers = new Pilot[i];
		System.arraycopy(racers, 0, finalRacers, 0, i);
		System.out.println("Pilotos introduzidos com sucesso!");
		return finalRacers;
	}
	
	public static void sortVehicleNum(Pilot[] p)
	{
		for(int i = p.length - 1; i >= 0; i--)
		{
			System.out.println("Número da viatura: " + p[i].vehicleNum);
			System.out.println("Nome do piloto: " + p[i].pilotName);
			System.out.println("Matrícula: " + p[i].plate);
			System.out.println();
			System.out.println("---> Próximo piloto <---");
			System.out.println();
		}
	}
	
	public static Pilot[] changePilot(Pilot[] p)
	{
		Pilot[] pilot = new Pilot[p.length];
		System.arraycopy(p, 0, pilot, 0, p.length);
		while(true)
		{
			System.out.println("Alterar informação do piloto: ");
			System.out.print("Número da viatura: ");
			String ans;
			try
			{
				int num = Integer.parseInt(kb.nextLine());
				if(num == pilot[num - 1].vehicleNum)
				{
					System.out.print("Novo nome: ");
					pilot[num - 1].pilotName = kb.nextLine().trim();
					System.out.print("Nova matrícula: ");
					pilot[num - 1].plate = kb.nextLine().toUpperCase();
					System.out.println("Piloto alterado com sucesso!");
				}
				System.out.println("Deseja alterar mais algum (s/n)?");
				while(true)
				{
					System.out.print(": ");
					ans = kb.nextLine();
					if(ans.equals("s") || ans.equals("n"))
					{
						break;
					}
				}
				if(ans.equals("n"))
				{
					break;
				}
			}
			catch(Exception e)
			{
				System.out.println("Viatura inexistente");
			}
		}
		return pilot;
	}
	
	public static Pilot[] removePilot(Pilot[] p)
	{
		boolean delete = false;
		System.out.println("Remover piloto:");
		System.out.print("Número da viatura: ");
		try
		{
			String choice;
			int num = Integer.parseInt(kb.nextLine());
			System.out.println(p[num - 1].pilotName + ", matricula " + p[num - 1].plate);
			System.out.println("Tem a certeza que pretende remover este piloto (s/n)? ");
			while(true)
			{
				System.out.print(": ");
				choice = kb.nextLine();
				if(choice.equals("s") || choice.equals("n"))
				{
					break;
				}
			}
			if(choice.equals("s"))
			{
				for(int i = num - 1; i < p.length - 1; i++)
				{
					p[i] = p[i + 1];
					p[i].vehicleNum = i + 1;
				}
				delete = true;
			}
		}
		catch(Exception e)
		{
			System.out.println("Viatura inexistente");
		}
		if(delete)
		{
			Pilot[] pilot = new Pilot[p.length - 1];
			System.arraycopy(p, 0, pilot, 0, pilot.length);
			return pilot;
		}
		return p;
	}
	
	public static void listName(Pilot[] p)
	{
		Pilot shortName;
		for(int i = 0; i < p.length; i++)
		{
			shortName = p[i];
			for(int j = i; j < p.length; j++)
			{
				if(p[j].pilotName.length() == p[i].pilotName.length())
				{
					for(int k = 0; k < p[j].pilotName.length(); k++)
					{
						if(p[j].pilotName.charAt(k) < p[i].pilotName.charAt(k))	
						{
							Pilot tmp = p[j];
							p[j] = p[i];
							p[i] = tmp;
							break;
						}
						else if(p[j].pilotName.charAt(k) > p[i].pilotName.charAt(k))
						{
							break;
						}
					}
				}
				else if(p[j].pilotName.length() < shortName.pilotName.length())
				{
					shortName = p[j];
					p[j] = p[i];
					p[i] = shortName;
				}
			}
		}
		for(Pilot pilot : p)
		{
			System.out.println(pilot.pilotName + ", Matrícula: " + pilot.plate);
		}
	}
	
	public static Pilot[] removePilotName(Pilot[] p)
	{
		boolean delete = false;
		System.out.println("Remover piloto:");
		System.out.print("Nome do piloto: ");
		String name = kb.nextLine().trim();
		String choice;
		for(int i = 0; i < p.length; i++)
		{
			if(p[i].pilotName.equals(name))
			{
				System.out.println("Tem a certeza que pretende remover este piloto (s/n)? ");
				System.out.println(p[i].pilotName + ", matricula " + p[i].plate);
				while(true)
				{
					System.out.print(": ");
					choice = kb.nextLine();
					if(choice.equals("s") || choice.equals("n"))
					{
						break;
					}
				}
				if(choice.equals("s"))
				{
					for(int j = i; j < p.length - 1; j++)
					{
						p[j] = p[j + 1];
						p[j].vehicleNum = j + 1;
					}
					delete = true;
				}
				if(delete)
				{
					Pilot[] pilot = new Pilot[p.length - 1];
					System.out.println(pilot.length);
					System.arraycopy(p, 0, pilot, 0, pilot.length);
					return pilot;
				}
				else
				{
					break;
				}
			}
		}
		System.out.println("Piloto existente");
		return p;
	}
	
	public static boolean isValid(String s)
	{
		int numDigits = 0;
		int numLetters = 0;	
		if(s.length() < 8)
		{
			return false;
		}
		if(s.charAt(2) == '-' && s.charAt(5) == '-')
		{
			for(int i = 0; i < s.length(); i++)
			{
				if(Character.isDigit(s.charAt(i)))
				{
					if(i == (s.length() - 1))
					{
						if(Character.isDigit(s.charAt(i - 1)))
						{
							numDigits++;
						}
					}
					else if(i == 0)
					{
						if(Character.isDigit(s.charAt(i + 1)))
						{
							numDigits++;
						}
					}
					else
					{
						if(Character.isDigit(s.charAt(i + 1)) || Character.isDigit(s.charAt(i - 1)))
						{
							numDigits++;
						}
					}
				}
				else if(Character.isLetter(s.charAt(i)) && Character.isUpperCase(s.charAt(i)))
				{
					if(i == (s.length() - 1))
					{
						if(Character.isLetter(s.charAt(i - 1)))
						{
							numLetters++;
						}
					}
					else if(i == 0)
					{
						if(Character.isLetter(s.charAt(i + 1)))
						{
							numLetters++;
						}
					}
					else
					{
						if(Character.isLetter(s.charAt(i + 1)) || Character.isLetter(s.charAt(i - 1)))
						{
							numLetters++;
						}
					}
				}
				else if(s.charAt(i) != '-')
				{
					return false;
				}
			}
			if(numDigits == 2 && numLetters == 4)
			{
				return true;
			}
		}
		return false;
	}
	
	public static Pilot[] validPlate(Pilot[] p)
	{
		int numInvalids = 0;
		for(int i = 0; i < p.length; i++)
		{
			if(!isValid(p[i].plate))
			{
				numInvalids++;
				System.out.println(p[i].pilotName + ", matrícula inválida: " + p[i].plate);
				while(true)
				{
					System.out.print("Introduzir nova matrícula: ");
					p[i].plate = kb.nextLine().trim().toUpperCase();	
					if(isValid(p[i].plate))
					{
						System.out.println("Matrícula atualizada!");
						numInvalids--;
						break;
					}
					else
					{
						System.out.println("Matrícula inválida!");
					}
				}
			}
		}
		if(numInvalids == 0)
		{
			System.out.println("Todas as matrículas são válidas");
		}
		return p;
	}
}

class Pilot
{
	int vehicleNum;
	String pilotName;
	String plate;
}