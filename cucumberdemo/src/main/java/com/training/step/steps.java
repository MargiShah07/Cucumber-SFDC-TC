package com.training.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.*;

public class steps 
{
	public static WebDriver driver;
	@Given("^Application URL$")
	public void application_URL() throws Throwable 
	{
		// Write code here that turns the phrase above into concrete actions
		System.out.println("TestCase1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilay\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println("Salesforce Application Page Displayed.");
		//throw new PendingException();
	}

	@When("^user enter username$")
	public void user_enter_username() throws Throwable 
	{
		// Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.xpath("//input[@id='username']"));
		UserName.sendKeys("nilay92000@yahoo.com");
		System.out.println("User entered UserName.");
		//throw new PendingException();
	}

	@When("^enter password$")
	public void enter_password() throws Throwable 
	{
		// Write code here that turns the phrase above into concrete actions
		WebElement Password = driver.findElement(By.xpath("//input[@name='pw']"));
		Password.sendKeys("mnshah@09");
		System.out.println("User entered Password.");
		//throw new PendingException();
	}

	@When("^clear password$")
	public void clear_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement Password = driver.findElement(By.xpath("//input[@name='pw']"));
		Password.clear();
		System.out.println("Password got cleared.");
		//throw new PendingException();
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable 
	{
		// Write code here that turns the phrase above into concrete actions
		WebElement Login = driver.findElement(By.xpath("//input[@id='Login']"));
		Login.click();
		System.out.println("User Clicked login button.");

	}


	@Then("^Error Message Should Display\\.$")
	public void error_Message_Should_Display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement ErrorMsg = driver.findElement(By.xpath("//div[@id='error']"));
		System.out.println(ErrorMsg.getText());
		driver.close();
		//driver.quit();
		//throw new PendingException();
	}


	@Given("^Launch SFDC application$")
	public void launch_SFDC_application() throws Throwable {

		// Write code here that turns the phrase above into concrete actions
		System.out.println("TestCase2");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilay\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println("Salesforce Application Page Displayed.");
		//throw new PendingException();
	}

	@When("^Enter UserName$")
	public void enter_UserName() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement un = driver.findElement(By.xpath("//input[@id='username']"));
		un.sendKeys("nilay92000@yahoo.com");
		System.out.println("User entered UserName.");
		//throw new PendingException();
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("mnshah@09");
		//throw new PendingException();
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement Login = driver.findElement(By.xpath("//input[@id='Login']"));
		Login.click();
		System.out.println("User Clicked login button.");
		driver.close();
		//throw new PendingException();
	}

	@Given("^SFDC URL$")
	public void sfdc_URL() throws Throwable 
	{
		// Write code here that turns the phrase above into concrete actions
		System.out.println("TestCase3");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilay\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println("Salesforce Application Page Displayed.");
		//throw new PendingException();
	}

	@When("^Enter valid UserName$")
	public void enter_valid_UserName() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.xpath("//input[@id='username']"));
		UserName.sendKeys("nilay92000@yahoo.com");
		System.out.println("User entered UserName.");
		//throw new PendingException();
	}

	@When("^Enter valid password$")
	public void enter_valid_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement Password = driver.findElement(By.xpath("//input[@name='pw']"));
		Password.sendKeys("mnshah@09");
		System.out.println("User entered Password.");
		//throw new PendingException();
	}

	@When("^Check Remember Me Checkbox$")
	public void check_Remember_Me_Checkbox() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement RememberMe = driver.findElement(By.xpath("//input[@id='rememberUn']"));
		RememberMe.click();
		System.out.println("Remember Me checkbox checked.");
		//throw new PendingException();
	}

	@Then("^Click On Submit button$")
	public void click_On_Submit_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement Login = driver.findElement(By.xpath("//input[@id='Login']"));
		Login.click();
		System.out.println("User Clicked login button.");
		//throw new PendingException();
	}

	@Then("^Click on UserMenu Dropdown$")
	public void click_on_UserMenu_Dropdown() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement UserMenu = driver.findElement(By.xpath("//div[@id='userNavButton']"));
		UserMenu.click();
		//throw new PendingException();
	}

	@Then("^Click Logout button$")
	public void click_Logout_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement Logout = driver.findElement(By.xpath("//a[@title='Logout']"));
		Logout.click();
		driver.close();
		//throw new PendingException();
	}
	
	@Given("^SFDC Application$")
	public void sfdc_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("TestCase4a");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilay\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println("Salesforce Application Page Displayed.");
		//throw new PendingException();
	}

	@When("^User Click on Forgot Password$")
	public void user_Click_on_Forgot_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement forgotpw = driver.findElement(By.linkText("Forgot Your Password?"));
		forgotpw.click();
		System.out.println("User clicked on forgot password.");
		//throw new PendingException();
	}

	@When("^User enter email address$")
	public void user_enter_email_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement forgetUn = driver.findElement(By.xpath("//input[@id='un']"));
		forgetUn.sendKeys("nilay92000@yahoo.com");
		//throw new PendingException();
	}

	@Then("^user clicked on Continue button$")
	public void user_clicked_on_Continue_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement continues = driver.findElement(By.xpath("//input[@id='continue']"));
		continues.click();
		//throw new PendingException();
	}

	@Then("^Password reset message displayed\\.$")
	public void password_reset_message_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Pass Reset Message Dispayed.");
	    driver.close();
		//throw new PendingException();
	}

	@Given("^Launch the Application$")
	public void launch_the_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("TestCase4b");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilay\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println("Salesforce Application Page Displayed.");
		//throw new PendingException();
	}

	@When("^Enter wrong Username$")
	public void enter_wrong_Username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.xpath("//input[@id='username']"));
		UserName.sendKeys("nilay9200@yahoo.com");
		System.out.println("User entered UserName.");
		//throw new PendingException();
	}

	@When("^Enter Wropng password$")
	public void enter_Wropng_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Password = driver.findElement(By.xpath("//input[@name='pw']"));
		Password.sendKeys("mnsha@09");
		//throw new PendingException();
	}

	@Then("^Click on login button to login to SFDC Application$")
	public void click_on_login_button_to_login_to_SFDC_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Login = driver.findElement(By.xpath("//input[@id='Login']"));
		Login.click();
		//throw new PendingException();
	}

	@Then("^Error Message Should diplay\\.$")
	public void error_Message_Should_diplay() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement ErrorMsg = driver.findElement(By.xpath("//div[@id='error']"));
		System.out.println(ErrorMsg.getText());
		driver.close();
		//throw new PendingException();
	}

	@Given("^Launch the Application of SFDC$")
	public void launch_the_Application_of_SFDC() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("TestCase5");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilay\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println("Salesforce Application Page Displayed.");
		//throw new PendingException();
	}
	
	
	@Given("^Login to SFDC Account$")
	public void login_to_SFDC_Account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.xpath("//input[@id='username']"));
		UserName.sendKeys("nilay92000@yahoo.com");
		System.out.println("User entered UserName.");
		WebElement Password = driver.findElement(By.xpath("//input[@name='pw']"));
		Password.sendKeys("mnshah@09");
		System.out.println("User entered Password.");
		
		//throw new PendingException();
	}

	@Then("^Check for options in dropdown like My Profile,My Settings,Developer Console,Logout etc\\.$")
	public void check_for_options_in_dropdown_like_My_Profile_My_Settings_Developer_Console_Logout_etc() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement MyProf = driver.findElement(By.xpath("//a[@title='My Profile']"));
		if(MyProf.isDisplayed())
		{
			System.out.println("My Profile tab is displayed.");
		}
		else
		{
			System.out.println("My Profile tab is not displayed.");
		}
		
		WebElement MySettings = driver.findElement(By.xpath("//a[@title='My Settings']"));
		if(MySettings.isDisplayed())
		{
			System.out.println("My Settings tab is displayed.");
		}
		else
		{
			System.out.println("My Settings tab is not displayed.");
		}
		
		WebElement DevlpConsole = driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']"));
		if(DevlpConsole.isDisplayed())
		{
			System.out.println("Developer Console tab is displayed.");
		}
		else
		{
			System.out.println("Developer Console tab is not displayed.");
		}
		
		WebElement logout = driver.findElement(By.xpath("//a[@title='Logout']"));
		if(logout.isDisplayed())
		{
			System.out.println("Logout tab is displayed.");
		}
		else
		{
			System.out.println("Logout tab is not displayed");
		}
		driver.close();
		//throw new PendingException();
	}

	@Given("^SFDC Application Launched$")
	public void sfdc_Application_Launched() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		//throw new PendingException();
	}
	
	@Given("^Login with valid username-password$")
	public void login_with_valid_username_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		//throw new PendingException();
	}

	@When("^Click on UserMenu button$")
	public void click_on_UserMenu_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		//throw new PendingException();
	}

	@When("^Click on My Settings button$")
	public void click_on_My_Settings_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		//throw new PendingException();
	}

	@Then("^Click on Personal option button$")
	public void click_on_Personal_option_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		//throw new PendingException();
	}

	@Then("^Click on login History$")
	public void click_on_login_History() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		//throw new PendingException();
	}

	@Then("^Click on Display & Layout button$")
	public void click_on_Display_Layout_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		//throw new PendingException();
	}

	@Then("^Click on Email link$")
	public void click_on_Email_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		//throw new PendingException();
	}

	@Then("^Click on my email settings link under Email link$")
	public void click_on_my_email_settings_link_under_Email_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		//throw new PendingException();
	}

	@Then("^Click on Calender & Reminders button$")
	public void click_on_Calender_Reminders_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		//throw new PendingException();
	}
}
