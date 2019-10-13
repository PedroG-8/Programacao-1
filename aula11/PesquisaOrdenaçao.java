package aula11;

public class PesquisaOrdenaçao {

	public static void main(String[] args) {

		int[] array = new int[99];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
			System.out.print(array[i] + " ");
		}
		System.out.println("\n------ Ordenado Por Seleção ------");
		int lowestValue;
		int k = 0;
		for(int i = 0; i < array.length; i++)
		{
			for(int j = k; j < array.length; j++)
			{
				lowestValue = array[k];
				if(array[j] < lowestValue)
				{
					lowestValue = array[j];
					array[j] = array[k];
				}
				array[k] = lowestValue;
			}
			for (int i2 = 0; i2 < array.length; i2++) {
				System.out.print(array[i2] + " ");
			}
			System.out.println();
			k++;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
