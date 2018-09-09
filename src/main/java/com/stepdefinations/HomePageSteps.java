package com.stepdefinations;



import com.pages.HomePage;
import com.pages.LoginPage;
import com.util.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageSteps  extends TestBase
{
	LoginPage lp;
	HomePage hp=new HomePage();
	
	
	@Given("^user opens  the browser$")
	public void user_opens_the_browser() throws Throwable
	{
		TestBase.initilization();
	    
	}

	@Then("^user is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable
	{
	   lp=new LoginPage();	
	   String pagetitle=lp.verifyLoginpageTitle();
	   Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", pagetitle);
	}

	@Then("^user logs into Applicatin$")
	public void user_logs_into_Applicatin() throws Throwable
	{
		hp=lp.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}


	@Then("^Validate Home Page Title$")
	public void validate_Home_Page_Title() throws Throwable 
	{
		String hometitle=hp.verifyhomepageTitle();
		Assert.assertEquals("CRMPRO", hometitle);
	   
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable 
	{
		driver.close();  
	}
}
