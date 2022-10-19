package pom;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics._1_AutoConstant;
import generics._2_BaseTest;
import generics._3_ExcelLibrary;
import generics._4_BasePage;

public class CreateDeleteCustomer extends _4_BasePage implements _1_AutoConstant {
	public WebDriver driver;
			@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
			private WebElement customerName;			
			
			@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
			private WebElement customerDescription;
			
			@FindBy(xpath="//div[.='Create Customer']")
			private WebElement createButton;
			
			@FindBy(xpath="(//div[@class='editButton'])[1]")
			private WebElement editButton;
				
			@FindBy(xpath="(//div[.='ACTIONS'])[1]")
			private WebElement actionsButton;
					
			@FindBy(xpath="(//div[.='Delete'])[2]")
			private WebElement deleteButton;
			
			@FindBy(xpath="//span[.='B']/..")
			private List<WebElement> suggestions;
			
			@FindBy(xpath="//div[@class='emptySelection']")
			private WebElement copy;
			@FindBy(xpath="(//div[@class='searchInputPlaceholder'])[15]")
			private WebElement copytext;
			
			@FindBy(xpath="//span[.='Delete permanently']")
			private WebElement deletePermanently;
			
			public CreateDeleteCustomer(WebDriver driver)
			{ this.driver=driver;
				PageFactory.initElements(driver, this);
			}
			
			public void createCustomerMethod() throws InterruptedException, IOException, AWTException			
			{
				Thread.sleep(3000);
				String a=_3_ExcelLibrary.getCellValue(sheet_name_customer, 1, 0);
				sendKeys(customerName, a);
				String b=_3_ExcelLibrary.getCellValue(sheet_name_customer, 1, 1);
				sendKeys(customerDescription, b);
				click(copy);
				Thread.sleep(3000);
				robotEnterB();
				Thread.sleep(2000);
				autosuggenstions(suggestions, _3_ExcelLibrary.getCellValue(sheet_name_customer, 1, 2));
				click(createButton);
				
			}
			
			public void deleteCustomerMethod() throws InterruptedException, AWTException
			{
				
				Thread.sleep(5000);
				click(editButton);
				Thread.sleep(2000);
				javascriptclick(driver, actionsButton);
				Thread.sleep(1000);
				javascriptclick(driver, deleteButton);
				Thread.sleep(1000);
				javascriptclick(driver, deletePermanently);
			}
}