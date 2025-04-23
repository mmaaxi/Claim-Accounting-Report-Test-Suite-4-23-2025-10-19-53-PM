package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Tc_008Page;

public class Tc_008Steps {

    Tc_008Page page = new Tc_008Page();

    @Given("abro el archivo Excel 'Claim Accounting Report'")
    public void openExcelFile() {
        page.exportAndOpenExcelFile();
    }

    @When("localizo la columna 'IVA retenido' usando la referencia proporcionada")
    public void locateColumn() {
        boolean isColumnPresent = page.isColumnPresent();
        Assert.assertTrue("La columna 'IVA retenido' no está presente.", isColumnPresent);
    }

    @Then("la columna 'IVA retenido' está presente y en su posición correspondiente")
    public void verifyColumnPosition() {
        boolean isInCorrectPosition = page.isInCorrectPosition();
        Assert.assertTrue("La columna 'IVA retenido' no está en la posición correcta.", isInCorrectPosition);
    }

    @Then("la columna muestra la estructura necesaria para futuros datos de IVA retenido")
    public void verifyColumnStructure() {
        boolean hasCorrectStructure = page.hasCorrectStructure();
        Assert.assertTrue("La columna 'IVA retenido' no tiene la estructura adecuada.", hasCorrectStructure);
    }
}