package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SignUpPage  {
	public WebDriver driver;
	String url="http://localhost:8080/medicare1/";
	By firstname=By.id("firstName");
	By lastname=By.id("lastName");
	By emailId=By.id("email");
	By contactnumber=By.id("contactNumber");
	By password=By.id("password");
	By signupbutton=By.id("signup");
	By ConfirmPassword=By.id("confirmPassword");
	
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
	}
	

/*	public void launchApp(String url) throws Exception {
		 driver.get(url);
		 Thread.sleep(3000);
	 } */
	
	
	 
	public void clickonSignUp() throws InterruptedException {
		driver.findElement(signupbutton).click();
		Thread.sleep(1000);
	}

	public void enterFirstName(String fname) {
		driver.findElement(firstname).sendKeys(fname);
		
	}
	
	public void enterlastname(String lname) {
		driver.findElement(lastname).sendKeys(lname);
		
	}
	
	public void enterEmailID(String email) {
		driver.findElement(emailId).sendKeys(email);
		
	}
	
	public void entercontactnum(String contnum) {
		driver.findElement(contactnumber).sendKeys(contnum);
		
	}
	
	public void enterPassword(String Password) {
		driver.findElement(password).sendKeys(Password);
		
	}
	
	public void enterConfirmPasswors(String confirmpassword) {
		driver.findElement(ConfirmPassword).sendKeys(confirmpassword);
	}
	
	
	
	
	
	

}
