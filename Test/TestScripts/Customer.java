package TestScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utility.Capturescreenshot;

public class Customer extends Base
{
@Test(dataProvider="createcustomer",dataProviderClass =Dataprovider.Customer.class)

public void verify_create_customer(String Customer_name,String Customer_description) throws InterruptedException, IOException
{

	Pageobjects.Customer cust=new Pageobjects.Customer(driver);
	
	Thread.sleep(2000);
	
	cust.gettask().click();
	Thread.sleep(1000);
	cust.getproject_customer().click();
	Thread.sleep(1000);
	cust. getcreate_newcustomer().click();
	Thread.sleep(500);
    cust. getname().sendKeys(Customer_name);
    Thread.sleep(1000);
	cust. getdescription().sendKeys(Customer_description);
	cust.getcreatecustomer_bttn().click();
	new Capturescreenshot(). WindowsScreenshot("customercreation_"+Customer_name, driver);
	
	log.info("customercreation_"+Customer_name+"succesfull");

	
	

}
	
}


