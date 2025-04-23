package pages;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class tc_004Page {

    private Sheet sheet;

    public boolean openExcelFile() {
        try {
            FileInputStream excelFile = new FileInputStream(new File("path/to/ClaimAccountingReport.xlsx"));
            sheet = WorkbookFactory.create(excelFile).getSheetAt(0);
            excelFile.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean locateMontoReservaColumn() {
        return sheet.getRow(0).getCell(getMontoReservaColumnIndex()).getStringCellValue().equals("Monto (reserva)");
    }

    public boolean verifyRightColumnTitle() {
        return sheet.getRow(0).getCell(getMontoReservaColumnIndex() + 1).getStringCellValue().equals("Monto acumulado Folio Reserva 5401");
    }

    public void selectCellInAccumulatedAmountColumn() {
        // Logic to select a specific cell in the 'Monto acumulado Folio Reserva 5401' column
    }

    public boolean verifyFormulaCorrectness() {
        // Logic to verify if the formula in the selected cell is correct
        return true; // Placeholder for actual method
    }

    private int getMontoReservaColumnIndex() {
        // Logic to get the 'Monto (reserva)' column index
        return 23; // Assuming column X is the 24th column (0-indexed)
    }
}