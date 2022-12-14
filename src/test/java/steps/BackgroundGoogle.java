package steps;

import driverConfig.DriverContext;
import io.cucumber.java.en.Given;
import pages.GooglePage;
import util.MetodosGenericos;

import static constants.Constant.URL_GOOGLE;
import static org.junit.Assert.assertEquals;

public class BackgroundGoogle {

    GooglePage googlePage = new GooglePage();
    @Given("Ingresar a google")
    public void ingresarAGoogle() {
        DriverContext.getDriver().navigate().to(URL_GOOGLE);
        MetodosGenericos.esperar(2);
        String url = DriverContext.getDriver().getCurrentUrl();
        assertEquals(URL_GOOGLE, url);
    }
}
