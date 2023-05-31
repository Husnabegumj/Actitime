package sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		driver.findElement(By.xpath("//body//input")).sendKeys("aaaa");//edit boc
		driver.switchTo().frame(driver.findElement(By.id("frame3")));
		driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().frame(driver.findElement(By.id("frame2")));
		WebElement animal=driver.findElement(By.className("col-lg-3"));
		Select sel=new Select(animal);
		Thread.sleep(2000);
		sel.selectByValue("babycat");
		
		

	}

}
