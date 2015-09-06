package com.github.mihaildemidoff.event;

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
@XmlRootElement(name = "Lap")
@XmlAccessorType(XmlAccessType.FIELD)
public class LapEvent {

    @XmlElement(name = "Type", required = false)
    private String type;

    @XmlElement(name = "Duration", required = false)
    private Double duration;

    @XmlElement(name = "Distance", required = false)
    private Double distance;

    public LapEvent() {
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(final Double duration) {
        this.duration = duration;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(final Double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("type", type)
            .append("duration", duration)
            .append("distance", distance)
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

        final LapEvent lapEvent = (LapEvent) o;

        return new EqualsBuilder()
            .append(type, lapEvent.type)
            .append(duration, lapEvent.duration)
            .append(distance, lapEvent.distance)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(duration)
            .append(distance)
            .toHashCode();
    }
}
