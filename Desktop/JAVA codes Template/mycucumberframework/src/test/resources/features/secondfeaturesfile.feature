@fhclogin
Feature: login feature
  Scenario: TC01_user should login with positive credentials
    Given user is on the fhctriplogin page
    And enter correct username and password
    Then verify the login is successful
