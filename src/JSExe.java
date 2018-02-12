import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSExe {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement txtbx = driver.findElement(By.id("lst-ib"));
		js.executeScript("arguments[0].value='Download Java'",txtbx );
				
		WebElement btn = driver.findElement(By.name("btnK"));
		js.executeScript("arguments[0].click();", btn);
	}
}
