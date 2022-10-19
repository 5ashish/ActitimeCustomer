
package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _2_BaseTest implements _1_AutoConstant {
	public static WebDriver driver;

	@BeforeSuite
	public void executionstart() {
		System.out.println("execution started");
	}
@Parameters("a")
	@BeforeMethod
	public void setup(String b) {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();

		
if (b.equalsIgnoreCase("chrome"))// compare with value {
		  {
			  WebDriverManager.chromedriver().setup(); driver=new ChromeDriver();
		  System.out.println("chrome"); 
		  }
		 
 else if (b.equalsIgnoreCase("firefox"))
		 {
	 
			  WebDriverManager.firefoxdriver().setup(); driver=new FirefoxDriver();
		  System.out.println("firefox"); 
		  } 
else if(b.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();  driver=new EdgeDriver();
		  System.out.println("edge"); }
		 
		driver.manage().window().maximize();
		driver.get(url);

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@AfterSuite
	public void executioncomplete() {
		System.out.println("exceution completed");
	}
}