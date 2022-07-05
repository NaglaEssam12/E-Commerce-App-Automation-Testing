#@smoke

Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user select gender type
    And user enter "Naglaa" and "Essam" name
    And user enter date of birth
    And user enter "naglaa6@gmail.com"
    And user enter "testing" and "testing" password
    And user click on register button
    Then user registered successfully

