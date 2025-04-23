package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {
    tc_002Page reportPage = new tc_002Page();

    @Given("^el usuario ha exportado el Excel 'Claim Accounting Report'$")
    public void exportExcelFile() {
        boolean isExported = reportPage.exportExcel();
        Assert.assertTrue("El archivo no se exportó correctamente.", isExported);
    }

    @When("^el usuario abre el Excel y localiza la columna 'i'$")
    public void openExcelAndLocateColumnI() {
        boolean isColumnIFound = reportPage.locateColumn('i');
        Assert.assertTrue("La columna 'i' no se localizó correctamente.", isColumnIFound);
    }

    @Then("^debería identificar que la columna 'j' contiene el título 'Estado Código'$")
    public void verifyColumnJHasCorrectTitle() {
        String actualTitle = reportPage.getColumnTitle('j');
        Assert.assertEquals("El título de la columna 'j' no es 'Estado Código'.", "Estado Código", actualTitle);
    }
}