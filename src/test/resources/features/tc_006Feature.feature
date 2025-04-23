Feature: Verificar la inclusión de la columna 'IVA 0%'

  Scenario: Exportar el Excel 'Claim Accounting Report' y verificar la columna 'IVA 0%'
    Given el usuario ha iniciado sesión y navega a la sección de reportes
    When el usuario exporta el archivo 'Claim Accounting Report'
    Then la exportación se realiza exitosamente

    When el usuario abre el archivo exportado
    Then se identifica la columna titulada 'IVA 0%'

    When el usuario verifica los valores en la columna 'IVA 0%'
    Then los montos son válidos y corresponden al 0% de IVA