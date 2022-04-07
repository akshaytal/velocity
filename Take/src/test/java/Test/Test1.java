package Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pages.PageClass;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(utility.screenshot.class)

public class Test1 {
	public static WebDriver driver;
	@BeforeClass
	public void launh() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
	}
         @Test
         public void testcase() {
        	 PageClass pl=new PageClass(driver);
        	 pl.login("aks@gmail.com","123456");
        	 
        	 Assert.assertTrue(false);
        	 
         }


}
