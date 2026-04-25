Feature: Validate Login Functionalities

  Developer: Andrei
  Tester: Vladimir
  site: https://www.saucedemo.com/

#  Given - Precondition
#  Then - Result
#  When - Actions by user

#  Background:
#    Given user open website
#    Then user is on login page

  @Regression
  Scenario: Verify user can login with valid credentials

    Given user open website
    Then user is on login page
    When user login with username "standard_user" and password "secret_sauce"
    Then verify user is on homepage

  Scenario Outline: Verify user can not login with invalid credentials

    Given user open website
    Then user is on login page
    When user enters invalid username "<username>" and invalid password "<password>"
    Then login is unsuccessful

    Examples:
      | username | password |
      | Focus    | 1234     |
      | Andrie   | 1234     |
      | Arslan   | 1234     |
