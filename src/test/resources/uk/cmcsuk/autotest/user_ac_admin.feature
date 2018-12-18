Feature:
    As a user, I want to be assured that I can create and administer a user
    account

  Background:
    Given the home page renders

  Scenario: GP - I can create a new account
    Given that I request to create an account
    When I enter my details
    And I attempt to create the account
    Then I expect the account to be created

#### END OF FILE
