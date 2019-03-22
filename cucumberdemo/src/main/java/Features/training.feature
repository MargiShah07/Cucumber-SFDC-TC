Feature: Verify login feature
  I want to use this feature file to verify all login

  Scenario: Navigate to SFDC
    Given Application URL
    When user enter username 
    And enter password
    And clear password
    Then click on login button
    And Error Message Should Display.

   Scenario: Login to SFDC
   	Given Launch SFDC application
   	When Enter UserName
   	And  Enter Password
   	Then Click on Login Button
   
   Scenario: Test the remember username check box 
   	Given SFDC URL
   	When Enter valid UserName
   	And Enter valid password
   	And Check Remember Me Checkbox
   	Then Click On Submit button
   	Then Click on UserMenu Dropdown
   	And Click Logout button
   
   Scenario: 4a-Test forgot password
   	Given SFDC Application
   	When User Click on Forgot Password
   	And User enter email address
   	Then user clicked on Continue button
   	And Password reset message displayed.
   	
   	Scenario: 4b-Validate Login Error Message
   		Given Launch the Application
   		When Enter wrong Username
   		And Enter Wropng password
   		Then Click on login button to login to SFDC Application
   		And Error Message Should diplay.
   		
   	Scenario: 5-Select user menu for UserName drop down
   		Given Launch the Application of SFDC
   		And Login to SFDC Account
   		When Click on UserMenu dropdown button
   		Then Check for options in dropdown like My Profile,My Settings,Developer Console,Logout etc.
   		
   	Scenario: 7-Select My Settings option from user menu for Username drop down
   		Given SFDC Application Launched
   		And Login with valid username-password
   		When Click on UserMenu button
   		And Click on My Settings button
   		Then Click on Personal option button
   		And Click on login History
   		Then Click on Display & Layout button 
   		Then Click on Email link
   		And Click on my email settings link under Email link
   		Then Click on Calender & Reminders button
   		
   		Scenario: 8-Select Developers Console option from user menu for username drop down
   			Given SFDC Application Launch
   			And enter valid uname and p
   			And click on login button
   			When User Click on UserMenu button
   			And Click on Developer Console option
   			Then CLick on close button of the developer console browser.
   			
   		Scenario: 9-Select Logout option from user menu for username drop down
   			Given SFDC Application
   			When User Enter valid uname & password
   			And click on login button
   			Then Click on logout button from usermenu dropdown
   			
   		Scenario: 10-Create an Account
   			Given Launch SFDC Application 
   			And login to SFDC Application
   			When Click on Accounts link on home page
   			Then Click on new button to create new account