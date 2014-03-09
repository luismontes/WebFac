
package com.ekomercio.edixcfdisecure;

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
 *         &lt;element name="getCFDI_FromCFDResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getCFDIFromCFDResult"
})
@XmlRootElement(name = "getCFDI_FromCFDResponse")
public class GetCFDIFromCFDResponse {

    @XmlElement(name = "getCFDI_FromCFDResult")
    protected String getCFDIFromCFDResult;

    /**
     * Obtiene el valor de la propiedad getCFDIFromCFDResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetCFDIFromCFDResult() {
        return getCFDIFromCFDResult;
    }

    /**
     * Define el valor de la propiedad getCFDIFromCFDResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetCFDIFromCFDResult(String value) {
        this.getCFDIFromCFDResult = value;
    }

}
