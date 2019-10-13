package aula08;
import java.util.Scanner;

public class TestaHora 
{
  static final Scanner kb = new Scanner(System.in); 
  public static void main(String[] args) 
  {
    Hora inicio;  // tem de definir o novo tipo Hora!
    Hora fim;
    
    inicio = new Hora();
    inicio.h = 9;
    inicio.m = 23;
    inicio.s = 5;
    
    System.out.print("Começou ás ");
    printHora(inicio);  // crie esta função!
    System.out.println(".");
    System.out.println("Quando termina?");
    fim = lerHora();  // crie esta função!
    System.out.print("Início: ");
    printHora(inicio);
    System.out.print(" Fim: ");
    printHora(fim);
  }
  
  public static void printHora(Hora hora) 
  {
	  System.out.printf("%02d:%02d:%02d", hora.h, hora.m, hora.s);
  }
  
  public static Hora lerHora() 
  {
	  Hora hour = new Hora();
	  while(true)
	  {
		  System.out.print("horas? ");
		  hour.h = kb.nextInt();
		  if(hour.h  >= 0 && hour.h  < 24) 
		  {
			  break;
		  }
	  }
	  while(true)
	  {
		  System.out.print("minutos? ");
		  hour.m = kb.nextInt();
		  if(hour.m >= 0 && hour.m < 60) 
		  {
			  break;
		  }
	  }
	  while(true)
	  {
		  System.out.print("segundos? ");
		  hour.s = kb.nextInt();
		  if(hour.s >= 0 && hour.s < 60) 
		  {
			  break;
		  }
	  }
	  return hour;
  }
  
}

class Hora
{
	
	int h, m, s;
	
}

/**
EXEMPLO do pretendido:
$ java TestaHora
Começou ás 09:23:05.
Quando termina?
horas? 11
minutos? 72
minutos? 7
segundos? 2
Início: 09:23:05 Fim: 11:07:02.
**/
