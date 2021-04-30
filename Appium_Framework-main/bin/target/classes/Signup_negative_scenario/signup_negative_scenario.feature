Feature: Sign up button should be present on landing welcome page and on Sign up page, user should able to provide information

Scenario: Validate that the user should get a validation message on entering invalid data in first name and last name fields
    Given App is open and user is on sign up page
    When User enters invalid first name and last name details
    Then validation messages should be displayed

