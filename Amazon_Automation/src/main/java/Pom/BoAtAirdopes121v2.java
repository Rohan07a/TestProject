package Pom;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BoAtAirdopes121v2 {
	
	@FindBy(xpath=("//input[@id='add-to-cart-button']"))
	private WebElement addToCart;

	
	
	private WebDriver driver;
	private WebDriverWait wait;


	

	public BoAtAirdopes121v2(WebDriver driver)
	{
		this.driver=driver;

		PageFactory.initElements(driver,this);
	}
	
	public void addToCart()
	{
		
		ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());

		for(int i=0;i<addr.size();i++) {
			System.out.println(addr.get(i));
		}
		
		driver.switchTo().window(addr.get(2));
		System.out.println(driver.getCurrentUrl());

		
		WebDriverWait wait=new WebDriverWait(driver,(30));

		wait.until(ExpectedConditions.visibilityOf(addToCart));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", addToCart);
		addToCart.click();
		}

	
	

}
