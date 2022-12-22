Feature: Login page

  Scenario: user can login
    Given when user is on login page
    When user gives username and password
    And clicks on login button
    Then user should navigate to home page
