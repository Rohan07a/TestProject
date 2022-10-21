package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInFashion {
	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement helloRohan;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement signout;
	
	@FindBy(xpath="//span[text()='Hello, sign in']")
	private WebElement helloSignin;
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continu;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signin;
	
	@FindBy(xpath="//a[text()='Fashion']")
	private WebElement fashion;

	
	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement helloRohan1;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement signout1;
	
	
	private WebDriver driver;
	private WebDriverWait wait;
	private Actions act;
	public SignInFashion(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		act= new Actions(driver);
		this.driver=driver;

	}
	
	public void helloRohan()
	{
	act.moveToElement(helloRohan).perform();
	}
	
	public void signout()
	{
		act.moveToElement(signout).click().build().perform();
	}
	
	public void helloSignin()
	{
	act.moveToElement(helloSignin).click().build().perform();
	}
	
	public void email()
	{
		email.sendKeys("rohanmule23101995@gmail.com");
	}
	public void continu()
	{
		continu.click();
	}
	public void password()
	{
		password.sendKeys("Rohan@1995");
	}
	
	public void signin()
	{
		signin.click();
	}
	
	public void openfashion()
	{
		fashion.click();
	}
	
	public void helloRohan1()
	{
		act.moveToElement(helloRohan1).perform();
	}
	
	public void signout1()
	{
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(signout1));
		act.moveToElement(signout1).click().build().perform();
	}

	

}
