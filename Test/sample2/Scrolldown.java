package sample2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scrolldown {

	public static void main(String[] args) throws InterruptedException
	{
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  Thread.sleep(4000);
	  WebElement backtotop=driver.findElement(By.xpath("//span[contains(text(),'Back to top')]"));
      Actions act=new Actions(driver);
      WebDriverWait wait=new  WebDriverWait(driver,Duration.ofSeconds(10));//explicit wait
      wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[contains(text(),'Back to top')]")));
      act.scrollToElement(backtotop).perform();
     //.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
	}

}
