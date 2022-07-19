#Assignment1
Feature: feature to test the functionality of google

  @smoke
  Scenario Outline: Check the google search
    Given User is on google page
    When User enters <searchonj>

    Examples: 
      | searchonj |
      | capgemini |
      | accenture |
