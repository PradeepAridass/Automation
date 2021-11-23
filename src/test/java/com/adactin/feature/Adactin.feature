Feature: Hotel Booking Functionality

 Scenario Outline: Verify the user is able to login the application
 Given User launch the application
 When User enter the valid "<username>" in the username field
 And user enter the valid "<password>" in the password field
 And user is able to click the login button
 Then user verify the navigate to search hotel page
 
 Examples:
 	|username|password|
 	|AAA|111|
 
 @LoginPage
 Scenario: Verify the user is able to login the application
 Given User launch the application
 When User enter the valid "PradeepStar" in the username field
 And user enter the valid "123456789" in the password field
 And user is able to click the login button
 Then user verify the navigate to search hotel page