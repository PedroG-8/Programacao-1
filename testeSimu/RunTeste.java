package testeSimu;

public class RunTeste 
{
	public static void main(String[] args) 
	{
		int[] indice = new int[10];
		for (int i = 0; i < indice.length; i++)
		{
			indice[i]=i;
		}
		baralhar(indice);
//		for(int i = 0; i < indice.length; i++)
//		{
//			System.out.printf("indice[%d] = %d\n", i, indice[i]);
//		}
	}

	static void baralhar(int[] lista) 
	{
		int sorte;
		for (int i = lista.length - 1; i >= 0; i--) 
		{
			sorte = (int)(Math.random()*(i+1)); 
			int ultimo = lista[i];
			System.out.println("Ultimo: " + ultimo);
			lista[i] = lista[sorte];
			System.out.println("Lista[" + i + "]: " + lista[sorte]);
			lista[sorte] = ultimo;
			System.out.println("Lista[" + sorte + "]: " + ultimo);
		}
	}
}
