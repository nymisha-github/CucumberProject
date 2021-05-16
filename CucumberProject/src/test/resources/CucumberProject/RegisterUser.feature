Feature: Register User
This feature includes sceanrio that would register a new user.


#Pre-condition : User is able to access the website.

Scenario Outline: Register new user name 
Given user is able to navigate onto the login page
When user clicks on the sign up button
Then user is on the registation page
And user enter the firstname as "Nymisha"
And user enter the lastname as "Nunna"
And user enter the e-mail as "nunna19@gmail.com"
And user enter the username as "nunna19"
And user enter the password as "pwd12345!"
And user enter the confirmpassword as "pwd12345!"
And user clicks on the registration button
And user clicks on the picture button
And user clicks on the inbox button
And user clicks on the compose button
And user clicks on sendto as "usermailid@gmail.com"
And user enter the subject as "Registration Successful"
And user clicks on the Send Confirmaton button
Then user should see the acknowledgement window as "Confirmation mail has been sent to Nymisha Nunna's mail id (nunna19)"

#@Examples
