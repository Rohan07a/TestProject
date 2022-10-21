package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pom.AirdopesPage;
import Pom.BoAtAirdopes121v2;

import Pom.HomePageSearchAirdope;
import Pom.HomePageSearchBox;
import Pom.MobilePage;
import Pom.OPPOA745G;
import Pom.SignInFashion;
import Pom.SignInPage;
import browsers.Base;

public class ToVerify_Shopping_FunctionallityTestNG extends Base {
	
	WebDriver driver;
	SignInPage signInPage;
	HomePageSearchBox homePageSearchBox;
	MobilePage mobilePage;
	OPPOA745G oPPOA745G ;
	HomePageSearchAirdope homePageSearchAirdope;
	AirdopesPage airdopesPage;
	BoAtAirdopes121v2 boatAirDopes171;
	SignInFashion signInFashion;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
//	@BeforeSuite
//	public void beforeSuite()
//	{
//		System.out.println("beforeSuite");
//	}
	@Parameters("browserName")
	@BeforeTest
	public void launchBrowser(String browser)
	{
		reporter=new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend=new ExtentReports();
		extend.attachReporter(reporter);
		System.out.println("before test");
		if(browser.equals("Chrome"))
		{
		driver=openChromeBrowser();
		}
		if(browser.equals("Edge"))
		{
			driver=openEdgeBrowser();
		}
		if(browser.equals("Firefox"))
		{
			driver=openFirefoxBrowser();
		}
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void createPOMObjects()
	{
		signInPage =new SignInPage(driver);
		homePageSearchBox = new HomePageSearchBox(driver);
		mobilePage =new MobilePage(driver);
		oPPOA745G = new OPPOA745G(driver);
		homePageSearchAirdope =new HomePageSearchAirdope(driver);
		airdopesPage = new AirdopesPage(driver);
	    boatAirDopes171 = new BoAtAirdopes121v2(driver);
		signInFashion = new SignInFashion(driver);
	}
	
	@BeforeMethod
	public void signinToApplication() 
	{
		System.out.println("before method");
		
		driver.get("https://www.amazon.in/");
		
		
		signInPage.helloSignin();
		signInPage.emailMob();
		signInPage.continu();
		signInPage.password();
		signInPage.signin();
	}
	
	
	@Test(priority=0)
	public void toVerifyMobileBuynowbutton() 
	{
		System.out.println("testA");

		
		homePageSearchBox.searchTextBox();
		homePageSearchBox.mobileinElectronics();
		
		
		mobilePage.openOPPOA745G();

		
		
		 oPPOA745G.buyNow();
		
		String url="https://www.amazon.in/gp/buy/payselect/handlers/display.html?hasWorkingJavascript=1";
		String title="Select a Payment Method - Amazon.in Checkout";
//		System.out.println(url);
//		System.out.println(title);
        Assert.assertEquals(url, "https://www.amazon.in/gp/buy/payselect/handlers/display.html?hasWorkingJavascript=1","Url varification failed");
        Assert.assertEquals(title, "Select a Payment Method - Amazon.in Checkout");
        System.out.println("Hello");
		driver.navigate().to("https://www.amazon.in/");
		

		
	}
	@Test(priority=1)
	public void toVerifyAirdopesAddToCart() 
	{
		System.out.println("testB");

		homePageSearchAirdope.searchTextBox2();
		homePageSearchAirdope.airdopes();

		
		airdopesPage.openBoatAirdopes();
		
		
		boatAirDopes171.addToCart();


		String str=(" Cart ");
		String title="boAt Airdopes 121v2 True Wireless Earbuds with Upto 14 Hours Playback, 8MM Drivers, Battery Indicators, Lightweight Earbuds & Multifunction Controls(Cherry Blossom) : Amazon.in: Electronics";
//		System.out.println(str);
//		System.out.println(title);
	    Assert.assertEquals(str, " Cart ");
	    Assert.assertEquals(title, "boAt Airdopes 121v2 True Wireless Earbuds with Upto 14 Hours Playback, 8MM Drivers, Battery Indicators, Lightweight Earbuds & Multifunction Controls(Cherry Blossom) : Amazon.in: Electronics");
		driver.navigate().to("https://www.amazon.in/");
		
		
	}
	@AfterMethod()
	public void signoutFromApplication()
	{
		System.out.println("after method");
		signInFashion.helloRohan1();
		signInFashion.signout1();
	    

	}
	@AfterClass()
	public void clearObject()
	{
		signInPage=null;
		homePageSearchBox=null;
		mobilePage=null;
		oPPOA745G=null;
		homePageSearchAirdope=null;
		airdopesPage=null;
		boatAirDopes171=null;
		signInFashion=null;
	}
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("after test");
		driver.quit();
		driver=null;
		System.gc();   //garbage collector

	}
//	@AfterSuite
//	public void afterSuite()
//	{
//		System.out.println("afterSuite");
//	}

}
