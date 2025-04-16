@login
  Feature: Login

    @valid-login
    Scenario: Login with valid data
      Given user on the home page
      When user input "standard_user" as username
      And user input "secret_sauce" as password
      Then user will redirect to home page

    @invalid-login
    Scenario: Login with invalid data
      Given user on the home page
      When user input "standard_user" as username
      And user input "wrong_password" as password
      Then user stays on login page