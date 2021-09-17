package bootcamplab;

public class test {

	public static void main(String[] args) {

		String[] words = {"bob","alice","keith","zoe","sarah","gary"};
		for(int i = 0; i < words.length; i++)
		{
		    int smallest = i;
		    for(int j = i + 1; j < words.length; j++) 
		    {
		        if(words[j].compareTo(words[i]) < 0)
		            smallest = j;
		    }
		    String aux = words[i];
		    words[i] = words[smallest];
		    words[smallest] = aux;
		}
		for(int i = 0; i < words.length; i++)
		{
		    System.out.println(words[i]);
		
	}

	}
}