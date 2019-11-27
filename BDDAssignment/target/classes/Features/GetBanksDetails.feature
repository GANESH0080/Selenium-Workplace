Feature: Get bank Details from Web Page

Scenario: User on Malaysia Page

# Used Gherkin language (Simple text presentation language) for writing the steps in Feature file
# Used Natural plugin to Integrate eclipse with Cucumber
Given User is already on Malaysia page

When Verify Title of Page
 
Then Scroll the page 

And User will get the Malasiya Bank Names

#Note: We can use Scenario outline tag for Parametrized testing
