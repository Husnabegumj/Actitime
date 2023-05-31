package TestScripts;

import org.testng.annotations.Test;

public class Parallelwithclass1
{
@Test
public void verify_a()
{
	for(int i=1;i<=10;i++)
	{
		System.out.println("a:"+i);
	}
}
}
