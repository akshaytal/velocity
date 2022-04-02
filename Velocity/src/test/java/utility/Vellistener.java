package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Vtest.VelTest;

public class Vellistener extends VelTest implements ITestListener {
   
	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File cap=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"\\velocity\\vel1.png");
		try {
			FileHandler.copy(cap, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				
				
				
				
				
				}

}
