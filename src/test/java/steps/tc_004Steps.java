package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page page = new tc_004Page();

    @Given("the 'Claim Accounting Report' Excel is exported and opened")
    public void theClaimAccountingReportExcelIsExportedAndOpened() {
        Assert.assertTrue("The Excel file was not opened successfully", page.openExcelFile());
    }

    @When("I locate the 'Monto (reserva)' column")
    public void iLocateTheMontoReservaColumn() {
        Assert.assertTrue("Could not locate the 'Monto (reserva)' column", page.locateMontoReservaColumn());
    }

    @Then("the column to the right is titled 'Monto acumulado Folio Reserva 5401'")
    public void theColumnToTheRightIsTitledMontoAcumuladoFolioReserva5401() {
        Assert.assertTrue("The column title is incorrect", page.verifyRightColumnTitle());
    }

    @When("I select a cell in 'Monto acumulado Folio Reserva 5401'")
    public void iSelectACellInMontoAcumuladoFolioReserva5401() {
        page.selectCellInAccumulatedAmountColumn();
    }

    @Then("the formula correctly sums the previous accumulated amount and the current reservation amount")
    public void theFormulaCorrectlySumsThePreviousAccumulatedAmountAndTheCurrentReservationAmount() {
        Assert.assertTrue("The formula did not return the correct sum", page.verifyFormulaCorrectness());
    }
}