
package ecci_ahorcado;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ECCI_Ahorcado", targetNamespace = "urn:ECCI_Ahorcado", wsdlLocation = "http://titanic.ecci.ucr.ac.cr/~eb10273/prueba/Ahorcado.wsdl")
public class ECCIAhorcado
    extends Service
{

    private final static URL ECCIAHORCADO_WSDL_LOCATION;
    private final static WebServiceException ECCIAHORCADO_EXCEPTION;
    private final static QName ECCIAHORCADO_QNAME = new QName("urn:ECCI_Ahorcado", "ECCI_Ahorcado");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://titanic.ecci.ucr.ac.cr/~eb10273/prueba/Ahorcado.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ECCIAHORCADO_WSDL_LOCATION = url;
        ECCIAHORCADO_EXCEPTION = e;
    }

    public ECCIAhorcado() {
        super(__getWsdlLocation(), ECCIAHORCADO_QNAME);
    }

    public ECCIAhorcado(WebServiceFeature... features) {
        super(__getWsdlLocation(), ECCIAHORCADO_QNAME, features);
    }

    public ECCIAhorcado(URL wsdlLocation) {
        super(wsdlLocation, ECCIAHORCADO_QNAME);
    }

    public ECCIAhorcado(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ECCIAHORCADO_QNAME, features);
    }

    public ECCIAhorcado(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ECCIAhorcado(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ECCIAhorcadoPort
     */
    @WebEndpoint(name = "ECCI_AhorcadoPort")
    public ECCIAhorcadoPort getECCIAhorcadoPort() {
        return super.getPort(new QName("urn:ECCI_Ahorcado", "ECCI_AhorcadoPort"), ECCIAhorcadoPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ECCIAhorcadoPort
     */
    @WebEndpoint(name = "ECCI_AhorcadoPort")
    public ECCIAhorcadoPort getECCIAhorcadoPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:ECCI_Ahorcado", "ECCI_AhorcadoPort"), ECCIAhorcadoPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ECCIAHORCADO_EXCEPTION!= null) {
            throw ECCIAHORCADO_EXCEPTION;
        }
        return ECCIAHORCADO_WSDL_LOCATION;
    }

}
