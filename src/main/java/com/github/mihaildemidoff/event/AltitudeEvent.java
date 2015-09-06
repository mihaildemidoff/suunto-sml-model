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
@XmlRootElement(name = "AltitudeEvent")
@XmlAccessorType(XmlAccessType.FIELD)
public class AltitudeEvent {

    @XmlElement(name = "Source", required = false)
    private String source;

    @XmlElement(name = "AltitudeOffset", required = false)
    private Integer altitudeOffset;

    @XmlElement(name = "PressureOffset", required = false)
    private Integer pressureOffset;

    @XmlElement(name = "UTC", required = false)
    private Date utc;

    public AltitudeEvent() {
    }

    public String getSource() {
        return source;
    }

    public void setSource(final String source) {
        this.source = source;
    }

    public Integer getAltitudeOffset() {
        return altitudeOffset;
    }

    public void setAltitudeOffset(final Integer altitudeOffset) {
        this.altitudeOffset = altitudeOffset;
    }

    public Integer getPressureOffset() {
        return pressureOffset;
    }

    public void setPressureOffset(final Integer pressureOffset) {
        this.pressureOffset = pressureOffset;
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
            .append("altitudeOffset", altitudeOffset)
            .append("pressureOffset", pressureOffset)
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

        final AltitudeEvent that = (AltitudeEvent) o;

        return new EqualsBuilder()
            .append(source, that.source)
            .append(altitudeOffset, that.altitudeOffset)
            .append(pressureOffset, that.pressureOffset)
            .append(utc, that.utc)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(source)
            .append(altitudeOffset)
            .append(pressureOffset)
            .append(utc)
            .toHashCode();
    }
}
