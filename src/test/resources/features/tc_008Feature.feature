Feature: Verificar creación de la columna 'IVA retenido'

Scenario: Verificar la columna 'IVA retenido' en el archivo 'Claim Accounting Report'
  Given abro el archivo Excel 'Claim Accounting Report'
  When localizo la columna 'IVA retenido' usando la referencia proporcionada
  Then la columna 'IVA retenido' está presente y en su posición correspondiente
  And la columna muestra la estructura necesaria para futuros datos de IVA retenido