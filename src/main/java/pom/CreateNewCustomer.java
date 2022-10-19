package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics._1_AutoConstant;
import generics._3_ExcelLibrary;
import generics._4_BasePage;

public class CreateNewCustomer extends _4_BasePage implements _1_AutoConstant {
	
			@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
			private WebElement customerName;			
			
			@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
			private WebElement customerDescription;
			
			@FindBy(xpath="//div[.='Create Customer']")
			private WebElement createButton;
			
			public CreateNewCustomer(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			public void createCustomerMethod() throws IOException			
			{
				sendKeys(customerName, _3_ExcelLibrary.getCellValue(sheet_name_customer, 1, 0));
				sendKeys(customerDescription, _3_ExcelLibrary.getCellValue(sheet_name_customer, 1, 1));
				click(createButton);
			}
			
}