package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageSearchAirdope {
	
	 @FindBy(xpath="//input[@id='twotabsearchtextbox']")
	 private WebElement searchTextBox2;
	 
		
     @FindBy(xpath="//div[@aria-label='airdopes']")
     private WebElement airdopes;
     
     
    private WebDriverWait wait;
	private WebDriver driver;
 	public HomePageSearchAirdope(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,(40));
	}
     
 	public void searchTextBox2()
 	{
// 		WebDriverWait wait=new WebDriverWait(driver,(30));
// 		wait.until(ExpectedConditions.visibilityOf(searchTextBox2));

 		searchTextBox2.click();
 		//			Actions act=new Actions(driver);
 		//			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys("Airdope").perform();
 		//			act.sendKeys("Airdope").perform();
 		searchTextBox2.sendKeys("Airdope");
 	}
 	public void airdopes()
 	{

 		WebDriverWait wait=new WebDriverWait(driver,(30));
 		wait.until(ExpectedConditions.visibilityOf(airdopes));
 		airdopes.click();
 	}



}
