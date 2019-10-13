package aula07;
import java.io.File;
import java.util.Scanner;

public class Exercicio_02 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		File f = new File("numberFile.txt");
		try {
			Scanner fr = new Scanner(f);
			while(fr.hasNextLine()) {
				int n = fr.nextInt();
				if(n >= 0) {
					System.out.print(n + " ");
				}
			}
			fr.close();
		} catch(Exception e) {
			if(!f.isFile()) {
				System.out.print("Ficheiro não encontrado!");
			} else if(!f.canRead()) {
				System.out.print("Não é possível ler ficheiro!");
			} else {
				System.out.print(e.getMessage());		
			}
		}
	}
}
