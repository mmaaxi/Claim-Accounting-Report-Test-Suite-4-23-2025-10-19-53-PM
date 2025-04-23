Feature: Validation of the new order of the key in Column C

  Scenario: Validate the concatenated values in Column C of the exported Excel
    Given I access the 'Canned Reports > Module Claim > Report Code > Claim Accounting Report'
    When I export the Excel 'Claim Accounting Report'
    Then The Excel file should be exported successfully with data in column C
    When I open the exported Excel file
    Then The cell C2 should show the concatenated result as per the formula =CONCATENATE(D2, '_', H2, '_', U2, '_', O2, '_', E2)