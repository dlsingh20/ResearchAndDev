import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runIE();
	}
	public static void runIE()
	{
		System.setProperty("webdriver.ie.driver", "F:\\DD1\\drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("download java");
		driver.findElement(By.name("btnk")).click();
	}

}
