Feature: This feature is about log-in in existing account

  Scenario: Successful log-in in existing account
    Given I have opened home page
    When I select My account drop down menu
      And I select Log in button
      And I enter valid Email address
      And I enter valid Password
      And I tap on check box to remember my log in
      And I select Log in button to access account
    Then Existing user Account page is opened
