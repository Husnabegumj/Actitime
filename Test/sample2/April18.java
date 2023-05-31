package sample2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class April18 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		WebElement un=driver.findElement(By.name("username"));
		WebElement pwd=driver.findElement(By.name("pwd"));
		WebElement lgn=driver.findElement(By.id("loginButton"));
		un.sendKeys("admin");
		pwd.sendKeys("manager");
		lgn.click();
		Thread.sleep(2000);
	//	List <WebElement> link=driver.findElements(By.xpath("//a"));
		
//		for(int i=0;i<=link.size()-1;i++)//using for loop for getting text from the link,then all the text is displayed with spaces
//		{
//			System.out.println(link.get(i).getText());
//			if(!link.get(i).getText().trim().isBlank()||link.get(i).getText().startsWith(""))//using if condition for removing blank spaces//
//             {
//            	 System.out.println(link.get(i).getText());
//	
//              }
//		}
//		
		//driver.findElement(By.xpath("//td[@class='logoCell']//div[3]//img[1]")).click();
		 
		driver.findElement(By.xpath("//a[@class='content administration']//img[@class='sizer']")).click();
		


	}

}
