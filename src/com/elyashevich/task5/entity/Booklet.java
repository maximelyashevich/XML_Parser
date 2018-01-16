
package com.elyashevich.task5.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;

/**
 * <p>Java class for booklet complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="booklet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.com/papers}paperEdition">
 *       &lt;sequence>
 *         &lt;element name="booklet-chars" type="{http://www.example.com/papers}booklet-chars"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "booklet", namespace = "http://www.example.com/papers", propOrder = {
        "bookletCharacter"
})
public class Booklet extends PaperEdition {

    @XmlElement(name = "booklet-chars", namespace = "http://www.example.com/papers", required = true)
    private BookletCharacter bookletCharacter;

    public Booklet() {
        bookletCharacter = new BookletCharacter();
    }

    public Booklet(String title, boolean monthly, String id, String category, BookletCharacter bookletCharacter) {
        super(title, monthly, id, category);
        this.bookletCharacter = bookletCharacter;
    }

    /**
     * Gets the value of the bookletCharacter property.
     *
     * @return possible object is
     * {@link BookletCharacter }
     */
    public BookletCharacter getBookletCharacter() {
        return bookletCharacter;
    }

    /**
     * Sets the value of the bookletCharacter property.
     *
     * @param value allowed object is
     *              {@link BookletCharacter }
     */
    public void setBookletCharacter(BookletCharacter value) {
        this.bookletCharacter = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Booklet booklet = (Booklet) o;
        return Objects.equals(bookletCharacter, booklet.bookletCharacter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bookletCharacter);
    }

    @Override
    public String toString() {
        return "Booklet: " + super.toString() +
                ", bookletCharacter=" + bookletCharacter + "\n";
    }
}
