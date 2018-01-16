
package com.elyashevich.task5.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;


/**
 * <p>Java class for newspaper complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="newspaper">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.com/papers}paperEdition">
 *       &lt;sequence>
 *         &lt;element name="news-chars" type="{http://www.example.com/papers}news-chars"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "newspaper", namespace = "http://www.example.com/papers", propOrder = {
        "newsCharacter"
})
public class Newspaper extends PaperEdition {

    @XmlElement(name = "news-chars", namespace = "http://www.example.com/papers", required = true)
    private NewsCharacter newsCharacter;

    public Newspaper() {
        newsCharacter = new NewsCharacter();
    }

    public Newspaper(String title, boolean monthly, String id, String category, NewsCharacter newsCharacter) {
        super(title, monthly, id, category);
        this.newsCharacter = newsCharacter;
    }

    /**
     * Gets the value of the newsCharacter property.
     *
     * @return possible object is
     * {@link NewsCharacter }
     */
    public NewsCharacter getNewsCharacter() {
        return newsCharacter;
    }

    /**
     * Sets the value of the newsCharacter property.
     *
     * @param value allowed object is
     *              {@link NewsCharacter }
     */
    public void setNewsCharacter(NewsCharacter value) {
        this.newsCharacter = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Newspaper newspaper = (Newspaper) o;
        return Objects.equals(newsCharacter, newspaper.newsCharacter);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), newsCharacter);
    }

    @Override
    public String toString() {
        return "Newspaper: " + super.toString() +
                ", newsCharacter=" + newsCharacter + "\n";
    }
}
