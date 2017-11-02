Feature: Brief

  Scenario Outline: Fill the brief
Given the user is on the RSP home page
When the user go to brief page
Then the user must select type of <product>

    Examples:
    | product |
    | Design  |
