
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
 *         &lt;element name="SAT_ValidarCertificadoPropiosMediosResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nValidacionCertificado" type="{http://edixcfdisecure.ekomercio.com/}EnValidacionCertificado"/>
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
    "satValidarCertificadoPropiosMediosResult",
    "nValidacionCertificado",
    "cMensaje"
})
@XmlRootElement(name = "SAT_ValidarCertificadoPropiosMediosResponse")
public class SATValidarCertificadoPropiosMediosResponse {

    @XmlElement(name = "SAT_ValidarCertificadoPropiosMediosResult")
    protected boolean satValidarCertificadoPropiosMediosResult;
    @XmlElement(required = true)
    protected EnValidacionCertificado nValidacionCertificado;
    protected String cMensaje;

    /**
     * Obtiene el valor de la propiedad satValidarCertificadoPropiosMediosResult.
     * 
     */
    public boolean isSATValidarCertificadoPropiosMediosResult() {
        return satValidarCertificadoPropiosMediosResult;
    }

    /**
     * Define el valor de la propiedad satValidarCertificadoPropiosMediosResult.
     * 
     */
    public void setSATValidarCertificadoPropiosMediosResult(boolean value) {
        this.satValidarCertificadoPropiosMediosResult = value;
    }

    /**
     * Obtiene el valor de la propiedad nValidacionCertificado.
     * 
     * @return
     *     possible object is
     *     {@link EnValidacionCertificado }
     *     
     */
    public EnValidacionCertificado getNValidacionCertificado() {
        return nValidacionCertificado;
    }

    /**
     * Define el valor de la propiedad nValidacionCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link EnValidacionCertificado }
     *     
     */
    public void setNValidacionCertificado(EnValidacionCertificado value) {
        this.nValidacionCertificado = value;
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
