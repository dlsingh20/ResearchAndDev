package JavaClasses;

public class ThisExe1 {
int a, b;

public void setData(int a, int b)
{
	this.a=a;
	this.b=b;
}

public void showData()
{
	System.out.println("Value of A:"+a);
	System.out.println("Value of B:"+b);
}
	public static void main(String[] args) {
		ThisExe1 te = new ThisExe1();
		te.setData(3, 5);
		te.showData();

	}

}
