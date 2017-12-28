Feature: Test Facebook smoke Login 
 Scenario: Login with valid credentials
  Given Open FireFox and open the application
  When I enter valid "meeragirish@yahoo.com" and "crack11plus"
  Then user should be able to login successfully