package Page4TestCases;

import org.testng.annotations.Test;

import Base.Base;
import PageObjects.Page4Objects;
import testdata.testdata;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class WaitsPage4TestCases extends Base {
	
	Page4Objects pw;
	testdata td ;

 
  @BeforeMethod
  public void beforeMethod()  {
		
	    openApplication();
		pw = new Page4Objects();
		td = new testdata();
	}
  
  @Test
  public void TestWaits4() {
	  
	  pw.Page4();
	  String actualtext=driver.findElement(By.xpath("//p[@class='bg-success']")).getText();
	  Assert.assertEquals(actualtext,td.expectedtext);
	  System.out.println(actualtext);
		 
  }
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
  }  
 }

