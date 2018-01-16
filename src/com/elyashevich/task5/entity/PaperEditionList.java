
package com.elyashevich.task5.entity;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.example.com/papers}paperEdition" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlRootElement
public class PaperEditionList {

@XmlElement(name = "paperEdition")
    private List<PaperEdition> paperEdition;

    /**
     * Gets the value of the paperEdition property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paperEdition property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaperEdition().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PaperEdition }{@code >}
     * {@link JAXBElement }{@code <}{@link Magazine }{@code >}
     * {@link JAXBElement }{@code <}{@link Booklet }{@code >}
     * {@link JAXBElement }{@code <}{@link Newspaper }{@code >}
     *
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-12-18T12:06:55+03:00")
    public List<PaperEdition> getPaperEdition() {
        if (paperEdition == null) {
            paperEdition = new ArrayList<PaperEdition>();
        }
        return this.paperEdition;
    }

    @Override
    public String toString() {
        return "PaperEditionList{" +
                "paperEdition=" + paperEdition +
                '}';
    }
}
