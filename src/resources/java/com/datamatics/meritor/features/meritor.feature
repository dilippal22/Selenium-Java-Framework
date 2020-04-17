Feature: Verifying Page Title 

@SmokeTest @SanityTest 
Scenario Outline: Verify Login Page Title 

	Given processor user is login page 
	Then processor user enters "<username>" and "<password>" 
	
	Examples: 
		|username|password|
		|puser2|Sysadmin@123|
		
		@SanityTest @RegressionTest 
		Scenario: Verify Home Page Title 
		
			Given processor user is on home page