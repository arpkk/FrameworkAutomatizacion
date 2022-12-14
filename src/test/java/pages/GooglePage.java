package pages;

import driverConfig.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.MetodosGenericos;

import static org.junit.Assert.fail;

public class GooglePage {

    private WebDriver driver;

    private static final Logger log = LoggerFactory.getLogger(GooglePage.class);

    public GooglePage(){
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//input[@name=\"q\"]")
    WebElement inputText;

    @FindBy(xpath = "//input[@name=\"btnK\"]")
    WebElement BtnBuscar;


    public void ingresoTextoBusqueda(String search){
        try {
            boolean validarInputText = MetodosGenericos.visualizarObjeto(inputText, 5);
            if(validarInputText){
                inputText.sendKeys(search);
                inputText.sendKeys(Keys.ENTER);
            }
            else {
                fail("no se logro visualizar el campo de busqueda");
            }
        }catch (Exception e){
            fail("no fue posible ingresar el texto " + search + " en el campo de busqueda");
        }

    }


    public void ingresoAPaginaSolicitada(String search){
        By resultadoBusqueda = By.xpath("(//h3[contains(text(),"+search+")])[1]");
        WebElement resultado = DriverContext.getDriver().findElement(resultadoBusqueda);
        resultado.click();
    }




}
