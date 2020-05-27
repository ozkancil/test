@googlesearch
Feature:Google search


  Background: user in on the google page
    Given user is on the google page



  Scenario: TC01 User searches iphone on google
    And user searches for iphone
    Then verify the result has iphone



    Scenario: TC02 User searches tea pot on google
    #  Given user clears the searchbox

      And user searches for tea pot
      Then verify the result has tea pot

