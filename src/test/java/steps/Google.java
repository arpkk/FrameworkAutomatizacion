package steps;

import driverConfig.DriverContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;
import static org.junit.Assert.assertEquals;

public class Google {

    GooglePage googlePage = new GooglePage();


    @When("introduzco la palabra {string}")
    public void introduzcoLaPalabra(String search) throws Throwable {
        googlePage.ingresoTextoBusqueda(search);
    }

    @And("selecciono el resultado de la busqueda {string}")
    public void seleccionoElResultadoDeLaBusqueda(String search) throws Throwable {
        googlePage.ingresoAPaginaSolicitada(search);
    }

    @Then("se visualiza la pagina {string}")
    public void seVisualizaLaPagina(String result) {
        String url = DriverContext.getDriver().getCurrentUrl();
        assertEquals(result, url);
    }


}
