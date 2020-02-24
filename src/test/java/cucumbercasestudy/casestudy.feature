Feature: Registering in testmeapp

  Scenario Outline: Successful Registration
    Given User enters into Registration page
    And enters into "<userName>", "<firstName>", "<lastName>", "<password>", "<confirmPassword>",  "<emailAddress>", "<mobileNumber>", "<dob>", "<address>",  "<answer>"
    When i clicks on register button
    Then User navigates to login page

    Examples: 
      | userName  | firstName | lastName | password | confirmPassword  | emailAddress  | mobileNumber | dob        | address    | answer |
      | dharshini | maha      | prabha   | siva     | siva             | abc@gmail.com |   9876543210 | 14/10/1997 | 123,street | Games  |
