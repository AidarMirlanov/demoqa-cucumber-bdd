@background
Feature: Background example


  //Background в Cucumber — это блок, в котором пишут шаги, общие для всех сценариев в файле.
  //Он выполняется перед каждым сценарием.

  Background: user should go to Practice form page
  Scenario: Practice form1
    Given user is on Practice form page
    And fill up the form


  Scenario: Practice form2
    And say

  Scenario: Practice form3
    And hello

  Scenario: Practice form4
    And bye bye
