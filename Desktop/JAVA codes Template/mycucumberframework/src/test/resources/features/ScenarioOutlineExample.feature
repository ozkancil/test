@datatables3
Feature: scenario outline example
  Scenario: testing the data tables web page
    Given User is on the datatables homepage
    When User clicks on new button
    And User enters first name
    And User enters last name
    And User enters position
    And User enters office
    And user enters extension
    And user enters start date
    And user enters salary
    And  clicks create button
    And user enters first name to the searchbox
    Then verify that the user sees first name in the searchBox
