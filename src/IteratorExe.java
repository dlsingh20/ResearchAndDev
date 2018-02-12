import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExe {

	public static void main(String[] args) {
		//iterate();
		testInteger();
	}
	public static void iterate()
	{
		ArrayList al = new ArrayList();
		al.add("Deenu");
		al.add("Raju");
		al.add("Raman");
		al.add(new Integer(10));
		
		Iterator<String> it =al.iterator();
		
		while(it.hasNext())
		{
			 System.out.println(it.next());
		}			
	}
	
	public static void testInteger()
	{
		//Integer i = 10;
		int i =10;
		//String str = i.toString();
		//System.out.println(str);
	}

}
