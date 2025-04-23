Feature: Validate renaming of the column 'Monto Acumulado Folio OPC'

  Scenario: Verify the column name change in Excel file
    Given I export and open the Excel 'Claim Accounting Report'
    When I locate the column with the original title 'Monto Acumulado Folio OPC'
    Then the original column is present
    When I verify that the title updates to 'Monto Acumulado Folio OPC (2121)'
    Then the column name has been modified correctly in the exported file