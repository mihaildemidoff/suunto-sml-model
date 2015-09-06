package com.github.mihaildemidoff.event;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * @author Mikhail Demidov
 */
@XmlRootElement(name = "CadenceEvent")
@XmlAccessorType(XmlAccessType.FIELD)
public class CadenceEvent {

    @XmlElement(name = "Source", required = false)
    private String source;

    @XmlElement(name = "UTC", required = false)
    private Date utc;

    public CadenceEvent() {
    }

    public String getSource() {
        return source;
    }

    public void setSource(final String source) {
        this.source = source;
    }

    public Date getUtc() {
        return utc;
    }

    public void setUtc(final Date utc) {
        this.utc = utc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("source", source)
            .append("utc", utc)
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

        final CadenceEvent that = (CadenceEvent) o;

        return new EqualsBuilder()
            .append(source, that.source)
            .append(utc, that.utc)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(source)
            .append(utc)
            .toHashCode();
    }
}
