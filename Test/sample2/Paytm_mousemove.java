package sample2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Paytm_mousemove {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		WebElement paytm_consumer=driver.findElement(By.xpath("//a[normalize-space()='Paytm for Consumer']"));
		
		Actions act=new Actions(driver);
		act.moveToElement( paytm_consumer).perform();
		
	Thread.sleep(2000);
    WebElement ticket=driver.findElement(By.xpath("//a[text()='Ticket booking']"));
    act.moveToElement(ticket).perform();
    WebElement signin=driver.findElement(By.xpath("//span[normalize-space()='Sign In']"));
    act.moveToElement(signin).perform();
   // act.click().perform();
    act.contextClick(signin).perform();
  
		
		

	}

}
