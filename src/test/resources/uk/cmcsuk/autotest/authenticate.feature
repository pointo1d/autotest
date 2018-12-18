Feature:
    As a user, I want to be assured that I can login and logout from my account

  Background:
    Given the home page renders

  Scenario: GP - I can login
    Given I am logged out
    When I log "in"
    Then I expect to be logged "in"

  Scenario: GP - I can logout
    Given I am logged in
    When I log "out"
    Then I expect to be logged "out"

#### END OF FILE
