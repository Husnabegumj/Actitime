package TestScripts;

import org.testng.annotations.Test;

public class Dependsonmethod
{
	@Test(dependsOnMethods = {"verify_Add_cart"})
	public void verify_amazon_payment() throws InterruptedException
	{
		Thread.sleep(1000);
	}

	@Test
	public void verify_Add_cart() throws InterruptedException
	{
		System.out.println("verify_Add_cart");
		Thread.sleep(1000);
	}
}
