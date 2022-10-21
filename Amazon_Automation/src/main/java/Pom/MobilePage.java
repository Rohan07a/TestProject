package Pom;

import java.time.Duration;

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

public class MobilePage {
	
	@FindBy(xpath="//span[contains(text(),'OPPO A74 5G (Fantastic Purple,6GB RAM,128GB Storage)')]")
	private WebElement oPPOA745G;

	private WebDriver driver;
	private WebDriverWait wait;

	public MobilePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		

	}
	
	public void openOPPOA745G()
	{
		WebDriverWait wait=new WebDriverWait(driver,(40));
		wait.until(ExpectedConditions.visibilityOf(oPPOA745G));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", oPPOA745G);
		oPPOA745G.click();
		System.out.println(driver.getTitle());
	}
	
		
	}

