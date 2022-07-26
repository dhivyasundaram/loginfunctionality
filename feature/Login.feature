Feature: Leaftaps login functionality
Scenario: Test login functionality with positive credential
Given Open the chrome browser
And Load the application url
And Enter the username as Demaosalesmanager
And Enter the password
When click on login button
Then Home page should be displayed
