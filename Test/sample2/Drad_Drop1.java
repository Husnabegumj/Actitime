package sample2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drad_Drop1 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/dg-crop/dg-crop.html");//for image drag and drop
		WebElement drag=driver.findElement(By.xpath("//div[@class='dg-movable']"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(drag,250,250).perform();
		
//	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html");
//	
//	
////	WebElement src=driver.findElement(By.xpath("//div[@id='box1']"));s
////	WebElement dest1=driver.findElement(By.xpath("//div[@id='dropBox']"));
////	WebElement dest2=driver.findElement(By.xpath("//div[@id='dropBox2']"));
////	
////	Actions act=new Actions(driver);
////	act.dragAndDrop(src, dest1).perform();
////	act.dragAndDrop(src, dest2).perform();
////		
//   List<WebElement>source=driver.findElements(By.xpath("//div[@class='dragableBox' and contains(@id,'box')]"));
//   WebElement dest1=driver.findElement(By.xpath("//div[@id='dropBox']"));
//	WebElement dest2=driver.findElement(By.xpath("//div[@id='dropBox2']"));
//	Actions act=new Actions(driver);
//	for(int i=0;i<=source.size()-1;i++)
//	{
//	act.dragAndDrop(source.get(i), dest1).perform();
//	act.dragAndDrop(source.get(i), dest2).perform();
	
//	}
	}	

}
