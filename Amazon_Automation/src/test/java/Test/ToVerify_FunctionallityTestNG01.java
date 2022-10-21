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
import org.testng.asserts.SoftAssert;

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

public class ToVerify_FunctionallityTestNG01 extends Base {
	
	WebDriver driver;
	SignInPage signInPage;
	SoftAssert soft;
	SignInFashion signInFashion;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite");
	}
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
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void createPOMObjects()
	{
		signInPage =new SignInPage(driver);
		soft=new SoftAssert();
		signInFashion  = new SignInFashion(driver);
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
	
	@Test
	public void toVerifyFashionPage()
	{
		System.out.println("Test c");
		signInFashion.openfashion();
		
		String url="https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion";
		String title="Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
//		System.out.println(url);
//		System.out.println(title);
		soft.assertEquals(url, "https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion");
		soft.assertEquals(title, "Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids");
        soft.assertAll();
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
		soft=null;
		signInFashion=null;
	}

	@AfterTest
	public void closeBrowser()
	{
		System.out.println("after test");
		driver.quit();
		driver=null;
		System.gc(); //garbage collector

	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite");
	}

}
