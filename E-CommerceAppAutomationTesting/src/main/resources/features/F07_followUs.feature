@smoke
Feature: F07_followUs | users could open followUs links
  Scenario: user opens facebook link
    When user clicks on Facebook Icon
    Then Facebook page is opened
  Scenario: user opens twitter link
    When user clicks on Twitter Icon
    Then Twitter page is opened
  Scenario: user opens rss link
    When user clicks on rss Icon
    Then rss page is opened
  Scenario: user opens youtube link
    When user clicks on Youtube Icon
    Then Youtube page is opened
