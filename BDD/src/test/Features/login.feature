Feature: Testing application login

  @smoke
  Scenario: Login to FB page
    Given user is  on homepage
    When user navigates to Login Page
    And user enters username and Password
    Then success message is displayed

  @Functional
  Scenario: click on didnt receive link
    Given user launched browser
    When user navigate to login page
    And Enter <username> and <Password>
    Then click on didint recive link
            | abcd   | 123456 |
