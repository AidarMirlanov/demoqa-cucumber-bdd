Feature: Data table with Pojo

  @pojo @smoke
  Scenario: Data table with Pojo example
    Given user is on Text box on page
    And  fill up Text box form with following data
      | fullName  | email             | currentAddress | permanentAddress |
      | Jim Kerry | kerry@gmail.com   | naryn          | kochkor          |
      | C.Ronaldo | number1@gmail.com | Lissabon       | Spain            |