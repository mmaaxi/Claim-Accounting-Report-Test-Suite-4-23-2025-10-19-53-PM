package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @Given("el usuario ha exportado el 'Claim Accounting Report' y ha abierto el documento")
    public void exportarYabrirClaimAccountingReport() {
        boolean resultado = page.exportarYabrirDocumento();
        Assert.assertTrue("El archivo no se exportó o abrió correctamente", resultado);
    }

    @When("el usuario ubica la fila con un movimiento 'pago' y la celda de 'Monto Acumulado Folio OPC \\(2121\\)")
    public void ubicarFilaYcelda231() {
        boolean encontrado = page.buscarFilaMovimientoYPago();
        Assert.assertTrue("No se identificó el movimiento o la celda correctamente", encontrado);
    }

    @Then("el usuario revisa y valida la fórmula \"=Z4+AD5+AE5+AH5+AC5+AB5+AM5\" con un cálculo manual")
    public void validarFormulaConCalculoManual() {
        boolean esCorrecto = page.validarFormulaConCalculoManual();
        Assert.assertTrue("La fórmula no suma correctamente los valores", esCorrecto);
    }
}