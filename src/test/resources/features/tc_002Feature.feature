Feature: Verificar existencia y posición de la columna 'Estado Código'

Scenario: Verificación de la columna 'Estado Código' en el reporte
  Given el usuario ha exportado el Excel 'Claim Accounting Report'
  When el usuario abre el Excel y localiza la columna 'i'
  Then debería identificar que la columna 'j' contiene el título 'Estado Código'