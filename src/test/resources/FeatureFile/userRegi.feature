Feature: Validate User Registration Form Functionalities

  Scenario: Verification of user Registration Form

    Given user is on Reg Page
    When user enters valid data

      | Andrei          |
      | lastname        |
      | email@email.com |
      | Focus           |

    Then user registration is successful