Feature: as a user I want to practice cucumber with java

  Scenario Outline: open editor
    Given I open albelli website
    And I login with "<useName>" and "<password>"
    When I click on one of the buttons
    Then something is visible

    Examples:
    |useName|password|
    |   seniselam21@gmail.com    | seniselam     |