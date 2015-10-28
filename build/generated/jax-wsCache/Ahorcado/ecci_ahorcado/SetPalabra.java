
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
 *         &lt;element name="nPalabra" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "nPalabra"
})
@XmlRootElement(name = "setPalabra")
public class SetPalabra {

    @XmlElement(required = true, nillable = true)
    protected String nPalabra;

    /**
     * Obtiene el valor de la propiedad nPalabra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPalabra() {
        return nPalabra;
    }

    /**
     * Define el valor de la propiedad nPalabra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPalabra(String value) {
        this.nPalabra = value;
    }

}
