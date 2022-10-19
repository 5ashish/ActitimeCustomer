package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics._4_BasePage;

public class Homepage extends _4_BasePage
{
	public WebDriver driver;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logout;
	
	
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement tasks;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settings;
	
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void logoutMethod()
	{
		javascriptclick(driver, logout);
		
	}
	public void taskMethod()
	{
		tasks.click();
	}
	

	public void settingsMethod()
	{
		settings.click();
	}
}
