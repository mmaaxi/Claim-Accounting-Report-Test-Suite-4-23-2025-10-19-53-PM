package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_007Page;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("I have exported the Excel 'Claim Accounting Report'")
    public void i_have_exported_the_excel_claim_accounting_report() {
        page.exportClaimAccountingReport();
    }

    @When("I locate the 'IVA exento' column in the designated position")
    public void i_locate_the_iva_exento_column_in_the_designated_position() {
        page.locateIVAExentoColumn();
    }

    @Then("I should verify the column 'IVA exento' is in the correct location")
    public void i_should_verify_the_column_iva_exento_is_in_the_correct_location() {
        page.verifyIVAExentoColumnLocation();
    }

    @Then("I validate data samples to ensure the amounts for IVA exento are as expected")
    public void i_validate_data_samples_to_ensure_the_amounts_for_iva_exento_are_as_expected() {
        page.validateIVAExentoAmounts();
    }
}