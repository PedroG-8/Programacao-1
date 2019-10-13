package aula07;
import java.io.File;
import java.util.Scanner;

public class Exercicio_01 {

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Nome do ficheiro para ler: ");
		String fileName = kb.nextLine();
		File f = new File("");
		
		try {
			// Caso a pessoa escreva o nome do ficheiro.txt ou nao, o programa lê á mesma!
			for(int i = 0; i < fileName.length(); i++) {
				if(fileName.charAt(i) == '.') {
					f = new File(fileName);
					break;
				}
				else {
					f = new File(fileName + ".txt");	
				}
			}
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String s = sc.nextLine();
				System.out.println(s);
			}
			sc.close();
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