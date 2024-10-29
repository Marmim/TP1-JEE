
package proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour student complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="student">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateNaiss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filiere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "student", propOrder = {
    "cin",
    "dateNaiss",
    "filiere",
    "fullName",
    "id"
})
public class Student {

    @XmlElement(name = "CIN")
    protected String cin;
    protected String dateNaiss;
    protected String filiere;
    protected String fullName;
    protected int id;

    /**
     * Obtient la valeur de la propriété cin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIN() {
        return cin;
    }

    /**
     * Définit la valeur de la propriété cin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIN(String value) {
        this.cin = value;
    }

    /**
     * Obtient la valeur de la propriété dateNaiss.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateNaiss() {
        return dateNaiss;
    }

    /**
     * Définit la valeur de la propriété dateNaiss.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateNaiss(String value) {
        this.dateNaiss = value;
    }

    /**
     * Obtient la valeur de la propriété filiere.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiliere() {
        return filiere;
    }

    /**
     * Définit la valeur de la propriété filiere.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiliere(String value) {
        this.filiere = value;
    }

    /**
     * Obtient la valeur de la propriété fullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Définit la valeur de la propriété fullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
