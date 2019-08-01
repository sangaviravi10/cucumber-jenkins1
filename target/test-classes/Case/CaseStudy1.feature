Feature: Sign Up Functionality

Scenario: Registration in TestMeApp
Given user opens TestMeApp
When user clicks signup button
Then user enters the username as "Diya1234"
And user enters the FirstName as "Diya"
And user enters the LastName as "Ram"
And user enters the Password as "password123"
And user enters the ConfirmPassword as "password123"
And user enters the Gender as "Female"
And user enters the Email as "DiyaRam@gmail.com"
And user enters the PhoneNumber as "1236547895"
And user enters the DOB as "08/10/1998"
And user enters the Address as "Nehru street chennai"
And user enters the Answer as "puppy"
Then user clicks the Register button