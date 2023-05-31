package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer 
{
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='content tasks']//img[@class='sizer']")
    private WebElement task;
	
	
	@FindBy(xpath="//a[normalize-space()='Projects & Customers']")
	private WebElement project_customer;
	
	@FindBy(xpath="//span[normalize-space()='Create Customer']")
	private WebElement create_newcustomer;
	
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement name;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement description;
	
	@FindBy(xpath="//input[@name='createCustomerSubmit']")
	private WebElement createcustomer_bttn;
	
	
	public WebElement gettask()
	{
		return task;
		
	}
	
	public WebElement getproject_customer()
	
	{
		return project_customer;
	}
	public WebElement getcreate_newcustomer()
	{
		return  create_newcustomer;
	}
	public WebElement getname()
	{
		return name;
	}
	public WebElement getdescription()
	{
		return description;
	}
	public WebElement getcreatecustomer_bttn()
	{
		return createcustomer_bttn;
		
	}
	public Customer(WebDriver driver)//constructor
	{
		PageFactory.initElements(driver, this);
	}
}
