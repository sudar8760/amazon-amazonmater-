
Feature: Adding and Removing a Product to the cart and validating
Scenario:
Given user is on amazon page
When  user click signin 
And enter Mobile number and password
Then click login
When User should search the Product
And user should select the product
Then User should add the Product to cart
And User should validate the Product is succefully added to cart or Not
Then  user should enter the payment page
And user validate user should be on the Payment Page
When  user should navigate to home page
And  goto cart and remove the product
Then validate the cart is empty