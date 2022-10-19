package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypesOfWorkPage 
{
	public WebDriver driver;
	
	@FindBy(xpath = "//span[.='Create Type of Work']")
	private WebElement createtypeofworkButton;
	
	@FindBy(xpath = "//a[.='official']/../..//a[contains(text(),'delete')]")
	private WebElement deleteLink;
	
	public TypesOfWorkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createtypeofworkMethod()
	{
		createtypeofworkButton.click();
	}
	
	public void deleteMethod()
	{
		deleteLink.click();
	}
	
	public void acceptMethod()
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
}