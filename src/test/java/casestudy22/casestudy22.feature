Feature: Login into testmeapp
  I want to use this template for my feature file

  Scenario Outline: Successful login
    Given User is on the login page
    When User enters "<username>" and "<password>" and clicks submit button
    Then User does Successful login

    Examples: 
      | username | password |
      | sowmiya  | kalyan   |
