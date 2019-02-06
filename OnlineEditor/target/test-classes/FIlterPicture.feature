Feature: as a user I want to filter my picture

Scenario Outline: Filter image
  Given I open albelli websites
  And I login with "<useName>" and "<password>" credencials
  When I dismis the tootltip
  And I add a picture and select
  Then I see edit options

Examples:
|useName|password|
|   seniselam21@gmail.com    | seniselam     |