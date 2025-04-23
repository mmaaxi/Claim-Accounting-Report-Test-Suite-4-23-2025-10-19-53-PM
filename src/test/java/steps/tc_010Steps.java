package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {
    tc_010Page page = new tc_010Page();

    @Given("el archivo 'Claim Accounting Report' es exportado y abierto")
    public void exportarYAbrirArchivo() {
        Assert.assertTrue(page.exportarYAbrirArchivo());
    }

    @When("verifico que la columna 'Ramo' tiene a su derecha la columna 'Folio Pre solicitud' sin valores asignados")
    public void verificarColumnaFolioPreSolicitud() {
        Assert.assertTrue(page.verificarColumnaFolioPreSolicitud());
    }

    @Then("la columna 'Folio Pre solicitud' está presente y posicionada correctamente")
    public void validarColumnaFolioPreSolicitud() {
        Assert.assertTrue(page.validarColumnaFolioPreSolicitud());
    }

    @When("confirmo que a la derecha de 'Folio Pre solicitud' está la columna 'Folio de Pago' sin valores")
    public void confirmarColumnaFolioDePago() {
        Assert.assertTrue(page.confirmarColumnaFolioDePago());
    }

    @Then("la columna 'Folio de Pago' se encuentra en la posición correcta")
    public void validarColumnaFolioDePago() {
        Assert.assertTrue(page.validarColumnaFolioDePago());
    }

    @When("ubico la columna 'Fecha de Pago'")
    public void ubicarColumnaFechaDePago() {
        Assert.assertTrue(page.ubicarColumnaFechaDePago());
    }

    @When("verifico que la siguiente columna es 'Status Pago Código'")
    public void verificarColumnaStatusPagoCodigo() {
        Assert.assertTrue(page.verificarColumnaStatusPagoCodigo());
    }

    @Then("la columna 'Status Pago Código' está presente inmediatamente después de 'Fecha de Pago'")
    public void validarColumnaStatusPagoCodigo() {
        Assert.assertTrue(page.validarColumnaStatusPagoCodigo());
    }

    @When("verifico que la columna 'Status de Pago' ha sido renombrada")
    public void verificarColumnaStatusDePago() {
        Assert.assertTrue(page.verificarColumnaStatusDePago());
    }

    @Then("el título de la columna es 'Descripción Status Pago'")
    public void validarTituloColumna() {
        Assert.assertTrue(page.validarTituloColumna());
    }
}