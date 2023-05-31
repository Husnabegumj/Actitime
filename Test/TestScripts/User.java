package TestScripts;

import org.testng.annotations.Test;

public class User extends Base

{
	@Test(priority=1)
	public void verify_create_user()
	{
		System.out.println("verify_create_user");	
	}
	@ Test
	public void verify_delete_user()
	{
		System.out.println("verify_delete_user");
	}

}
