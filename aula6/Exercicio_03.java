package aula6;
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
				System.out.println("(0) ->  Terminar o programa");
				System.out.println("----------------------------------------");
				choice = kb.nextInt();
				if(choice >= 0 && choice <= 6) {
					break;
				}
			}
			if(choice == 1) list = writeSequence();
			else if(list == null) {
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
			else break;
		}
	}


	public static int[] writeSequence() {
		int i = 0;
		int[] nums = new int[50];
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
}
