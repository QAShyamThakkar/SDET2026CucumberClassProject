Feature: Validate Cart Functionalities

  Developer: Andrei
  Tester: Vladimir
  site: https://www.saucedemo.com/

#  Given - Precondition
#  Then - Result
#  When - Actions by user

  Scenario: Verify user can add product to the cart
    Given user open website
    Then user is on login page
    When user loging with credential
    Then verify user is on homepage
    When user clicks on add to cart button
    Then verify cart icon display the qty
    When user clicks on  cart button
    Then verify user is on cart page

  @Regression @Shyam
  Scenario: Verify user can remove product to the cart
    Given user open website
    Then user is on login page
    When user loging with credential
    Then verify user is on homepage
    When user clicks on add to cart button
    Then verify cart icon display the qty
    When user clicks on  cart button
    Then verify user is on cart page
    When user removes all the item
    Then the cart is empty