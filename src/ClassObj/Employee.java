package ClassObj;

public class Employee 
{
	int basicSal;
	String name ;
	int hra;
	int da;
	int totalPay;
	
	void calSalary()
	{
		totalPay = basicSal+hra+da;
		//System.out.println(totalPay);
	}
	
	//A class is a template that describes the data and behavior associated with instances of that class.
	//An object is an instance of a class
	
	/*
		Class - Dogs
		Data members or objects- size, age, color, breed, etc.
		Methods- eat, sleep, sit and run.
	 */
}
