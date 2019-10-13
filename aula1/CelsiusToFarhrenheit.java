package aula1;
import java.util.Scanner;
public class CelsiusToFarhrenheit {
	
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		double c, f;
		System.out.print("Celsius: ");
		c = kb.nextDouble();
		f = (1.8 * c) + 32;
		System.out.printf("Fahrenheit: %4.2f", f);
	}

}
