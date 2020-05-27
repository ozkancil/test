@datatable
Feature: Single data table
  Scenario Outline: TC01_google search table
    Given user is on google page
    And user searches for "<value>"
    Then verify the result has "<value>"


    Examples: Test Data
    |value|
    |iphone|
    |Istanbul|
    |apple   |
    |orange  |
