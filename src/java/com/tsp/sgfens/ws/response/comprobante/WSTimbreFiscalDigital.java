//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.01 at 12:09:45 PM CST 
//
package com.tsp.sgfens.ws.response.comprobante;

import java.io.Serializable;


public class WSTimbreFiscalDigital
        implements Serializable {

    private final static long serialVersionUID = -6026937020915831338L;
    protected String version;
    protected String UUID;
    protected String fechaTimbrado;
    protected String selloCFD;
    protected String noCertificadoSAT;
    protected String selloSAT;
    protected String timbreFiscalDigitalCadenaOriginal;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    /*
    public String getUUID() {
        return uUID;
    }*/

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    /*
    public void setUUID(String value) {
        this.uUID = value;
    }*/

    public String getFechaTimbrado() {
        return fechaTimbrado;
    }

    public void setFechaTimbrado(String fechaTimbrado) {
        this.fechaTimbrado = fechaTimbrado;
    }



    /**
     * Gets the value of the fechaTimbrado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    /*
    public Date getFechaTimbrado() {
        return fechaTimbrado;
    }
*/
    /**
     * Sets the value of the fechaTimbrado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    /*
    public void setFechaTimbrado(Date value) {
        this.fechaTimbrado = value;
    }
     */
    

    /**
     * Gets the value of the selloCFD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelloCFD() {
        return selloCFD;
    }

    /**
     * Sets the value of the selloCFD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelloCFD(String value) {
        this.selloCFD = value;
    }

    /**
     * Gets the value of the noCertificadoSAT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCertificadoSAT() {
        return noCertificadoSAT;
    }

    /**
     * Sets the value of the noCertificadoSAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCertificadoSAT(String value) {
        this.noCertificadoSAT = value;
    }

    /**
     * Gets the value of the selloSAT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelloSAT() {
        return selloSAT;
    }

    /**
     * Sets the value of the selloSAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelloSAT(String value) {
        this.selloSAT = value;
    }

    public String getTimbreFiscalDigitalCadenaOriginal() {
        return timbreFiscalDigitalCadenaOriginal;
    }

    public void setTimbreFiscalDigitalCadenaOriginal(String timbreFiscalDigitalCadenaOriginal) {
        this.timbreFiscalDigitalCadenaOriginal = timbreFiscalDigitalCadenaOriginal;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }
    
    
}
