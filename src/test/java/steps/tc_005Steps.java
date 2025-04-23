package steps;

import pages.tc_005Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc_005Steps {
    tc_005Page claimAccountingPage = new tc_005Page();

    @Given("I export and open the Excel 'Claim Accounting Report'")
    public void exportAndOpenExcel() {
        claimAccountingPage.exportExcel();
        claimAccountingPage.openExcel();
    }

    @When("I locate the column with the original title 'Monto Acumulado Folio OPC'")
    public void locateOriginalColumnTitle() {
        claimAccountingPage.findOriginalColumn();
    }

    @Then("the original column is present")
    public void verifyOriginalColumnPresent() {
        claimAccountingPage.verifyOriginalColumnPresence();
    }

    @When("I verify that the title updates to 'Monto Acumulado Folio OPC (2121)'")
    public void verifyTitleUpdate() {
        claimAccountingPage.verifyUpdatedTitle();
    }

    @Then("the column name has been modified correctly in the exported file")
    public void verifyColumnNameModified() {
        claimAccountingPage.verifyColumnNameModification();
    }
}