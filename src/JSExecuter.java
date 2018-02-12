import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSExecuter {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		WebElement txtbx = driver.findElement(By.id("lst-ib"));
		
		
		WebElement searchbx = driver.findElement(By.name("btnK"));
		
		//txtbx.sendKeys("Download Java");
		
		JavascriptExecutor jss = (JavascriptExecutor)driver;
		jss.executeScript("arguments[0].value='Kirtesh';", txtbx);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", searchbx);
		
		
		
	}

}
