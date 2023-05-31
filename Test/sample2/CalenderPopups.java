package sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopups {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Actions act=new Actions(driver);
		WebElement departure=driver.findElement(By.xpath("//span[normalize-space()='May']"));
        act.click(departure).perform();
        
	}

}
