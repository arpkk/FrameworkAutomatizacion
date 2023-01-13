
package controller;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RecursosController {

    private static final Logger log = LoggerFactory.getLogger(RecursosController.class);

    public static String getDataTest(String dataTest) {
        String data = "";
        try {
            if (!dataTest.isEmpty()) {
                switch (dataTest){
                      /*  case "cuentaCorrienteQA":
                            data = Constant.cuentaCorrienteQA;
                            break;
                        case "empresaApoderadoQA":
                            data = Constant.empresaApoderadoQA;
                            break;
                        case "montoTransfNormal":
                            data = Constant.montoTransfNormal;
                            break;
                        case "montoTransfAlto":
                            data = Constant.montoTransfAlto;
                            break;
                        case "rutApoderadoDESA":
                            data = Constant.rutApoderadoDESA;
                            break;
                        case "claveApoderadoDESA":
                            data = Constant.claveApoderadoDESA;
                            break;
                        case "cuentaCorrienteDESA":
                            data = Constant.cuentaCorrienteDESA;
                            break;
                        case "empresaApoderadoDESA":
                            data = Constant.empresaApoderadoDESA;
                            break;
                        case "montoTransfNormalDESA":
                            data = Constant.montoTransfNormalDESA;
                            break;
                        case "montoTransfAltoDESA":
                            data = Constant.montoTransfAltoDESA;
                            break;
                        case "rutNuevoDest":
                            data = Constant.rutNuevoDest;
                            break;
                        case "nombreNuevaDest":
                            data = Constant.nombreNuevaDest;
                            break;
                        case "bancoNuevoDest":
                            data = Constant.bancoNuevoDest;
                            break;
                        case "nroCuentaNuevoDest":
                            data = Constant.nroCuentaNuevoDest;
                            break;
                        case "tipoCtaNuevoDest":
                            data = Constant.tipoCtaNuevoDest;
                            break;
                        case "aliasNuevoDest":
                            data = Constant.aliasNuevoDest;
                            break;
                        case "emailNuevoDest":
                            data = Constant.emailNuevoDest;
                            break;
                        case "telefonoNuevoDest":
                            data = Constant.telefonoNuevoDest;
                            break;
                        case "telefonoFijoNvoDest":
                            data = Constant.telefonoFijoNvoDest;
                            break;

                            //variables para destinatario modificar
                        case "rutDest":
                            data = Constant.rutDest;
                            break;
                        case "nombreDest":
                            data = Constant.nombreDest;
                            break;
                        case "bancoDest":
                            data = Constant.bancoDest;
                            break;
                        case "nroCuentaDest":
                            data = Constant.nroCuentaDest;
                            break;
                        case "tipoCtaDest":
                            data = Constant.tipoCtaDest;
                            break;
                        case "aliasDest":
                            data = Constant.aliasDest;
                            break;
                        case "emailDest":
                            data = Constant.emailDest;
                            break;
                        case "telefonoDest":
                            data = Constant.telefonoDest;
                            break;
                        case "telefonoFijoDest":
                            data = Constant.telefonoFijoDest;
                            break;
                            //-------------------------------//
                        case "mensajeCorrecto":
                            data = Constant.mensajeCorrecto;
                            break;
                        case "mensajeAdvertencia":
                            data = Constant.mensajeAdvertencia;
                            break;
                        case "mensajeError":
                            data = Constant.mensajeError;
                            break;
                        case "mensajeEditado":
                            data = Constant.mensajeEditado;
                            break;
                        case "destinatarioCreado":
                            data = Constant.destinatarioCreado;
                            break;
                        case "destinatarioCreadoDESA":
                            data = Constant.destinatarioCreadoDESA;
                            break;
                        case "rutBuscarDest":
                            data = Constant.rutBuscarDest;
                            break;
                        case "nombreBuscarDest":
                            data = Constant.nombreBuscarDest;
                            break;
                        case "nroCuentaBuscarDest":
                            data = Constant.nroCuentaBuscarDest;
                            break;
                        case "aliasBuscarDest":
                            data = Constant.aliasBuscarDest;
                            break;
                        case "emailBuscarDest":
                            data = Constant.emailBuscarDest;
                            break;
                        case "telefonoBuscarDest":
                            data = Constant.telefonoBuscarDest;
                            break;
                        case "telefonoFijoBuscarDest":
                            data = Constant.telefonoFijoBuscarDest;
                            break;*/

                        default:
                            Assert.fail("nombre del parametro '" + dataTest + "' no controlado, necesita revision");
                            break;

                    }

            }
        }catch (Exception e){
            log.error("Error para obtener data de prueba: " + e);
        }

        return data;
    }
}

