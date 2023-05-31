package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert extends Base
{
	@Test
	public void Verify_create_customer() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@class='content tasks']//img[@class='sizer']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Projects & Customers']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='ext-gen7']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("zohaib");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		WebElement mssg=driver.findElement(By.className("successmsg or @class='errormsg']"));
		//Assert.assertEquals(mssg.getText(),"Customer \"zohaib\" has been successfully created.");//hard assert
		sft.assertEquals(mssg.getText(),"Customer \"zohaib\" has been successfully created.");//soft assert
		
	}
   
}
