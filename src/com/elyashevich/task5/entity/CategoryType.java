
package com.elyashevich.task5.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for category.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="category">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="news"/>
 *     &lt;enumeration value="entertainment"/>
 *     &lt;enumeration value="science"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "category", namespace = "http://www.example.com/papers")
@XmlEnum
public enum CategoryType {
    @XmlEnumValue("news")
    NEWS("news"),
    @XmlEnumValue("entertainment")
    ENTERTAINMENT("entertainment"),
    @XmlEnumValue("science")
    SCIENCE("science");
    private final String value;

    CategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryType fromValue(String v) {
        for (CategoryType c : CategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
