package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {
	 @FindBy(xpath="//span[text()='Hello, sign in']")
	 private WebElement helloSignin;
	 
	 @FindBy(xpath="//input[@id='ap_email']")
	 private WebElement emailMob;

	 @FindBy(xpath="//input[@id='continue']")
	 private WebElement continu;

	 @FindBy(xpath="//input[@id='ap_password']")
	 private WebElement password;

	 @FindBy(xpath="//input[@id='signInSubmit']")
	 private WebElement signin;

	 private WebDriver driver;
	
	 
		public SignInPage(WebDriver driver) //driver1=driver = new chromeDriver();
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		public void helloSignin() 
		{
//			WebDriverWait wait=new WebDriverWait(driver,40);
//			wait.until(ExpectedConditions.visibilityOf(helloSignin));
			Actions act= new Actions(driver);
			act.moveToElement(helloSignin).click().build().perform();
		}
		public void emailMob()
		{
			WebDriverWait wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOf(emailMob));
			emailMob.sendKeys("rohanmule23101995@gmail.com");
		}
		public void continu()
		{
			continu.click();
		}
		public void password()
		{
			password.sendKeys("Rohan@1995")	;
		}
		public void signin()
		{
			signin.click();
		}
	 
	 

}
