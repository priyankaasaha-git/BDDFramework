@britishTest
Feature: British Airways Registration

@regisClick
  Scenario: British Airways registration by filling all the mandatory fields.
    Given launch british airways URL "https://britishairways.com"
    And click on Registration Link
    Then check for registration page is opended
    Then enter email address "rebabeachresort2020@gmail.com"
    Then confirm the same email address "rebabeachresort2020@gmail.com" again
    Then enter the password "Password@12345"
    Then confirm the same password "Password@12345"
    Then select the title "Mr"
    Then enter the first name "Chiranjit"
    Then enter the last name "Saha"
    Then select the radio button Register with ba.com 
    Then click on Join now
    Then check registartion is successful
    

