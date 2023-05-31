package TestScripts;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

import Pageobjects.Login;
import io.opentelemetry.api.logs.Logger;

public class Base
{
	 public WebDriver driver=null;
	 public Logger log=Logger.getLogger("devpinoyLogger");
	SoftAssert sft=new SoftAssert();
	
	@BeforeMethod
	public void login()
	{
		Login lgn=new Login(driver);
		lgn.username().sendKeys("admin");
		lgn.password().sendKeys("manager");
		lgn.login_button().click();
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		Thread.sleep(1000);
	}
	
	
	
	@BeforeClass
	@Parameters({"browser","url"})
	public void launchbrowser(String browser, String url)
	{
		
		System.out.println("launch_browser");
		switch(browser)
		{
		case "chrome":
	    driver=new ChromeDriver();
	    break;
		case "edge":
		driver=new EdgeDriver();
		break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		
		}
		driver.get(url);
		
	}
	@AfterClass
	public void closebrowser()
	{
		
		System.out.println("close_browser");
		driver.close();
		sft.assertAll();
	}
	@BeforeTest
	public void dbconnection()
	{
	System.out.println("dbconnection");
	
	}
	@AfterTest
	public void closedbconnection()
	{
		System.out.println("closedbconnection");
	}

}
