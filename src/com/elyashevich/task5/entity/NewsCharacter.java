
package com.elyashevich.task5.entity;

import javax.xml.bind.annotation.*;
import java.util.Objects;


/**
 * <p>Java class for news-chars complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="news-chars">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="color" type="{http://www.example.com/papers}color"/>
 *         &lt;element name="volume" type="{http://www.example.com/papers}volume"/>
 *         &lt;element name="subscription-index" type="{http://www.example.com/papers}subscription-index"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "news-chars", namespace = "http://www.example.com/papers", propOrder = {
        "color",
        "volume",
        "subscriptionIndex"
})
public class NewsCharacter {

    @XmlElement(namespace = "http://www.example.com/papers")
    private boolean color;
    @XmlElement(namespace = "http://www.example.com/papers")
    @XmlSchemaType(name = "positiveInteger")
    private int volume;
    @XmlElement(name = "subscription-index", namespace = "http://www.example.com/papers")
    @XmlSchemaType(name = "positiveInteger")
    private int subscriptionIndex;

    public NewsCharacter() {
    }

    public NewsCharacter(boolean color, int volume, int subscriptionIndex) {
        this.color = color;
        this.volume = volume;
        this.subscriptionIndex = subscriptionIndex;
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
     * Gets the value of the subscriptionIndex property.
     */
    public int getSubscriptionIndex() {
        return subscriptionIndex;
    }

    /**
     * Sets the value of the subscriptionIndex property.
     */
    public void setSubscriptionIndex(int value) {
        this.subscriptionIndex = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsCharacter that = (NewsCharacter) o;
        return color == that.color &&
                volume == that.volume &&
                subscriptionIndex == that.subscriptionIndex;
    }

    @Override
    public int hashCode() {

        return Objects.hash(color, volume, subscriptionIndex);
    }

    @Override
    public String toString() {
        return "NewsCharacter{" +
                "color=" + color +
                ", volume=" + volume +
                ", subscriptionIndex=" + subscriptionIndex +
                '}';
    }
}
