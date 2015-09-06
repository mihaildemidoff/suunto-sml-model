package com.github.mihaildemidoff.event;

import com.github.mihaildemidoff.adapter.SmlBooleanAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * @author Mikhail Demidov
 */
@XmlRootElement(name = "Pause")
@XmlAccessorType(XmlAccessType.FIELD)
public class PauseEvent {

    @XmlElement(name = "Type", required = false)
    private Integer type;

    @XmlElement(name = "Duration", required = false)
    private Double duration;

    @XmlElement(name = "Distance", required = false)
    private Integer distance;

    @XmlElement(name = "State", required = false)
    @XmlJavaTypeAdapter(SmlBooleanAdapter.class)
    private Boolean state;

    public PauseEvent() {
    }

    public Integer getType() {
        return type;
    }

    public void setType(final Integer type) {
        this.type = type;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(final Double duration) {
        this.duration = duration;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(final Integer distance) {
        this.distance = distance;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(final Boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("type", type)
            .append("duration", duration)
            .append("distance", distance)
            .append("state", state)
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

        final PauseEvent that = (PauseEvent) o;

        return new EqualsBuilder()
            .append(type, that.type)
            .append(duration, that.duration)
            .append(distance, that.distance)
            .append(state, that.state)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(duration)
            .append(distance)
            .append(state)
            .toHashCode();
    }
}
