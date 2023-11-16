package TestCases;

import org.testng.annotations.Test;

import pages.Loginpage;

public class LoginpageTest extends CommonMethods {
	
	Loginpage lp;
	
	@Test
	public void loginTestcase() {
		lp=new Loginpage(driver);
		lp.clickonLogin();
		lp.enterUsername("ab@user.com");
		lp.enterPassword("ab123");
		lp.clickonSubmit();
		lp.validateuserisinHomepage();
		
	}
	

}
