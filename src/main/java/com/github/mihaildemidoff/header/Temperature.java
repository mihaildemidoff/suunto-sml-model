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
@XmlRootElement(name = "Temperature")
@XmlAccessorType(XmlAccessType.FIELD)
public class Temperature {

    @XmlElement(name = "Max", required = false)
    private Double max;

    @XmlElement(name = "Min", required = false)
    private Double min;

    @XmlElement(name = "MaxTime", required = false)
    private Double maxTime;

    @XmlElement(name = "MinTime", required = false)
    private Double minTime;

    public Temperature() {
    }

    public Double getMax() {
        return max;
    }

    public void setMax(final Double max) {
        this.max = max;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(final Double min) {
        this.min = min;
    }

    public Double getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(final Double maxTime) {
        this.maxTime = maxTime;
    }

    public Double getMinTime() {
        return minTime;
    }

    public void setMinTime(final Double minTime) {
        this.minTime = minTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("max", max)
            .append("min", min)
            .append("maxTime", maxTime)
            .append("minTime", minTime)
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

        final Temperature that = (Temperature) o;

        return new EqualsBuilder()
            .append(max, that.max)
            .append(min, that.min)
            .append(maxTime, that.maxTime)
            .append(minTime, that.minTime)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(max)
            .append(min)
            .append(maxTime)
            .append(minTime)
            .toHashCode();
    }
}
