package sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Workwithdropdown {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		
		
		WebElement un=driver.findElement(By.name("username"));
	WebElement pwd=driver.findElement(By.name("pwd"));
		WebElement lgn=driver.findElement(By.id("loginButton"));
		
		
	un.sendKeys("admin");
	pwd.sendKeys("manager");
	lgn.click();
    driver.findElement(By.xpath("//div[normalize-space()='Tasks']")).click();
    driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();//projects and customer
    //driver.findElement(By.xpath("//div[@id='ext-gen7']")).click();
	driver.findElement(By.xpath("//select[@name='selectedCustomer']")).click();
	//Select sel=new Select();
	//sel.selectByIndex(0);
	
	}

}
