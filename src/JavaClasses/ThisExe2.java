package JavaClasses;

public class ThisExe2 {

	int i=10;
	
	void value()
	{
		int i=20;
		System.out.println("Value of i:"+this.i);
	}
	
	public static void main(String[] args) {
		ThisExe2 t2 = new ThisExe2();
		t2.value();

	}

}
