package JavaClasses;

public class ThisExer {
	int roi = 7;
	
	
	
	public void pLoan()
	{
		int roi=12;
		System.out.println("ROI:"+this.roi);
	}
	
	public static void main(String[] args) {
	ThisExer te = new ThisExer();
	te.pLoan();

	}

}
