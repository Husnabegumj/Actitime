package TestScripts;

import org.testng.annotations.Test;

public class GroupExecution 
{
@Test(groups= {"regression","smoke"})
public void verify_a()
{
	System.out.println("a test");
}

@Test(groups= {"regression"})
public void verify_b()
{
	System.out.println("b test");	
}
@Test(groups= {"regression","smoke"})
public void Verify_c()
{
	System.out.println("c test");
}
}
