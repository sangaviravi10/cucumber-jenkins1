Feature: Login Functionality


Scenario Outline: Login with multiple inputs-TestMeApp
Given  user opens testmeapp 
Then   user enters the username "<userName>" and password "<password>"
Then   Validate the login page

Examples: 
|userName||password|
|Diya1234||password123|