package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Base.Base;
import testdata.testdata;

public class Page4Objects extends Base {
	
	 testdata td=new testdata ();


	//Web element Button
	@FindBy(xpath ="//button[@id='ajaxButton']")
	WebElement Button;
		
	//Web element text
	@FindBy(xpath = "//p[@class='bg-success']")
	WebElement text;
	
	//Init Elements
	public Page4Objects() {
		PageFactory.initElements(driver, this);
	}
	
	/*Mehod*/
	public void Page4() {
		WebDriverWait wait=new WebDriverWait(driver,30);
		Button.click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='bg-success']")));
	    text.isDisplayed();
	    
	}
}
