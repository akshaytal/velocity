package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageClass {
	
	@FindBy(xpath="//*[@id='email']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath="//*[@name='login']")
	private WebElement login;
	
	public  PageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void login(String user,String Pass) {
		username.sendKeys(user);
		password.sendKeys(Pass);
		login.click();
	
		
	}

}
