Feature:
    As a user, I want to be assured that, once logged in, I can manipulate my
    shopping cart

  Background:
        Given the home page renders
        And I am logged in

  Scenario: I can update the cart with a sought after item
    Given that I search for the "most expensive dress"
    And at least one item is found
    When I add the item to the cart
    Then the cart is updated with the item

  Scenario: The cart is immutable over logout and login
    Given that I have a non-empty cart
    When I log "out"
    And I log "in"
    Then I expect the contents of the cart to be unchanged


#### END OF FILE
