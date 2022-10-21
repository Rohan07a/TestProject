package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pom.AirdopesPage;
import Pom.BoAtAirdopes121v2;

import Pom.HomePageSearchAirdope;
import Pom.HomePageSearchBox;
import Pom.MobilePage;
import Pom.OPPOA745G;

import Pom.SignInFashion;
import Pom.SignInPage;
import Pom.SigninAirdopes;
public class Verify_Shopping_Functionallity {
	
	

public static void main(String[] args)   {
	
	System.setProperty("webdriver.chrome.driver","C:\\Automation App\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	//Test Case 1= Mobile page 
	SignInPage signInPage =new SignInPage(driver);
	signInPage.helloSignin();
	signInPage.emailMob();
	signInPage.continu();
	signInPage.password();
	signInPage.signin();
	
	
	HomePageSearchBox homePageSearchBox = new HomePageSearchBox(driver);
	homePageSearchBox.searchTextBox();
	homePageSearchBox.mobileinElectronics();
	

	MobilePage mobilePage =new MobilePage(driver);
	mobilePage.openOPPOA745G();

	
	OPPOA745G oPPOA745G = new OPPOA745G(driver);
	oPPOA745G.buyNow();

	String url=driver.getCurrentUrl();
	String title=driver.getTitle();
	System.out.println(url);
	System.out.println(title);
	if(url.equals("https://www.amazon.in/gp/buy/payselect/handlers/display.html?hasWorkingJavascript=1")&& title.equals("Select a Payment Method - Amazon.in Checkout"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAILED");
	}
	
    driver.navigate().to("https://www.amazon.in/");
	 
    SigninAirdopes signinAirdopes = new SigninAirdopes (driver);
    signinAirdopes.helloRohan();
    signinAirdopes.signout();
    
    driver.navigate().to("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	//Test Case 2= Airdope page 
	
	 signinAirdopes.helloSignin();
	 signinAirdopes.email();
	 signinAirdopes.continu();
	 signinAirdopes.password();
	 signinAirdopes.signin();
	
    
	HomePageSearchAirdope homePageSearchAirdope =new HomePageSearchAirdope(driver);
	homePageSearchAirdope.searchTextBox2();
	homePageSearchAirdope.airdopes();

	
	AirdopesPage airdopesPage = new AirdopesPage(driver);
	airdopesPage.openBoatAirdopes();
	
	
	BoAtAirdopes121v2 boatAirDopes171 = new BoAtAirdopes121v2(driver);
	boatAirDopes171.addToCart();
	String str=(" Cart ");
	String Title=driver.getTitle();
	System.out.println(str);
	System.out.println(Title);
	if(Title.equals("boAt Airdopes 121v2 True Wireless Earbuds with Upto 14 Hours Playback, 8MM Drivers, Battery Indicators, Lightweight Earbuds & Multifunction Controls(Cherry Blossom) : Amazon.in: Electronics")&&str.equals(" Cart "))
		
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAILED");
	}
	driver.navigate().to("https://www.amazon.in/");

	
	SignInFashion signInFashion = new SignInFashion(driver);
	signInFashion.helloRohan();
	signInFashion.signout();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	//Test Case 3= Fashion page
	signInFashion.helloSignin();
	signInFashion.email();
	signInFashion.continu();
	signInFashion.password();
	signInFashion.signin();
	signInFashion.openfashion();
    
	url=driver.getCurrentUrl();
	title=driver.getTitle();
	System.out.println(url);
	System.out.println(title);
	if(url.equals("https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion")&& title.equals("Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAILED");
	}
    
	signInFashion.helloRohan1();
	signInFashion.signout1();
	driver.quit();



}
}



