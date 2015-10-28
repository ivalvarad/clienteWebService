
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
 *         &lt;element name="siGanoResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "siGanoResult"
})
@XmlRootElement(name = "siGanoReturn")
public class SiGanoReturn {

    @XmlElement(required = true)
    protected String siGanoResult;

    /**
     * Obtiene el valor de la propiedad siGanoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiGanoResult() {
        return siGanoResult;
    }

    /**
     * Define el valor de la propiedad siGanoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiGanoResult(String value) {
        this.siGanoResult = value;
    }

}
