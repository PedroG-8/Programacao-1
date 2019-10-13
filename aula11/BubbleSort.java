package aula11;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] array = new int[12];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
			System.out.print(array[i] + " ");
		}
		bubbleSort(array);
		selectionSort(array);
	}
	
	public static void bubbleSort(int[] a)
	{
		int numValues = 0;
		int tmp;
		boolean sw;
		while(true)
		{
			sw = false;
			for(int i = 0; i < a.length - 1 - numValues; i++)
			{
				if(a[i] > a[i + 1])
				{
					tmp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = tmp;
					sw = true;
				}
			}
			numValues++;
			if(!sw)
			{
				break;
			}
		}
		System.out.println("\n------ Ordenado Por Bolha ------");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	
	public static void selectionSort(int[] a)
	{
		int tmp;
		for(int i = 0; i < a.length - 1; i++)
		{ 
			for(int j = i + 1; j < a.length; j++)
			{ 
				if(a[i] > a[j])
				{
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		System.out.println("\n------ Ordenado Por Seleção ------");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + " ");
		}
	}
}
