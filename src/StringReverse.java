
public class StringReverse {

	public static void main(String[] args) {
		String str = "My name is Deen Dayal";
		String[] newStr =str.split(" ");
		
		for(int i=newStr.length-1; i>=0; i--)
		{
			char[] ch = newStr[i].toCharArray();
			for(int j=ch.length-1; j>=0; j--)
			{
				System.out.print(ch[j]);
			}
			System.out.print(" ");
			//System.out.print(newStr[i]+" ");
		}
		
		StringReverse.test();

	}

	
	//String str = "My Name is Deen Dayal";

	//Reverse sentence and every character in ward as well

	public static void test(){
	String str = "I live in Noida";
	String[] newStr = str.split(" ");
	int len = newStr.length;

	for(int i=len-1; i>=0; i--)
	{
		char[] ch = newStr[i].toCharArray();
		int chLen = ch.length;
		for(int j=chLen-1; j>=0; j--)
		{
			System.out.print(ch[j]);
		} 
		System.out.print(" ");
	}

	}
}
