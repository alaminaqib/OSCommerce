Feature: UserLogin
Scenario Outline: Sign into apple account 

Given I am on the apple homepage 
And I click on the bag icon 
When I click on Sign-In
And I enter my "<Apple ID>"
And I enter my "<Password>"
Then I am logged into my Apple account

Examples:
|Apple ID|Password|
|aqib.alamin@gmail.com|Yaaqib123|