Feature: Validate Login Functionalities

  Developer: Andrei
  Tester: Vladimir
  site: https://www.saucedemo.com/

#  Given - Precondition
#  Then - Result
#  When - Actions by user

  Scenario: Verify user can login with valid credentials
    Given user open website
    Then user is on login page
    When user loging with credential
    Then verify user is on homepage

  Scenario: Verify user can not login with invalid credentials
    Given user open website
    Then user is on login page
    When user enters invalid credential
    Then login is unsuccessful