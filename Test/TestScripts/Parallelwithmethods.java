package TestScripts;

import org.testng.annotations.Test;

public class Parallelwithmethods 
{
@Test
public void verify_a()
{
	for(int i=1;i<=10;i++)
	{
		System.out.println("a:"+i);
	}
}
public void verify_b()
{
	for( int j=11;j<=20;j++)
	{
		System.out.println("b:"+j);
	}
}

}
