Feature: This feature is about log-in in existing account

  Scenario: Successful log-in
    Given I have created account
    When I select My account menu
      And I select Log in button
      And I enter valid Email address
      And I enter valid Password
      And I tap on check box to remember my log in
      And I select Log in button to access account
    Then User Account page is opened
