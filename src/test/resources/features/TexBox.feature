Feature: Text Box

  @Regression
  Scenario: Fill up text box form with valid data
    Given user is on Text box on page
    And user enter full name
    And user enter email
    And user enter current address
    And user enter permanent address
    When user click submit button
    Then user should successfully fill up the form

  @smoke
  Scenario: Fill up text box form with valid specific data
    Given user is on Text box on page
    And user enter "John Doe" in full name
    And user enter "john@gmail.com" in email
    And user enter "some address" in current address
    And user enter "Some Address 123" in permanent address
    When user click submit button
    Then user should successfully fill up the form
