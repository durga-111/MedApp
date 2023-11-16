package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import TestCases.GlobalVariable;

public class Loginpage {
	public WebDriver driver;
	
	By loginbutton=By.id("login");
	By userName=By.id("username");
	By passWord=By.id("password");
	By submit=By.xpath("//input[@type='submit']");
	By loginuservalidation=By.xpath("//li[@id='userModel']");
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void clickonLogin() {
		driver.findElement(loginbutton).click();
		
	}
	
	public void enterUsername(String email) {
		driver.findElement(userName).sendKeys(email);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passWord).sendKeys(password);
	}
	
	public void clickonSubmit() {
		driver.findElement(submit).click();
	}

	public void validateuserisinHomepage() {
		String expectedpagetittle=GlobalVariable.HomePageTittle;
		String actualLoginpagetittle=driver.getTitle();
		System.out.println(actualLoginpagetittle);
		if(actualLoginpagetittle.contains(expectedpagetittle)) {
			System.out.println("the user is in expected Home page");
		}
	}
	}
	
	


