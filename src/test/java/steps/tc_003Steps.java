import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc_003Steps {
    tc_003Page page = new tc_003Page();

    @Given("^El usuario exporta el archivo Excel 'Claim Accounting Report'$")
    public void exportarArchivoExcel() {
        page.exportarArchivoExcel();
    }

    @When("^Abro el archivo Excel$")
    public void abrirArchivoExcel() {
        page.abrirArchivoExcel();
    }

    @When("^Ubico la columna denominada 'estado'$")
    public void ubicarColumnaEstado() {
        page.ubicarColumnaEstado();
    }

    @Then("^Verifico que los datos y el formato se hayan actualizado según la especificación del Anexo HU$")
    public void verificarDatosYFormato() {
        page.verificarDatosYFormato();
    }
}