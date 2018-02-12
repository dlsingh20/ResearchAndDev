import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Wait {

	public static void main(String[] args) {
		
	}
	public static void explicitWaut()
	{
		WebDriver driver = new FirefoxDriver();
				
		WebDriverWait wb = new WebDriverWait(driver, 30);
		WebElement ele1 = wb.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
	}
	public static void fluentWait()
	{
		WebDriver driver = new FirefoxDriver();
		/*FluentWait wait = new FluentWait(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		WebElement ele = wait.until(new Function<WebDriver, WebElement>() {public WebElement apply(WebDriver driver) return driver.findElement(By.xpath(""));
		});*/
	}

}
