package com.github.mihaildemidoff.header;

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
@XmlRootElement(name = "Cadence")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cadence {

    @XmlElement(name = "Avg", required = false)
    private Double average;


    @XmlElement(name = "Max", required = false)
    private Double max;

    @XmlElement(name = "MaxTime", required = false)
    private Double maxTime;

    public Cadence() {
    }

    public Double getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(final Double maxTime) {
        this.maxTime = maxTime;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(final Double average) {
        this.average = average;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(final Double max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("average", average)
            .append("max", max)
            .append("maxTime", maxTime)
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

        final Cadence cadence = (Cadence) o;

        return new EqualsBuilder()
            .append(average, cadence.average)
            .append(max, cadence.max)
            .append(maxTime, cadence.maxTime)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(average)
            .append(max)
            .append(maxTime)
            .toHashCode();
    }
}
