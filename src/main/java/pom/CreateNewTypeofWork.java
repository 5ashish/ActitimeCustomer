package pom;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generics._1_AutoConstant;
import generics._3_ExcelLibrary;
import generics._4_BasePage;

public class CreateNewTypeofWork extends _4_BasePage implements _1_AutoConstant
{
	public WebDriver driver;
	
	@FindBy(name="name")
	private WebElement name;
	
	@FindBy(name="active")
	private WebElement status;
	
	@FindBy(xpath="//label[.='Billable']")
	private List<WebElement> category;
	
	@FindBy(id="billingRate_input")
	private WebElement billingrate;
	
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement createbutton;

	public CreateNewTypeofWork(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void createNewTypeofWork() throws IOException {
		name.sendKeys(_3_ExcelLibrary.getCellValue(sheet_name_work,1, 0));
		String st=_3_ExcelLibrary.getCellValue(sheet_name_work,1,1);
		
		selectbyvisibletext(status , st);
		
		String cat=_3_ExcelLibrary.getCellValue(sheet_name_work,1,2);
		select(category, cat);
		sendKeys(billingrate,_3_ExcelLibrary.getCellValue(sheet_name_work,1, 3));
		click(createbutton);
		
	}
}