package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import generics._1_AutoConstant;
import generics._3_ExcelLibrary;
import generics._4_BasePage;
import generics._6_HighlightElement;
@Listeners(generics._5_Screenshot.class)
public class LoginPage extends _4_BasePage implements _1_AutoConstant {
	public WebDriver driver;
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement login;
	
	@FindBy(xpath = "//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;
	
	public LoginPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws InterruptedException, IOException
	{
		_6_HighlightElement.highlightelement(driver, username);
		username.sendKeys(_3_ExcelLibrary.getCellValue(sheet_name_login, 1, 0));
		_6_HighlightElement.highlightelement(driver, password);
		password.sendKeys(_3_ExcelLibrary.getCellValue(sheet_name_login, 1, 1));
		login.click();
		Thread.sleep(3000);
	}
	public void actitimeincMethod()
	{
		actitimeincLink.click();
	}
	
	

}
