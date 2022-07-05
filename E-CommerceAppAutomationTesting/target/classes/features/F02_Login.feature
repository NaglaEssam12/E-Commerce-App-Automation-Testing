@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
    Given user go to login page
    When user enter "naglaa6@gmail.com" and "testing" in login page
    And user click on login button
    Then user could login successfully