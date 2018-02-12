
public class MethodOv {

	public static void main(String[] args) 
	{
		System.out.println(MethodOv.test("Din", "Dayal"));
		System.out.println(MethodOv.test(2, 5));
	}
	
	public static String test(String str1, String str2)
	{
		return str1+str2;
	}
	
	public static int test(int n1, int n2)
	{
		return n1+n2;
	}

}
