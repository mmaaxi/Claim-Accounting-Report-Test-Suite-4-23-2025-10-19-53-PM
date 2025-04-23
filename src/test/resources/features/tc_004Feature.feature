Feature: Validate 'Monto acumulado Folio Reserva 5401' column

  Scenario: Verify column presence and formula correctness
    Given the 'Claim Accounting Report' Excel is exported and opened
    When I locate the 'Monto (reserva)' column
    Then the column to the right is titled 'Monto acumulado Folio Reserva 5401'
    When I select a cell in 'Monto acumulado Folio Reserva 5401'
    Then the formula correctly sums the previous accumulated amount and the current reservation amount