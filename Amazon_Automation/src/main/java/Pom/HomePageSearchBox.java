package Pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageSearchBox {
	 @FindBy(xpath="//input[@id='twotabsearchtextbox']")
	 private WebElement searchTextBox;
	 
	 @FindBy(xpath="(//div[text()='mobile'])[6]")
	 private WebElement mobileinElectronics;

		//(//div[text()='mobile'])[3]
	 ////div[@aria-label='mobile phone']

	 private WebDriver driver;
     private WebDriverWait wait;

		public HomePageSearchBox(WebDriver driver) 
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void searchTextBox()
		{
		    wait=new WebDriverWait(driver,(40));

			searchTextBox.click();
			searchTextBox.sendKeys("Mobile");
			
		}
		public void mobileinElectronics()
		{
		    wait=new WebDriverWait(driver,(50));
			wait.until(ExpectedConditions.visibilityOf(mobileinElectronics));
			mobileinElectronics.click();
		}

		
		
}
