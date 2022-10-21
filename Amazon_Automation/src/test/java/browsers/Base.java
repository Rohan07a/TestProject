package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation App\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}
   public static WebDriver openEdgeBrowser()
   {
	System.setProperty("webdriver.edge.driver", "C:\\Automation App\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	return driver;
   }
   public static WebDriver openFirefoxBrowser()
   {
	System.setProperty("webdriver.gecko.driver", "C:\\Automation App\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	return driver;
   }

   }

