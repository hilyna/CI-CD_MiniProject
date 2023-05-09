Feature: Login
  As an user
  Can login if have account

  Scenario: POST - Login with valid email and password
    Given I set POST api endpoint
    When I send POST HTTP request valid
    Then I receive valid HTTP response code 200
    And I receive data token login

  Scenario: POST - Login with invalid email and valid password
    Given I set POST api endpoint
    When I send POST HTTP request with invalid email and valid password
    Then I receive valid HTTP response code 400
    And I receive message error

  Scenario: POST - Login with valid email and invalid password
    Given I set POST api endpoint
    When I send POST HTTP request with valid email and invalid password
    Then I receive valid HTTP response code 400
    And I receive message error

  Scenario: POST - Login with invalid email and invalid password
    Given I set POST api endpoint
    When I send POST HTTP request with invalid email and invalid password
    Then I receive valid HTTP response code 400
    And I receive message error


