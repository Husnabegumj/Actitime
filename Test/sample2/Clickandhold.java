package sample2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickandhold {
	
	

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html");
		List<WebElement>source=driver.findElements(By.xpath("//div[@class='dragableBox' and contains(@id,'box')]"));
		   WebElement dest1=driver.findElement(By.xpath("//div[@id='dropBox']"));
			WebElement dest2=driver.findElement(By.xpath("//div[@id='dropBox2']"));
			Actions act=new Actions(driver);
			for(int i=0;i<=source.size()-1;i++)
			{
			act.clickAndHold(source.get(i)).release(dest1).build().perform();
			}

	}

}
