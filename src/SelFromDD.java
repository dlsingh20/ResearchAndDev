import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class SelFromDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void dd()
    {
        
    
        WebDriver driver = new FirefoxDriver ();
        driver.get("http://www.facebook.com");
        
        WebElement date = driver.findElement(By.id("day"));
        
        Select sel = new Select(date);
        sel.selectByIndex(25);
        
        WebElement month = driver.findElement(By.id("month"));
        Select sel2 = new Select(month);
        sel2.selectByVisibleText("Feb"); 
        
        WebElement Year = driver.findElement(By.id("year"));
        Select sel3 = new Select(Year);
        sel3.selectByValue("1989");
    }

}
