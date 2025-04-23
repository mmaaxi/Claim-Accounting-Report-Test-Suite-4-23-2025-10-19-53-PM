Feature: Verify the existence of the 'IVA exento' column

  Scenario: Check the presence and correctness of the 'IVA exento' column in the exported Excel report
    Given I have exported the Excel 'Claim Accounting Report'
    When I locate the 'IVA exento' column in the designated position
    Then I should verify the column 'IVA exento' is in the correct location
    And I validate data samples to ensure the amounts for IVA exento are as expected