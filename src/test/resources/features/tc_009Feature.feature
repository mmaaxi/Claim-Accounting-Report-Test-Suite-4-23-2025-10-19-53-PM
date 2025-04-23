Feature: Validación de la fórmula para 'Monto Acumulado Folio OPC (2121)' en movimiento de pago

  Scenario: Verificar la fórmula del 'Monto Acumulado Folio OPC (2121)'
    Given el usuario ha exportado el 'Claim Accounting Report' y ha abierto el documento
    When el usuario ubica la fila con un movimiento 'pago' y la celda de 'Monto Acumulado Folio OPC (2121)'
    Then el usuario revisa y valida la fórmula "=Z4+AD5+AE5+AH5+AC5+AB5+AM5" con un cálculo manual