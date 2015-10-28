
package ecci_ahorcado;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getPalabraResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPalabraResult"
})
@XmlRootElement(name = "getPalabraReturn")
public class GetPalabraReturn {

    @XmlElement(required = true)
    protected String getPalabraResult;

    /**
     * Obtiene el valor de la propiedad getPalabraResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPalabraResult() {
        return getPalabraResult;
    }

    /**
     * Define el valor de la propiedad getPalabraResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPalabraResult(String value) {
        this.getPalabraResult = value;
    }

}
