Feature: Login in PPE application
Scenario: PPE login 
 Given Agent Already On Login Page
    When Tittle Of Login Page Is Login        
    Then Agent Entering "ih.chelms" and "10#Hammer"
    Then Click Login Button
    When URL Of LoggedIn Page
    Then Click GuidLines Link
