package histograma;

public class HistogramaMeu 
{
	public static void main(String[] args) 
	{
		String phrase = "A ria de aveiro e a ria de ovar aveiro";
		String[] separate = phrase.split(" ");
		Frequence[] histo;
		histo = histogram(separate);
		for(int i = 0; i < histo.length; i++)
		{
			System.out.printf("%10s\t%d\n", histo[i].word, histo[i].freqWord);
		}

	}
	
	public static int existTimes(String[] words, String word)
	{
		int n = 0;
		
		for(int i = 0; i < words.length; i++)
		{
			String str = words[i].toLowerCase();
			if(word.toLowerCase().equals(str))
			{
				n++;
			}
		}
		return n;
	}
	
	public static boolean duplicate(String[] words, String word, int index)
	{
		for(int i = 0; i < index - 1; i++)
		{
			if(word.equals(words[i].toLowerCase()))
			{
				return true;
			}
		}
		return false;
	}
	
	public static Frequence[] histogram(String[] words)
	{
		Frequence[] lastFreq = new Frequence[words.length];
		int count = 0;
		for(int i = 0; i < words.length; i++)
		{
			String str = words[i].toLowerCase();
			if(!duplicate(words, str, i))
			{
				lastFreq[count] = new Frequence();
				lastFreq[count].word = str;
				lastFreq[count].freqWord = existTimes(words, str);
				count++;	
			}
		}
		Frequence[] ultFreq = new Frequence[count];
		System.arraycopy(lastFreq, 0, ultFreq, 0, count);
		return ultFreq;
	}

}

class Frequence
{
	String word;
	int freqWord;
}
