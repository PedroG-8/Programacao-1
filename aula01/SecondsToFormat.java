package aula1;
import java.util.Scanner;
public class SecondsToFormat {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		int seconds, minutes, hours;
		System.out.print("Segundos: ");
		seconds = kb.nextInt();
		
		minutes = seconds / 60;
		hours = minutes / 60;
		seconds = seconds % 60;
		minutes = minutes % 60;
		
		System.out.printf("%d:%d:%d", hours, minutes, seconds);
	}

}
