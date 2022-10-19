package test;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import generics._2_BaseTest;
import pom.CreateDeleteCustomer;
import pom.CreateNewCustomer;
import pom.Homepage;
import pom.LoginPage;
import pom.Taskpage;


public class LoginCustomerLogout extends _2_BaseTest
{
	@Test
	public void login() throws InterruptedException, IOException, AWTException
	{
		System.out.println("login method is executing");
		LoginPage login=new LoginPage(driver);
		login.loginMethod();
		Thread.sleep(3000);
		Homepage home=new Homepage(driver);
		home.taskMethod();
		
		Taskpage task=new Taskpage(driver);
		task.addCustomerMethod();
		CreateDeleteCustomer c= new CreateDeleteCustomer(driver);
		c.createCustomerMethod();//
		c.deleteCustomerMethod();
		
		home.logoutMethod();
		System.out.println("login method executed");
		
	}
}