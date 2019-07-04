Feature: Verify add to cart

Description: Alex didnt add any product to the cart 
and while viewing the cart page, it shows alert message

Scenario: add to cart
Given Alex opens the app
When Alex search the product
And Alex views the cart page
Then Alex verifies the alert message