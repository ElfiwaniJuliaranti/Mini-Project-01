Feature: Login Functionality

  @Test
  Scenario Outline: Verify login functionality
    Given User in login page
    When User fill invalid <username> and <password>
    And User click login button
    Then User get login <result>

    Examples:
      | username      | password     | result |
      | standard_user | secret_sauce | passed |
      | invalid_user  | secret_sauce | failed |
      | standard_user | invalid_pass | failed |
