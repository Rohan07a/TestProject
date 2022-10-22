package Pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AirdopesPage {


	@FindBy(xpath=("(//span[contains(text(),'boAt Airdopes 121v2 True Wireless Earbuds with Upto 14 Hours')])[3]"))
	private WebElement boatAirdopes;
	
	public AirdopesPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void openBoatAirdopes()
	{
		boatAirdopes.click();

	}
	
	
	

}
