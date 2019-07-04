@Login
Feature: Register

 
 Scenario: user can do the successful registration
 Given user is on signup page
 When  user provides the uname as "sudhanips"
 When  user provides the fname as "jaya"
 When  user provides the lname as "sudha"
 When  user provides the pwd as "Bala123"
 When  user provides the cpwd as "Bala123"
 When  user provides the gender
 When  user provides the mail as "balamurugan123@gmail.com"
 When  user provides the num as "9566110824"
 When  user provides the dob as "12/10/1998"
 When  user provides the address as "no.4,3rd cross street, chennai"
 When  user provides the seques
 When  user provides the ans as "Black"
 Then  user verifies the registration