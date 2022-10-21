package Pom;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OPPOA745G {
	
	@FindBy(xpath="//input[@id='buy-now-button']")
	private WebElement buyNow;
	
	
	private WebDriver driver;
	private WebDriverWait wait;
	private Actions act;
	public OPPOA745G(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		act= new Actions(driver);

	}

	public void buyNow()
	{

		ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());

		for(int i=0;i<addr.size();i++) {
			System.out.println(addr.get(i));
		}
		driver.switchTo().window(addr.get(0));
//		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(addr.get(1));
//		System.out.println(driver.getCurrentUrl());

		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(buyNow));

	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", buyNow);
		buyNow.click();
		
	}

}
