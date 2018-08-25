Feature: FaceBook Login Functionality
  		it will verify the Login Funcitonlity of FaceBook

  Scenario: Login with the Valid User name and Password
    Given Navigate Through the facebook LoginPage
    When Enter Valid_UserName and Valid_PassWord
    And Click on Log In Button
    Then User will Sucessfully logIn and Welcome To Facebook will be appear

    
  Scenario: Login With the Valid User Name and Invalid Password
    Given Navigate Through the facebook LoginPage
    When Enter Valid_UserName and InValid_PassWord
    And Click on LogIn Button
    Then The password you’ve entered is incorrect massage will be -appear
    
  Scenario: Login With the InValid User Name and valid Password
    Given Navigate Through the facebook LoginPage
    When Enter Invalid_UserName and Valid_PassWord
    And Click on LogIn Button
    Then The email you’ve entered doesn’t match any account -appear

