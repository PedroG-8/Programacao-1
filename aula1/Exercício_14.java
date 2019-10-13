package aula1;
import java.util.Scanner;
public class Exercício_14 {
	
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		double catA, catB, hipC, angle, cos;
		
		System.out.println("Introduir os catetos de um triângulo retângulo!");
		System.out.print("Lado A: ");
		catA = kb.nextDouble();
		System.out.print("Lado B: ");
		catB = kb.nextDouble();
		
		hipC = Math.sqrt((catA * catA) + (catB * catB));
		cos = catA / hipC;
		angle = Math.toDegrees(Math.acos(cos));
				
		System.out.println("Hipotenusa (lado C): " + hipC);
		System.out.println("Ângulo entre A e C: " + angle);

	}
}
