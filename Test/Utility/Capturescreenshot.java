package Utility;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import TestScripts.Base;

public class Capturescreenshot extends Base
{
 public	void WindowsScreenshot(String name,WebDriver driver) throws IOException
	{
		TakesScreenshot sh=(TakesScreenshot)driver;
	File src=sh.getScreenshotAs(OutputType.FILE);
	File dest=new File(".\\Screenshot\\"+name+".png");
	FileUtils.copyFile(src,dest);
	}

}
