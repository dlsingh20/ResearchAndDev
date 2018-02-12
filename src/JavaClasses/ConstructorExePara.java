package JavaClasses;

public class ConstructorExePara 
{
	int id;
	String name;
	
	ConstructorExePara(int i, String n){
		id=i;
		name=n;
		System.out.println(id+" "+name);
	}	
	public static void main(String[] args) {
		ConstructorExePara cep = new ConstructorExePara(10, "Raman");
		

	}

}
