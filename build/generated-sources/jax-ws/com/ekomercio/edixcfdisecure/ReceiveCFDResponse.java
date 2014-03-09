
package com.ekomercio.edixcfdisecure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="receiveCFDResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "receiveCFDResult"
})
@XmlRootElement(name = "receiveCFDResponse")
public class ReceiveCFDResponse {

    protected String receiveCFDResult;

    /**
     * Obtiene el valor de la propiedad receiveCFDResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveCFDResult() {
        return receiveCFDResult;
    }

    /**
     * Define el valor de la propiedad receiveCFDResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveCFDResult(String value) {
        this.receiveCFDResult = value;
    }

}
