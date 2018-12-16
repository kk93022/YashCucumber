Feature: Google Search
@selenium
Scenario: Search for selenium
Given I am able to acess google Serach page
When I type the Keyword as "selenium"
And I choose the first suggestion
And I click on first result
Then I should have "selenium" as a title 
@mobile
Scenario: Search for mobile
Given I am able to acess google Serach page
When I type the Keyword as "mobile"
And I choose the first suggestion
And I click on first result
Then I should have "mobile" as a title