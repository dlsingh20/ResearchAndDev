import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AllBrowsers {

	static WebDriver driver;
	public static void main(String[] args) {
		launchBrowser("ff", "http://www.google.com");
		googleSearch();
	}
	
	public static void launchBrowser(String browser, String url)
	{
		if(browser.equalsIgnoreCase("ff"))
		{
			/*DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);*/
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\din\\Desktop\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
		}else if(browser.equalsIgnoreCase("ch"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\din\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		}else if(browser.equalsIgnoreCase("ie"))
		{
			driver = new InternetExplorerDriver();
			driver.get(url);
		}
	}
	
	public static void googleSearch()
	{
		WebElement txtsearch = driver.findElement(By.id("lst-ib"));
		txtsearch.sendKeys("Download Java");
		
		WebElement btnsearch = driver.findElement(By.name("btnK"));
		btnsearch.click();
		
	}

}
