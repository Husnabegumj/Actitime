package sample2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
	driver.findElement(By.xpath("//div[normalize-space()='Login']")).click();
	WebElement users=driver.findElement(By.xpath("//a[@class='content users']//img[@class='sizer']"));
	Actions act=new Actions(driver);
	act.contextClick(users).perform();
	//for Key board operations use Robot class
	Robot rbt=new Robot();
	rbt.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	rbt.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(2000);
	rbt.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
     Set<String> id=driver.getWindowHandles();
    Iterator<String>it=id.iterator();
    String parent_id=it.next();
    String child_id=it.next();
    driver.switchTo().window(child_id);
   // Thread.sleep(2000);
    //driver.findElement(By.xpath(""));

	}

}
