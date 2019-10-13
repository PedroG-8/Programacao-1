package aula08;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Pessoa Mario = new Pessoa("Mário", "homem", 80, 1000, 7, true);
		System.out.println(Mario);
		Mario.TAS();

	}

}

class Pessoa
{
	private String nome, sexo;
	private double teorAlcool, TAS, peso, mlBebida;
	private boolean jejum;
	
	public Pessoa(String nome, String sexo, double peso, double mlBebida, double teorAlcool, boolean jejum)
	{
		this.nome = nome;
		this.sexo = sexo;
		this.peso = peso;
		this.mlBebida = mlBebida;
		this.teorAlcool = teorAlcool;
		this.jejum = jejum;
	}
	
	@Override
	public String toString()
	{
		return "Nome: " + this.nome + "\nSexo: " + this.sexo + "\nPeso: " + this.peso + " Kg" + 
			   "\nQuantidade de bebida ingerida: " + this.mlBebida + " ml" + 
			   "\nTeor alcoolico da bebida: " + this.teorAlcool + "%";
	}
	
	public void TAS()
	{
		if(sexo == "mulher" && jejum)
		{
			TAS = (0.8 * mlBebida * teorAlcool) / 100 / (0.6 * peso);
		}
		else if(sexo == "homem" && jejum)
		{
			TAS = (0.8 * mlBebida * teorAlcool) / 100 / (0.7 * peso);
		}
		else
		{
			TAS = (0.8 * mlBebida * teorAlcool) / 100 / (1.1 * peso);
		}
		System.out.printf("Taxa de alcoolemia: %4.3f\n", this.TAS);
	}
}