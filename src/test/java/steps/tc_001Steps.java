package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_001Page;

public class tc_001Steps {
    tc_001Page page = new tc_001Page();

    @Given("I access the 'Canned Reports > Module Claim > Report Code > Claim Accounting Report'")
    public void accessModule() {
        page.navigateToReport();
    }

    @When("I export the Excel 'Claim Accounting Report'")
    public void exportExcel() {
        page.exportReport();
    }

    @Then("The Excel file should be exported successfully with data in column C")
    public void verifyExportAndColumnC() {
        page.verifyExportAndColumnC();
    }

    @When("I open the exported Excel file")
    public void openExportedExcel() {
        page.openExcelFile();
    }

    @Then("The cell C2 should show the concatenated result as per the formula =CONCATENATE(D2, '_', H2, '_', U2, '_', O2, '_', E2)")
    public void verifyCellC2() {
        page.verifyConcatenationInCellC2();
    }
}