package JavaClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException{
		/*File file = new File("C:\\Users\\din\\Desktop\\OrderOopsPa.png");
		//FileInputStream fis = new FileInputStream(file);
		System.out.println("Test");
		
		int i = 2/0;
		System.out.println(i);
		*/
		
		try {
			File file = new File("C:\\Users\\din\\Desktop\\OrderOopsPa.png");
			FileInputStream fis = new FileInputStream(file);
				
		} catch (Exception e) {
			System.out.print(e.toString());
		}
	}
}
