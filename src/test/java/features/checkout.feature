Feature: Checkout product
  @checkout
  Scenario: User checkout product
    Given User in login page
    When User fill valid username and password
    And User click login button
    Then User navigate to homepage

    When User click add to cart
    And User click cart
    Then User navigate to cartpage

    When User click checkout
    Then User navigate to checkout step one page

    When User input data
    And User click continue button
    Then User navigate to checkout step two

    When User click finish
    Then User finished checkout


