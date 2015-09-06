package com.github.mihaildemidoff.device;

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
@XmlRootElement(name = "Device")
@XmlAccessorType(XmlAccessType.FIELD)
public class Device {

    @XmlElement(name = "Name", required = false)
    private String name;

    @XmlElement(name = "SerialNumber", required = false)
    private String serialNumber;

    @XmlElement(name = "Info", required = false)
    private Info info;

    public Device() {
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(final String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(final Info info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("name", name)
            .append("serialNumber", serialNumber)
            .append("info", info)
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

        final Device device = (Device) o;

        return new EqualsBuilder()
            .append(name, device.name)
            .append(serialNumber, device.serialNumber)
            .append(info, device.info)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(name)
            .append(serialNumber)
            .append(info)
            .toHashCode();
    }
}
