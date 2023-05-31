package sample2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class Acticontextclik
{
public static void main(String[] args) throws InterruptedException
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
Thread.sleep(2000);
WebElement users=driver.findElement(By.xpath("//a[@class='content users']//img[@class='sizer']"));
Actions act=new Actions(driver);
act.moveToElement(users).perform();
act.contextClick().perform();



}
}

