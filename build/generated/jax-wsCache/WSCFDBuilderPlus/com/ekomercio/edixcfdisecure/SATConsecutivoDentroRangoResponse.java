
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
 *         &lt;element name="SAT_ConsecutivoDentroRangoResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "satConsecutivoDentroRangoResult",
    "cMensaje"
})
@XmlRootElement(name = "SAT_ConsecutivoDentroRangoResponse")
public class SATConsecutivoDentroRangoResponse {

    @XmlElement(name = "SAT_ConsecutivoDentroRangoResult")
    protected boolean satConsecutivoDentroRangoResult;
    protected String cMensaje;

    /**
     * Obtiene el valor de la propiedad satConsecutivoDentroRangoResult.
     * 
     */
    public boolean isSATConsecutivoDentroRangoResult() {
        return satConsecutivoDentroRangoResult;
    }

    /**
     * Define el valor de la propiedad satConsecutivoDentroRangoResult.
     * 
     */
    public void setSATConsecutivoDentroRangoResult(boolean value) {
        this.satConsecutivoDentroRangoResult = value;
    }

    /**
     * Obtiene el valor de la propiedad cMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMensaje() {
        return cMensaje;
    }

    /**
     * Define el valor de la propiedad cMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMensaje(String value) {
        this.cMensaje = value;
    }

}
