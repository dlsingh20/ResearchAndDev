
public class InherExe2 extends InherExe1 
{
	public void multiplication(int x, int y)
	{
		z=x+y;
		System.out.println("Multiplied Value: "+z);
	}
	
	public void division(int x, int y)
	{
		z= x/y;
		System.out.println("Divided Value: "+z);
	}
	
	public static void main(String[] args) 
	{
		InherExe2 obj = new InherExe2();
		obj.addition(10, 5);
		obj.subtraction(10, 5);
		obj.multiplication(10, 5);
		obj.division(10, 5);
		
	}

}
