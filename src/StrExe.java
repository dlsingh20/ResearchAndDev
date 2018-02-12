public class StrExe {

	public static void main(String[] args) 
	{
		//StrExe.reverseWords();
		//StrExe.removeDuplicates();
		StrExe.reverseStr("abcdefg", 3);
	}
	
	public static void reverseWords()
	{
		String str = "My Name is Deen";
		String [] StrAry = str.split(" ");
		
		int size = StrAry.length;
		
		for(int i=size-1; i>=0; i--)
		{
			String word = StrAry[i];
			char[] ch = word.toCharArray();
			int s = ch.length;
			for(int j=s-1; j>=0; j--)
			{
				System.out.print(ch[j]);
			}
			System.out.println("");
		}
	}
	
	public static void removeDuplicates() 
	{
		String str = "My Name is Deen Deen is a good guy Deen";
		String[] Str = str.split(" ");
		int len = Str.length;
		for(int i=0; i<len-1; i++)
		{
			for(int j=i; j<len-1; j++)
			{
				if(Str[i].equalsIgnoreCase(Str[j+1]))
				{
					Str[i]=null;
					break;
				}
			}			
		}
		
		for(int i=0; i<=Str.length-1; i++)
		{
			if(Str[i]!=null)
			{
				System.out.println(Str[i]);
			}
		}
	}
	//abcdefg 3 
	public static void reverseStr(String str, int a)
	{
		char[] ch = str.toCharArray();
		int len = ch.length;
		int loop = len/a;
		int m=0;
		
		for(int i=0; i<=loop-1; i++)
		{
			
			int n=a+m;
			for(int j=n-1; j>=m; j--)
			{
				System.out.print(ch[j]);
			}
			m=m+a;
		}
	}
}