import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframe {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/din/Desktop/MyPage.html");
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Google']"));
		System.out.println(ele.getText());
	}

}
