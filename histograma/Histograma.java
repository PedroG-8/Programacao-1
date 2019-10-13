package histograma;

import java.util.Scanner;

public class Histograma
{
	static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) 
    {
        String f = "A ria de aveiro e a ria de ovar aveiro";

        String[] palavras = f.split(" ");
        Freq[] histo;
        histo = hist(palavras);
        
        for (int i = 0; i < histo.length; i++)
        {
        	System.out.printf("%6s %3d %n", histo[i].palavra, histo[i].freq);
        }
    }

    static int find(Freq[] h, int n, String pal){
        int indice = -1;
        for (int i = 0; i < n; i++)
        {
            if(h[i].palavra.equals(pal)) 
            {
            	indice = i;
           	}
        }
        return indice;
    }
    
    static Freq[] hist(String[] a)
    {
        int nc = 0;
        Freq[] h = new Freq[a.length];

        for (int i = 0; i < a.length; i++)
        {
            String pal = a[i].toLowerCase();
            int indice = find(h, nc, pal);
            if(indice == -1)
            { 
                h[nc] = new Freq();
                h[nc].palavra = pal;
                h[nc].freq = 1;
                nc++;
            } 
            else
            {         
                h[indice].freq++;
            }
        }
        Freq[] h2 = new Freq[nc];
        System.arraycopy(h, 0, h2, 0, nc);
        return h2;
    }
}

class Freq 
{
    String palavra;
    int freq;
}
