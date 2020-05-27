@FHCloginParameters
Feature: login feature

  Scenario: TC01_user should login with manager credentials
    Given user is on the fhctriplogin page
    And user enters valid manger username "manager2"
    And user enters valid manager password "Man1ager2!"
    And user clicks on login button
    Then verify the manager login is successful
