//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.08 at 03:34:25 PM CET 
//


package org.escidoc.core.domain.sru;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.axis.types.NonNegativeInteger;


/**
 * <p>Java class for searchRetrieveResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchRetrieveResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.loc.gov/zing/srw/}responseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}numberOfRecords"/>
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}resultSetId" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}resultSetIdleTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}records" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}nextRecordPosition" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}echoedSearchRetrieveRequest" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}diagnostics" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/zing/srw/}extraResponseData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchRetrieveResponseType", propOrder = {
    "numberOfRecords",
    "resultSetId",
    "resultSetIdleTime",
    "records",
    "nextRecordPosition",
    "echoedSearchRetrieveRequest",
    "diagnostics",
    "extraResponseData"
})
public class SearchRetrieveResponseType
    extends ResponseType
    implements Serializable
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected NonNegativeInteger numberOfRecords;
    protected String resultSetId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "positiveInteger")
    protected org.apache.axis.types.PositiveInteger resultSetIdleTime;
    protected RecordsType records;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "positiveInteger")
    protected org.apache.axis.types.PositiveInteger nextRecordPosition;
    protected EchoedSearchRetrieveRequestType echoedSearchRetrieveRequest;
    protected DiagnosticsType diagnostics;
    protected ExtraDataType extraResponseData;

    /**
     * Gets the value of the numberOfRecords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public NonNegativeInteger getNumberOfRecords() {
        return numberOfRecords;
    }

    /**
     * Sets the value of the numberOfRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfRecords(NonNegativeInteger value) {
        this.numberOfRecords = value;
    }

    /**
     * Gets the value of the resultSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultSetId() {
        return resultSetId;
    }

    /**
     * Sets the value of the resultSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultSetId(String value) {
        this.resultSetId = value;
    }

    /**
     * Gets the value of the resultSetIdleTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.apache.axis.types.PositiveInteger getResultSetIdleTime() {
        return resultSetIdleTime;
    }

    /**
     * Sets the value of the resultSetIdleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultSetIdleTime(org.apache.axis.types.PositiveInteger value) {
        this.resultSetIdleTime = value;
    }

    /**
     * Gets the value of the records property.
     * 
     * @return
     *     possible object is
     *     {@link RecordsType }
     *     
     */
    public RecordsType getRecords() {
        return records;
    }

    /**
     * Sets the value of the records property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordsType }
     *     
     */
    public void setRecords(RecordsType value) {
        this.records = value;
    }

    /**
     * Gets the value of the nextRecordPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public org.apache.axis.types.PositiveInteger getNextRecordPosition() {
        return nextRecordPosition;
    }

    /**
     * Sets the value of the nextRecordPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextRecordPosition(org.apache.axis.types.PositiveInteger value) {
        this.nextRecordPosition = value;
    }

    /**
     * Gets the value of the echoedSearchRetrieveRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EchoedSearchRetrieveRequestType }
     *     
     */
    public EchoedSearchRetrieveRequestType getEchoedSearchRetrieveRequest() {
        return echoedSearchRetrieveRequest;
    }

    /**
     * Sets the value of the echoedSearchRetrieveRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EchoedSearchRetrieveRequestType }
     *     
     */
    public void setEchoedSearchRetrieveRequest(EchoedSearchRetrieveRequestType value) {
        this.echoedSearchRetrieveRequest = value;
    }

    /**
     * Gets the value of the diagnostics property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticsType }
     *     
     */
    public DiagnosticsType getDiagnostics() {
        return diagnostics;
    }

    /**
     * Sets the value of the diagnostics property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticsType }
     *     
     */
    public void setDiagnostics(DiagnosticsType value) {
        this.diagnostics = value;
    }

    /**
     * Gets the value of the extraResponseData property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraDataType }
     *     
     */
    public ExtraDataType getExtraResponseData() {
        return extraResponseData;
    }

    /**
     * Sets the value of the extraResponseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraDataType }
     *     
     */
    public void setExtraResponseData(ExtraDataType value) {
        this.extraResponseData = value;
    }

}