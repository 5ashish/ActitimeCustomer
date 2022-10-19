package generics;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class _5_Screenshot implements ITestListener// make an error in base test class
{
	public void onTestSkipped(ITestResult result)
	{
		TakesScreenshot ts=(TakesScreenshot)_2_BaseTest.driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		
		String name=result.getName();
		Date today=Calendar.getInstance().getTime();	
		String date=today.toString().replaceAll(":", "-");
//		Calendar.getInstance().getTime().toString().replaceAll(":", "-");
		File destfile=new File("./skipscreenshot/" +name +date+ ".png");
		
		//FileUtils.copyFile(srcfile, destfile);
		
		try {
				FileUtils.copyFile(srcfile, destfile);//FileUtils requires selenium-server-standalone-2.52.0
			} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}