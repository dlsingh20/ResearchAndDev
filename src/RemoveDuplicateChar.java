import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		RemoveDuplicateChar.removeDupWords();

	}
	
	public static void removeDuplicate()
	{
		String str = "abcdabcdebcf";
		char[] ch = str.toCharArray();
		
		Set<Character> charSet = new LinkedHashSet<Character>();
		
		for(int i=0 ; i<=ch.length-1; i++)
		{
			charSet.add(ch[i]);
		}
		//System.out.println("a");
		System.out.println(charSet);
	}
	
	public static void removeDupWords()
	{
		String input="Welcome to Java Session Java Session Session Java";
		String[] words = input.split(" ");
		
		int len =words.length;
		System.out.println(len);
		
		for(int i=0; i<len; i++)
		{
			if(words[i]!=null)
			{							
			for(int j=i+1; j<len; j++)
			{
				if(words[i].equals(words[j]))
				{
					words[i] = null;
				}
			}
			}
		}
		
		for(int k=0; k<len; k++)
		{
			if(words[k]!=null)
			{
				System.out.println(words[k]);
				
			}
			
		}
	}
}
