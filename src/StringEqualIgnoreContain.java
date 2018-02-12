import java.util.HashMap;
import java.util.List;

public class StringEqualIgnoreContain {

	public static void main(String[] args) {
		StringEqualIgnoreContain st = new StringEqualIgnoreContain();
		//st.findWordRepeat();
		st.reverseSentence();
	}
	
	public void findWordRepeat()
	{
		String str = "My Name is Deen Deen is a QA";
		String[] strArr = str.split(" ");
		for(int i=0; i<strArr.length; i++)
		{
			int count=0;
			String word = strArr[i];
			for(int j=0; j<strArr.length; j++)
			{
				if(strArr[j].equals(word))
				{
					count++;
				}
				if(count>1)
				{					
					HashMap hm = new HashMap();
					if(hm.containsKey(strArr[j]))
					{
						
					}else {
						hm.put(strArr[j], count);
					}
					System.out.println(hm);
					//System.out.println(strArr[j]);
					//System.out.println(count);
					count=0;
				}
			}
		}
		//System.out.println("Repeated Word count: "+count);
	}
	
	public void reverseSentence()
	{
		String str = "My Name is Deen";
		String[] strArr = str.split(" ");
		for(int i=strArr.length; i>0; i--)
		{
			System.out.print(strArr[i-1]+" ");
		}
	}
	public void checkName()
	{
		String str = "My name is deen";
		if(str.equalsIgnoreCase(""))
		{
			System.out.println("");
		}
	}
}
