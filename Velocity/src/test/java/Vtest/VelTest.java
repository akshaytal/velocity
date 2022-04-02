package Vtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(utility.Vellistener.class)
public class VelTest {
	public static WebDriver driver;
	@BeforeClass
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		}
	@Test(priority=1)
	public void Testcase() {
		WebElement drop=driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
		Select sel=new Select(drop);
		sel.selectByIndex(2);
			}
	
	@Test(priority=2)
	public void testa() {
		WebElement tab=driver.findElement(By.xpath("//*[@name='enter-name']"));
		tab.sendKeys("sarang");
		
		WebElement alertbtn=driver.findElement(By.xpath("//*[@id='alertbtn']"));
				alertbtn.click();
		
				Alert al=driver.switchTo().alert();
				String massage=al.getText();
				System.out.println(massage);
				if(massage.contains("sarang")) {
					System.out.println("pass");
					al.accept();
				}
				else {
					System.out.println("fail");
					al.dismiss();
				}
		
	}
	@Test(priority=3)
	public void radio() throws InterruptedException {
		WebElement rad=driver.findElement(By.xpath("//*[@value='Radio1']"));
		rad.click();
		Thread.sleep(5000);
		
	}
@Test (priority=4)
public void checkbox() throws InterruptedException {
	WebElement check=driver.findElement(By.xpath("//*[@id='checkBoxOption1']"));
	check.click();
	Thread.sleep(5000);
	Assert.assertTrue(false);
}

}
