package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {
	public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() throws InterruptedException {
	WebDriverManager.chromedriver().setup();		
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(GlobalVariable.url);
	Thread.sleep(1000);
		}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	} 

}
