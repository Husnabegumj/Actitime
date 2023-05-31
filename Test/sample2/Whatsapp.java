package sample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp {

	public static void main(String[] args) throws InterruptedException
	{
		
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.whatsapp.com/");
     Thread.sleep(5000);
     driver.navigate().back();
	}

}
