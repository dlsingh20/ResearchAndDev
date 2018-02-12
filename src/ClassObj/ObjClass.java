package ClassObj;

public class ObjClass {
	
	

	public static void main(String[] args) {
		Employee raj = new Employee();
		raj.basicSal=5000;
		raj.name = "Raj Kumar";
		raj.hra=2000;
		raj.da=2500;
		
		raj.calSalary();
		System.out.println("Total Pay of "+raj.totalPay);
		
		Employee virat = new Employee();
		virat.basicSal=12000;
		virat.name="Virat Kohlie";
		virat.hra = 6000;
		virat.da= 4000;
		
		virat.calSalary();
		
		System.out.println("Total Pay of "+virat.totalPay);

	}

}
