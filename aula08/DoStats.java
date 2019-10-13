package aula08;
import java.util.Scanner;

// Complete o programa
public class DoStats 
{
    static final Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args)
    {
    	// Cria um registo de estatisticas:
        Statistics xstat = new Statistics();
        System.out.println("Introduzir valores: (Ctrl-Z para terminar)");
        // Enquanto houver um valor double para ler:
        while (sc.hasNextDouble())
        {
        	// Lê um valor:
        	double x = sc.nextDouble();
        	// Atualiza o registo de estatisticas:
        	updateStats(xstat, x);
        }
    
    // Escreve resultados:
    System.out.printf("numero de valores = %d\n", xstat.num);
    System.out.printf("soma dos valores = %f\n", xstat.sum);
    System.out.printf("soma dos quadrados = %f\n", xstat.sum2);
    if (xstat.num > 0) 
    {	
	    System.out.printf("min = %f\n", xstat.min);
	    System.out.printf("max = %f\n", xstat.max);
	    System.out.printf("média = %f\n", mean(xstat));
	    System.out.printf("variancia = %f\n", variance(xstat));
    } 
    else 
    {
        System.out.printf("Lista vazia!");
    }
  }

    public static void updateStats(Statistics s, double x)
    {
    	if(s.num == 0)
    	{
    		s.min = x;
    		s.max = x;
    	}
    	if(x < s.min)
    	{
            s.min = x;
    	}
    	if(x > s.max)
    	{
            s.max = x;
    	}
    	s.num++;
    	s.sum = s.sum + x;
    	s.sum2 = s.sum2 + Math.pow(x, 2);
    }
    
    public static double mean(Statistics s) 
    {
    	return s.sum / s.num;
    }
    
    public static double variance(Statistics s) 
    {
    	return s.sum2 / Math.pow(s.num - mean(s), 2);
    }
}

class Statistics
{
	int num;
	double sum, sum2, min, max;
}
