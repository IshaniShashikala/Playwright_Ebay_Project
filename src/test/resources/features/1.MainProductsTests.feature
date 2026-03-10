@MainProduct @regression

Feature: main Product Page

#  Background:
#    Given user accesses the main product

  @smoke
  Scenario: Validate Successful Main Product Appearance
    Given user navigates the main product web page
    Then user should be able to see main product
