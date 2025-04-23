package pages;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class tc_002Page {

    private static final String FILE_PATH = "path/to/Claim_Accounting_Report.xlsx";

    public boolean exportExcel() {
        // Lógica de exportación del archivo Excel
        // Retornar verdadero si el archivo es exportado sin errores
        return true;  // Simulación de éxito
    }

    public boolean locateColumn(char column) {
        try (FileInputStream file = new FileInputStream(new File(FILE_PATH));
             Workbook workbook = new XSSFWorkbook(file)) {

            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(0);

            if (row.getCell(column - 'a') != null) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public String getColumnTitle(char column) {
        try (FileInputStream file = new FileInputStream(new File(FILE_PATH));
             Workbook workbook = new XSSFWorkbook(file)) {

            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(0);
            Cell cell = row.getCell(column - 'a');

            if (cell != null) {
                return cell.getStringCellValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}