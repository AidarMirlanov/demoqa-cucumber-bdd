Feature: Scenario Outline examples

  //Scenario Outline в Cucumber — это способ повторно использовать один сценарий с разными данными.
  @pojo
  Scenario Outline: Scenario Outline examples
    Given user is on HRM login page
    And user should login with following credentials "<username>" "<password>"
    Examples:
      | username | password  |
      | Admin    | admin123  |
      | Admin1   | admin123  |
      | Admin    | admin1234 |

