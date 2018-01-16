
package com.elyashevich.task5.entity;

import javax.xml.bind.annotation.*;
import java.util.Objects;


/**
 * <p>Java class for booklet-chars complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="booklet-chars">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="color" type="{http://www.example.com/papers}color"/>
 *         &lt;element name="volume" type="{http://www.example.com/papers}volume"/>
 *         &lt;element name="glossiness" type="{http://www.example.com/papers}glossiness"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "booklet-chars", namespace = "http://www.example.com/papers", propOrder = {
        "color",
        "volume",
        "glossiness"
})
public class BookletCharacter {

    @XmlElement(namespace = "http://www.example.com/papers")
    private boolean color;
    @XmlElement(namespace = "http://www.example.com/papers")
    @XmlSchemaType(name = "positiveInteger")
    private int volume;
    @XmlElement(namespace = "http://www.example.com/papers")
    private boolean glossiness;

    public BookletCharacter() {
    }

    public BookletCharacter(boolean color, int volume, boolean glossiness) {
        this.color = color;
        this.volume = volume;
        this.glossiness = glossiness;
    }

    /**
     * Gets the value of the color property.
     */
    public boolean isColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     */
    public void setColor(boolean value) {
        this.color = value;
    }

    /**
     * Gets the value of the volume property.
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     */
    public void setVolume(int value) {
        this.volume = value;
    }

    /**
     * Gets the value of the glossiness property.
     */
    public boolean isGlossiness() {
        return glossiness;
    }

    /**
     * Sets the value of the glossiness property.
     */
    public void setGlossiness(boolean value) {
        this.glossiness = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookletCharacter that = (BookletCharacter) o;
        return color == that.color &&
                volume == that.volume &&
                glossiness == that.glossiness;
    }

    @Override
    public int hashCode() {

        return Objects.hash(color, volume, glossiness);
    }

    @Override
    public String toString() {
        return "BookletCharacter{" +
                "color=" + color +
                ", volume=" + volume +
                ", glossiness=" + glossiness +
                '}';
    }
}
