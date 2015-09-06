package com.github.mihaildemidoff;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Class represent root of the Sml file.
 * Sml element contains single DeviceLog element.
 *
 * @author Mikhail Demidov
 */
@XmlRootElement(name = "sml")
@XmlAccessorType(XmlAccessType.FIELD)
public class Sml {

    @XmlElement(name = "DeviceLog")
    private DeviceLog deviceLog;

    public Sml() {
    }

    public DeviceLog getDeviceLog() {
        return deviceLog;
    }

    public void setDeviceLog(final DeviceLog deviceLog) {
        this.deviceLog = deviceLog;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("deviceLog", deviceLog)
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
        final Sml sml = (Sml) o;

        return new EqualsBuilder()
            .append(deviceLog, sml.deviceLog)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(deviceLog)
            .toHashCode();
    }
}


