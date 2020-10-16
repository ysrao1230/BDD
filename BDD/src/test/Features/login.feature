Feature: Testing application login

  @smoke
  Scenario: Login to FB page
    Given user is  on homepage
    When user navigates to Login Page
    And user enters username and Password
    Then success message is displayed

  @Functional
  Scenario Outline: click on didnt receive link
    Given user launched browser
    When user navigate to login page
    And Enter <username> and <password>
    Then Login Page title verification

    Examples: 
      | username | password    |
      | ysr036   | Srinu@1236. |
      | ysr1230  | Rao1230     |
      | abcd     |     1234456 |
