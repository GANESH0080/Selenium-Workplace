Feature: PPE Login Feature


  @tag1
  Scenario: PPE Login Scenario
    Given Agent Is Already On Login Page
    When Tittle Of The Login Page Is Login        
    Then Agent Entering Username and Password
    Then Click on Login Button
    When URL Of The LoggedIn Page
    Then Click On GuidLines Link