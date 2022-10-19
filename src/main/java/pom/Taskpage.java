package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics._4_BasePage;

public class Taskpage extends _4_BasePage {
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNew;
	
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newCustomer;
	
	
	public Taskpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void addCustomerMethod() throws InterruptedException
	
	{
		Thread.sleep(1000);
	click(addNew);
	click(newCustomer);
	Thread.sleep(3000);
	}
}