package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.SignUpPage;

public class SignUpPageTest extends CommonMethods{
	//public WebDriver driver;
	SignUpPage sp;
	
/*	@BeforeMethod
	public void openBrowser() throws InterruptedException {
	WebDriverManager.chromedriver().setup();		
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(GlobalVariable.url);
	Thread.sleep(2000);
	sp=new SignUpPage(driver);
		}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	} */
	
	@Test
	public void signUpTestcase() throws Exception
	{
		sp=new SignUpPage(driver);
		sp.clickonSignUp();
		sp.enterFirstName("Durga");
		sp.enterlastname("bhavani");
		sp.enterEmailID("durgaqa1993@gmail.com");
		sp.entercontactnum("7890142567");
		sp.enterPassword("durga456");
		
	}
	
	

}
