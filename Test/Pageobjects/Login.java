package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{
	WebDriver driver;
@FindBy(name="username")
private WebElement username;//encapsulation

@FindBy(name="pwd")
private WebElement password;

@FindBy(id="loginButton")
private WebElement lgn;




public WebElement username()//method with return type
{
	return username;
}
public WebElement password()//method with return type 
{
	return password;
}
public WebElement login_button()
{
	return lgn;
}
public  Login(WebDriver  driver)//constructor
{
   PageFactory.initElements(driver, this);	
}

}
