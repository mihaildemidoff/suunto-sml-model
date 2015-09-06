package com.github.mihaildemidoff.event;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author Mikhail Demidov
 */
@XmlRootElement(name = "Swimming")
@XmlAccessorType(XmlAccessType.FIELD)
public class SwimmingEvent {

    @XmlElement(name = "Type", required = false)
    private String type;

    @XmlElement(name = "PrevPoolLengthStyle", required = false)
    private String prevPoolLengthStyle;

    @XmlElement(name = "Item", required = false)
    @XmlElementWrapper(name = "ClassificationVector", required = false)
    private List<Integer> classificationVector;

    @XmlElement(name = "TotalLengths", required = false)
    private Integer totalLengths;

    public SwimmingEvent() {
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getPrevPoolLengthStyle() {
        return prevPoolLengthStyle;
    }

    public void setPrevPoolLengthStyle(final String prevPoolLengthStyle) {
        this.prevPoolLengthStyle = prevPoolLengthStyle;
    }

    public List<Integer> getClassificationVector() {
        return classificationVector;
    }

    public void setClassificationVector(final List<Integer> classificationVector) {
        this.classificationVector = classificationVector;
    }

    public Integer getTotalLengths() {
        return totalLengths;
    }

    public void setTotalLengths(final Integer totalLengths) {
        this.totalLengths = totalLengths;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("type", type)
            .append("prevPoolLengthStyle", prevPoolLengthStyle)
            .append("classificationVector", classificationVector)
            .append("totalLengths", totalLengths)
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

        final SwimmingEvent that = (SwimmingEvent) o;

        return new EqualsBuilder()
            .append(type, that.type)
            .append(prevPoolLengthStyle, that.prevPoolLengthStyle)
            .append(classificationVector, that.classificationVector)
            .append(totalLengths, that.totalLengths)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(prevPoolLengthStyle)
            .append(classificationVector)
            .append(totalLengths)
            .toHashCode();
    }
}
