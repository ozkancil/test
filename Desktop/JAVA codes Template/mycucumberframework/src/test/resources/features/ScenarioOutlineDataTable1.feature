@datatables4
Feature: scenario outline example
  Scenario: testing the data tables web page
    Given User is on the datatables homepage
    When User clicks on new button
    And User enters firstname "first name"
    And User enters lastname "last name"
    And User enters position "QA"
    And User enters office "London"
    And user enters extension "555"
    And user enters start date "2020-05-06"
    And user enters salary "90000"
    And  clicks create button
    And user enters first name "first name" to the searchbox
    Then verify that the user sees first name "first name" in the searchBox
