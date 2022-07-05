@smoke
Feature: F04_Search | users will be able to search for products with different parameters
  Scenario: user could search using product name
    Given user search for any product like "Apple" and click Button
    And  results are shown to the user
  Scenario: user could search using sku
    When user search with "AP_MBP_13"
    Then sku is displayed on the page


