Feature: TestMe app casestudy 
@Smoke
Scenario Outline: Registration of TestMeApp 
	Given TestMeApp is launched 
	Then user clicks on the SignUp link 
	Then enter username "<uname>" 
	Then enter firstname "<fname>" 
	Then enter lastname "<lname>" 
	Then enter password "<pswrd>" 
	Then enter confirm password "<cpswrd>" 
	Then enter gender 
	Then enter email "<email>" 
	Then enter mobile number "<mob>" 
	Then enter dob "<dob>" 
	Then enter address "<address>" 
	Then enter security question 
	Then enter answer "<ans>" 
	Then user clicks the registration button 
	Then verify the registration process 
	
	Examples: 
		|uname    |fname |lname |pswrd   |cpswrd  |email                 |mob        |dob        |address           |ans    |
		|priyu123 |priyu |babu  |pass123 |pass123 |priyubabu18@gmail.com |9876543210 |01/18/1998 |chennai,tamilnadu |geo    |
		|prapri123|pravee|priya |pass123 |pass123 |praveepriya@gmail.com |9870321654 |06/11/1998 |saram,pondicherry |shadow |
	@Sanity	
Scenario Outline: Login validation for TestMeApp 
	Then user provides valid username "<uname>" 
	And user provides valid password "<pswrd>" 
	Then user clicks on the login button 
	And user verifies the login status 
	
	Examples: 
		| uname   | pswrd       |
		| lalitha | password123 |
		
	@Sanity	
Scenario: search for products 
	Then user enters the item name to be searched 
	And user click on find details
	Then add to cart
	Then user proceeds to payment
	Then continue the payment process
	@Sanity	
Scenario: The one where the user moves to cart without adding any item in it
    Given Alex has registered into TestMeApp 
	Then Alex search for a product like headphone
	And Alex go for payment without adding items into cart
	Then TestMe doesnt display the cart icon
	
