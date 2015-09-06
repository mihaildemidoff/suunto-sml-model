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
@XmlRootElement(name = "Activity")
@XmlAccessorType(XmlAccessType.FIELD)
public class ActivityEvent {

    @XmlElement(name = "CustomModeId", required = false)
    private String customModeId;

    @XmlElement(name = "Type", required = false)
    private String type;

    public ActivityEvent() {
    }

    public String getCustomModeId() {
        return customModeId;
    }

    public void setCustomModeId(final String customModeId) {
        this.customModeId = customModeId;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("customModeId", customModeId)
            .append("type", type)
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

        final ActivityEvent that = (ActivityEvent) o;

        return new EqualsBuilder()
            .append(customModeId, that.customModeId)
            .append(type, that.type)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(customModeId)
            .append(type)
            .toHashCode();
    }
}
