Feature: Examples of Cucumber data table implementations

  Scenario: List of fruits I like
    Then User should see fruits I like
      | kiwi       |
      | cucumber   |
      | banana     |
      | orange     |
      | mango      |
      | grape      |
      | pomgranate |


  Scenario: user should be able to see all 12 months in months dropdown
    Given user is on dropdown page  of the practice tool
    Then user should see below info in month dropdown.
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |

