@RelatedProduct @regression

Feature: Related Product Page

#  Background:
#    Given user accesses the main product

  @smoke
  Scenario: Validate Successful Related Product Appearance
    Given user navigates the main product web page
    Then user should be able to see related product

  Scenario: Validate Successful Maximum 6 products appear in the related best seller section
    Given user navigates the main product web page
    Then user should be able to see Maximum 6 products appear in the related best seller section