package aula3;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		for(int i = 1; i < 100; i++) {
			a = i;
			for(int j = 1; j < 100; j++) {
				b = j;
				for(int k = 1; k < 100; k++) {
					c = k;
					if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && a < b) {
						System.out.printf("(a,b,c) = (%2d,%2d,%2d) => %4d + %4d = %4d\n", a, b, c, a*a, b*b, c*c);
					}
				}
			}
		}
	}
}
