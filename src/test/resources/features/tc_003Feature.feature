Feature: Actualización de los campos de la columna 'estado'

  Scenario: Verificar exportación y actualización de archivo Excel
    Given El usuario exporta el archivo Excel 'Claim Accounting Report'
    When Abro el archivo Excel
    And Ubico la columna denominada 'estado'
    Then Verifico que los datos y el formato se hayan actualizado según la especificación del Anexo HU