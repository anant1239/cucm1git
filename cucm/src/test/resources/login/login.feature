Feature: I am validating the orangeHRM application

#when ever I want given to be common then use background
Background:
Given Open the browser and go to the Login page of OrangeHRM

@PositiveTest
Scenario: To Test Login With Valid Data
When Enter the valid name "<Name>"
And Enter the valid password "<password>"
And Click on Login button
Then I should see the username as "<Homepage name>"

Examples:
|Name|password|Homepage name|
|Admin|admin123 |Welcome Paul|
|Admin|admin123 |Welcome Paul|
|Admin|admin123 |Welcome Paul|
 
 

@NegativeTest
Scenario: To Test Login with Invalid Data
When Enter the invalid name "<Name>"
And Enter the invalid password "<password>"
And Click on Login button
Then I should see a spam message "<spam message>"

Examples:

|Name|password|spam message|
|Ana|ad1|Invalid credentials|
|Ana1|ad2|Invalid credentials|
|Ana2|ad3|Invalid credentials|