package com.github.mihaildemidoff.app;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mikhail Demidov
 */
@XmlRootElement(name = "AppData")
@XmlAccessorType(XmlAccessType.FIELD)
public class AppData {

    @XmlElement(name = "AppNumber", required = false)
    private Integer appNumber;

    @XmlElement(name = "Value", required = false)
    private Double value;

    public AppData() {
    }

    public Integer getAppNumber() {
        return appNumber;
    }

    public void setAppNumber(final Integer appNumber) {
        this.appNumber = appNumber;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(final Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("appNumber", appNumber)
            .append("value", value)
            .toString();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final AppData appData = (AppData) o;

        return new EqualsBuilder()
            .append(appNumber, appData.appNumber)
            .append(value, appData.value)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(appNumber)
            .append(value)
            .toHashCode();
    }
}
