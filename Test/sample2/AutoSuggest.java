package sample2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest {

	public static void main(String[] args) throws AWTException {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("cog");
		  List<WebElement> l=driver.findElements(By.xpath("//span[contains(text(),'cog']"));
		  Robot rbt=new Robot();
		  
		  rbt.keyPress(KeyEvent.VK_DOWN);
		  rbt.keyPress(KeyEvent.VK_DOWN);
		  for(int i=0;i<=l.size()-1;i++)
		  {
			  if(l.get(i).getText().equals("cognizant bankrupt"))
			  {
				   System.out.println(l.get(i).getText());
				   rbt.keyPress(KeyEvent.VK_ENTER);
				   break;
			  }
			  else
			  {
				  rbt.keyPress(KeyEvent.VK_DOWN);
			  }
		  }
		  
			  
	  }

		  
		  
		  
		  
		  
		  
		  

	}


