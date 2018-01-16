
package com.elyashevich.task5.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;


/**
 * <p>Java class for magazine-chars complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="magazine-chars">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="color" type="{http://www.example.com/papers}color"/>
 *         &lt;element name="volume" type="{http://www.example.com/papers}volume"/>
 *         &lt;element name="glossiness" type="{http://www.example.com/papers}glossiness"/>
 *         &lt;element name="subscription-index" type="{http://www.example.com/papers}subscription-index"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "magazine-chars", namespace = "http://www.example.com/papers", propOrder = {
    "color",
    "volume",
    "glossiness",
    "subscriptionIndex"
})
public class MagazineCharacter {

    @XmlElement(namespace = "http://www.example.com/papers")
    private boolean color;
    @XmlElement(namespace = "http://www.example.com/papers")
    @XmlSchemaType(name = "positiveInteger")
    private int volume;
    @XmlElement(namespace = "http://www.example.com/papers")
    private boolean glossiness;
    @XmlElement(name = "subscription-index", namespace = "http://www.example.com/papers")
    @XmlSchemaType(name = "positiveInteger")
    private int subscriptionIndex;

    public MagazineCharacter() {
    }

    public MagazineCharacter(boolean color, int volume, boolean glossiness, int subscriptionIndex) {
        this.color = color;
        this.volume = volume;
        this.glossiness = glossiness;
        this.subscriptionIndex = subscriptionIndex;
    }

    /**
     * Gets the value of the color property.
     * 
     */
    public boolean isColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     */
    public void setColor(boolean value) {
        this.color = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     */
    public void setVolume(int value) {
        this.volume = value;
    }

    /**
     * Gets the value of the glossiness property.
     * 
     */
    public boolean isGlossiness() {
        return glossiness;
    }

    /**
     * Sets the value of the glossiness property.
     * 
     */
    public void setGlossiness(boolean value) {
        this.glossiness = value;
    }

    /**
     * Gets the value of the subscriptionIndex property.
     * 
     */
    public int getSubscriptionIndex() {
        return subscriptionIndex;
    }

    /**
     * Sets the value of the subscriptionIndex property.
     * 
     */
    public void setSubscriptionIndex(int value) {
        this.subscriptionIndex = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MagazineCharacter that = (MagazineCharacter) o;
        return color == that.color &&
                volume == that.volume &&
                glossiness == that.glossiness &&
                subscriptionIndex == that.subscriptionIndex;
    }

    @Override
    public int hashCode() {

        return Objects.hash(color, volume, glossiness, subscriptionIndex);
    }

    @Override
    public String toString() {
        return "MagazineCharacter{" +
                "color=" + color +
                ", volume=" + volume +
                ", glossiness=" + glossiness +
                ", subscriptionIndex=" + subscriptionIndex +
                '}';
    }
}
