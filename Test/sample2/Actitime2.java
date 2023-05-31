package sample2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime2 {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		
		
		WebElement un=driver.findElement(By.name("username"));
	WebElement pwd=driver.findElement(By.name("pwd"));
		WebElement lgn=driver.findElement(By.id("loginButton"));
		
		
//		un.sendKeys("admin");
//		pwd.sendKeys("manager");
//		lgn.click();
//		File src=pwd.getScreenshotAs(OutputType.FILE);//taking screen shot for particular module
//		File dest=new File("C:\\screenshot\\pwd.png");
//		FileUtils.copyFile(src, dest);
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;//taking screen shot for whole page
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\screenshot\\home2.png");
		FileUtils.copyFile(src, dest);


	}

}
