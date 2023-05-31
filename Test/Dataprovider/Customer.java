package Dataprovider;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import Utility.Tofetchdatainarrayformat;

public class Customer
{
@DataProvider(name="createcustomer")
public Object[][] createcustomer() throws FileNotFoundException, IOException
{
	return new Tofetchdatainarrayformat().Readdata();
	
}
}
