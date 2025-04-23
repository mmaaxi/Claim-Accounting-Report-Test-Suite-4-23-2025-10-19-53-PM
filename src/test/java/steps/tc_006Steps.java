package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {
    tc_006Page page = new tc_006Page();

    @Given("el usuario ha iniciado sesión y navega a la sección de reportes")
    public void navegarASeccionReportes() {
        page.loginAndNavigateToReports();
    }

    @When("el usuario exporta el archivo 'Claim Accounting Report'")
    public void exportarArchivoClaimAccountingReport() {
        page.exportClaimAccountingReport();
    }

    @Then("la exportación se realiza exitosamente")
    public void verificarExportacionExitosa() {
        Assert.assertTrue(page.isExportSuccessful());
    }

    @When("el usuario abre el archivo exportado")
    public void abrirArchivoExportado() {
        page.openExportedFile();
    }

    @Then("se identifica la columna titulada 'IVA 0%'")
    public void verificarColumnaIVA0Present() {
        Assert.assertTrue(page.isColumnPresent("IVA 0%"));
    }

    @When("el usuario verifica los valores en la columna 'IVA 0%'")
    public void verificarValoresEnColumnaIVA0() {
        page.verifyColumnValues("IVA 0%");
    }

    @Then("los montos son válidos y corresponden al 0% de IVA")
    public void verificarMontosValidos() {
        Assert.assertTrue(page.areValuesValidFor0PercentIVA());
    }
}