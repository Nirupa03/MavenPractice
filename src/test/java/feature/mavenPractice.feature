Feature: Access google chrome webpage
  Scenario: Access Santander webpage
    Given I am a google chrome user
    When Access Santander webpage
    And Access MK Council Webpage
    Then Santander webpage is visible
    And Council Webpage is open


#  Scenario: Access Milton keynes Council
#     Given I am a google chrome user
#     When Access MK Council Webpage
#     Then Council Webpage is open