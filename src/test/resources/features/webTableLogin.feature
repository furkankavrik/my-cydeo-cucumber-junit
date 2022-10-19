Feature: User should be able to login with valid credentials

  Background: user is on login page
    Given user is on the login page of web table

  Scenario: Positive login scenario
    When user enters username "Test"
    And  user enters password "Tester"
    And user clicks on login button
    Then user should see url contains orders


  Scenario: Positive login scenario
    When user enters username "Test" password "password" and click.
    Then user should see url contains orders



  #: Login scenario using maps/ alternative practice
  Scenario: User should be able to see all 12 months in months dropdown
    When User enters below credentials
      | username | Test |
      | password | Tester |
    Then user should see url contains orders