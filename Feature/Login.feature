#gherkin 
Feature: Login Action
@Login
Scenario: Successful Login with Valid Credentials
Given User is on Home Page
When User Navigate to LogIn Page
And User enters UserName and Password
Then Message displayed Login SuccessfullyScenario: Successful Logout
When User Logout from the Application
Then Message displayed  Successfully