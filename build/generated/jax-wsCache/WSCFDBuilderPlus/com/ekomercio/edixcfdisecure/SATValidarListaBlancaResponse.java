
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
 *         &lt;element name="SAT_ValidarListaBlancaResult" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "satValidarListaBlancaResult",
    "cMensaje"
})
@XmlRootElement(name = "SAT_ValidarListaBlancaResponse")
public class SATValidarListaBlancaResponse {

    @XmlElement(name = "SAT_ValidarListaBlancaResult")
    protected long satValidarListaBlancaResult;
    protected String cMensaje;

    /**
     * Obtiene el valor de la propiedad satValidarListaBlancaResult.
     * 
     */
    public long getSATValidarListaBlancaResult() {
        return satValidarListaBlancaResult;
    }

    /**
     * Define el valor de la propiedad satValidarListaBlancaResult.
     * 
     */
    public void setSATValidarListaBlancaResult(long value) {
        this.satValidarListaBlancaResult = value;
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
