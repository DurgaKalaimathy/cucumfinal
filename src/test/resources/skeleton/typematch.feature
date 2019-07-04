Feature: Product search

Description: Alex wants to purchase a product and 
while searching, he must get products relevant to the 
characters he typed

Scenario: Search engine
Given Alex logins testme app
When Alex searches the product
And Alex selects the product
Then Alex verifies the product 