Feature: login with multiple users using examples

Scenario Outline: validate login

Given open testme app
When user gives username as "<un>"
When user gives password as "<pw>"
And user clicks login
Then user verifies login

Examples:
|un|pw|
|Lalitha|password123|
|aishsaran|aishusaran|
|aishusaran|harrypotter|