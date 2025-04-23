package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {
    WebDriver driver;

    private By reportMenu = By.xpath("//a[text()='Canned Reports']");
    private By claimModule = By.xpath("//a[text()='Module Claim']");
    private By reportCode = By.xpath("//a[text()='Report Code']");
    private By accountingReport = By.xpath("//a[text()='Claim Accounting Report']");
    private By exportButton = By.id("export-button");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToReport() {
        driver.findElement(reportMenu).click();
        driver.findElement(claimModule).click();
        driver.findElement(reportCode).click();
        driver.findElement(accountingReport).click();
    }

    public void exportReport() {
        driver.findElement(exportButton).click();
        // Add explicit wait or verification to ensure export is complete
    }

    public void verifyExportAndColumnC() {
        // Logic to verify the export success and check for data in column C
    }

    public void openExcelFile() {
        // Logic to open the exported Excel file
    }

    public void verifyConcatenationInCellC2() {
        // Logic to verify the concatenated result in the first cell of column C
    }
}