
package libs.jaxb.dms.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Запрос на Получение документа
 * 
 * <p>Java class for ct_GetDocumentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_GetDocumentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificators" type="{http://www.raiffeisen.ru/esb/cnr/RBP/Document/v1}ct_Identificators"/>
 *         &lt;element name="docNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="versionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseFileDestination" type="{http://www.raiffeisen.ru/types/Document/v1}ct_FileDestination" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_GetDocumentRequest", namespace = "http://www.raiffeisen.ru/esb/cnr/RBP/Document/v1", propOrder = {
    "identificators",
    "docNumber",
    "versionId",
    "responseFileDestination"
})
public class CtGetDocumentRequest {

    @XmlElement(namespace = "http://www.raiffeisen.ru/esb/cnr/RBP/Document/v1", required = true)
    protected CtIdentificators identificators;
    @XmlElement(namespace = "http://www.raiffeisen.ru/esb/cnr/RBP/Document/v1", required = true)
    protected String docNumber;
    @XmlElement(namespace = "http://www.raiffeisen.ru/esb/cnr/RBP/Document/v1")
    protected String versionId;
    @XmlElement(namespace = "http://www.raiffeisen.ru/esb/cnr/RBP/Document/v1")
    protected CtFileDestination responseFileDestination;

    /**
     * Gets the value of the identificators property.
     * 
     * @return
     *     possible object is
     *     {@link CtIdentificators }
     *     
     */
    public CtIdentificators getIdentificators() {
        return identificators;
    }

    /**
     * Sets the value of the identificators property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtIdentificators }
     *     
     */
    public void setIdentificators(CtIdentificators value) {
        this.identificators = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Gets the value of the versionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * Sets the value of the versionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionId(String value) {
        this.versionId = value;
    }

    /**
     * Gets the value of the responseFileDestination property.
     * 
     * @return
     *     possible object is
     *     {@link CtFileDestination }
     *     
     */
    public CtFileDestination getResponseFileDestination() {
        return responseFileDestination;
    }

    /**
     * Sets the value of the responseFileDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtFileDestination }
     *     
     */
    public void setResponseFileDestination(CtFileDestination value) {
        this.responseFileDestination = value;
    }

}
