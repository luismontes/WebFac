
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
 *         &lt;element name="getCFDI_FromCFDTokenResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getCFDIFromCFDTokenResult"
})
@XmlRootElement(name = "getCFDI_FromCFDTokenResponse")
public class GetCFDIFromCFDTokenResponse {

    @XmlElement(name = "getCFDI_FromCFDTokenResult")
    protected String getCFDIFromCFDTokenResult;

    /**
     * Obtiene el valor de la propiedad getCFDIFromCFDTokenResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetCFDIFromCFDTokenResult() {
        return getCFDIFromCFDTokenResult;
    }

    /**
     * Define el valor de la propiedad getCFDIFromCFDTokenResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetCFDIFromCFDTokenResult(String value) {
        this.getCFDIFromCFDTokenResult = value;
    }

}
