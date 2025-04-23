Feature: Verificar incorporación de nuevas columnas relacionadas a Folios y Status de Pago

  Scenario: Exportar y revisar columnas de 'Claim Accounting Report'
    Given el archivo 'Claim Accounting Report' es exportado y abierto
    When verifico que la columna 'Ramo' tiene a su derecha la columna 'Folio Pre solicitud' sin valores asignados
    Then la columna 'Folio Pre solicitud' está presente y posicionada correctamente

    When confirmo que a la derecha de 'Folio Pre solicitud' está la columna 'Folio de Pago' sin valores
    Then la columna 'Folio de Pago' se encuentra en la posición correcta

    When ubico la columna 'Fecha de Pago'
    And verifico que la siguiente columna es 'Status Pago Código'
    Then la columna 'Status Pago Código' está presente inmediatamente después de 'Fecha de Pago'

    When verifico que la columna 'Status de Pago' ha sido renombrada
    Then el título de la columna es 'Descripción Status Pago'