
package com.elyashevich.task5.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;


/**
 * <p>Java class for magazine complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="magazine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.example.com/papers}paperEdition">
 *       &lt;sequence>
 *         &lt;element name="magazine-chars" type="{http://www.example.com/papers}magazine-chars"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "magazine", namespace = "http://www.example.com/papers", propOrder = {
        "magazineCharacter"
})
public class Magazine extends PaperEdition {

    @XmlElement(name = "magazine-chars", namespace = "http://www.example.com/papers", required = true)
    private MagazineCharacter magazineCharacter;

    public Magazine() {
        magazineCharacter = new MagazineCharacter();
    }

    public Magazine(String title, boolean monthly, String id, String category, MagazineCharacter magazineCharacter) {
        super(title, monthly, id, category);
        this.magazineCharacter = magazineCharacter;
    }

    /**
     * Gets the value of the magazineCharacter property.
     *
     * @return possible object is
     * {@link MagazineCharacter }
     */
    public MagazineCharacter getMagazineCharacter() {
        return magazineCharacter;
    }

    /**
     * Sets the value of the magazineCharacter property.
     *
     * @param value allowed object is
     *              {@link MagazineCharacter }
     */
    public void setMagazineCharacter(MagazineCharacter value) {
        this.magazineCharacter = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(magazineCharacter, magazine.magazineCharacter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), magazineCharacter);
    }

    @Override
    public String toString() {
        return "Magazine: " + super.toString() +
                ", magazineCharacter=" + magazineCharacter + "\n";
    }
}
