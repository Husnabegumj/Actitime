package sample2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardoperations {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
	driver.findElement(By.xpath("//div[normalize-space()='Login']")).click();
	WebElement users=driver.findElement(By.xpath("//a[@class='content users']//img[@class='sizer']"));
	Actions act=new Actions(driver);
	//act.doubleClick(users).perform();
	
	act.contextClick(users).perform();
	Robot rbt=new Robot();
	rbt.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	rbt.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	rbt.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	act.doubleClick().perform();
	Thread.sleep(2000);
	
	

	}

}
