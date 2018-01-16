
package com.elyashevich.task5.entity;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Objects;


/**
 * <p>Java class for paperEdition complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="paperEdition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.example.com/papers}title"/>
 *         &lt;element name="monthly" type="{http://www.example.com/papers}monthly"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="category" default="news">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="home"/>
 *             &lt;enumeration value="sport"/>
 *             &lt;enumeration value="cosmetic"/>
 *             &lt;enumeration value="science"/>
 *             &lt;enumeration value="fashion"/>
 *             &lt;enumeration value="entertainment"/>
 *             &lt;enumeration value="news"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paperEdition", namespace = "http://www.example.com/papers", propOrder = {
        "title",
        "monthly"
})
@XmlSeeAlso({
        Newspaper.class,
        Booklet.class,
        Magazine.class
})
public class PaperEdition {

    @XmlElement(namespace = "http://www.example.com/papers", required = true)
    private String title;
    @XmlElement(namespace = "http://www.example.com/papers")
    private boolean monthly;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    private String id;
    @XmlAttribute(name = "category")
    private String category;

    public PaperEdition(String title, boolean monthly, String id, String category) {
        this.title = title;
        this.monthly = monthly;
        this.id = id;
        this.category = category;
    }

    public PaperEdition() {
    }

    /**
     * Gets the value of the title property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the monthly property.
     */
    public boolean isMonthly() {
        return monthly;
    }

    /**
     * Sets the value of the monthly property.
     */
    public void setMonthly(boolean value) {
        this.monthly = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the category property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCategory() {
        if (category == null) {
            return "news";
        } else {
            return category;
        }
    }

    /**
     * Sets the value of the category property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCategory(String value) {
        this.category = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaperEdition that = (PaperEdition) o;
        return monthly == that.monthly &&
                Objects.equals(title, that.title) &&
                Objects.equals(id, that.id) &&
                Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, monthly, id, category);
    }

    @Override
    public String toString() {
        return "->" +
                "title='" + title + '\'' +
                ", monthly=" + monthly +
                ", id='" + id + '\'' +
                ", category='" + category + "' ";
    }
}
