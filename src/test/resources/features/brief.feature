Feature: Brief

  Scenario Outline: Fill the brief
    Given the user is on the RSP home page
    And the user go to brief page
    When the user must select type of '<product>'
    And the user go to the second page

    Examples:
    | product |
    | Design  |
    | Android application |
