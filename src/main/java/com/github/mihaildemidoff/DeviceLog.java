package com.github.mihaildemidoff;

import com.github.mihaildemidoff.app.App;
import com.github.mihaildemidoff.device.Device;
import com.github.mihaildemidoff.header.Header;
import com.github.mihaildemidoff.rr.RR;
import com.github.mihaildemidoff.sample.Sample;
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
 * Class represent DeviceLog sml element.
 * Class contains several sections:
 * <ul>
 * <li>{@link Header} - summary of the workout</li>
 * <li>{@link Device} - device info</li>
 * <li>List of {@link App}s - apps used for the workout</li>
 * <li>List of {@link Sample}s - each sample represents piece of workout info such as: HR, gps info etc.</li>
 * <li>{@link RR} - heart rate variability info</li>
 * </ul>
 *
 * @author Mikhail Demidov
 * @see Header
 * @see Device
 * @see App
 * @see Sample
 * @see RR
 */
@XmlRootElement(name = "DeviceLog")
@XmlAccessorType(XmlAccessType.FIELD)
public class DeviceLog {

    @XmlElement(name = "Header", required = false)
    private Header header;

    @XmlElement(name = "Device", required = false)
    private Device device;

    @XmlElementWrapper(name = "Apps", required = false)
    @XmlElement(name = "App", required = false)
    private List<App> apps;

    @XmlElementWrapper(name = "Samples")
    @XmlElement(name = "Sample", type = Sample.class)
    private List<Sample> samples;

    @XmlElement(name = "R-R")
    private RR heartRateVariability;

    public DeviceLog() {
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(final Header header) {
        this.header = header;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(final Device device) {
        this.device = device;
    }

    public List<Sample> getSamples() {
        return samples;
    }

    public void setSamples(final List<Sample> samples) {
        this.samples = samples;
    }

    public List<App> getApps() {
        return apps;
    }

    public void setApps(final List<App> apps) {
        this.apps = apps;
    }

    public RR getHeartRateVariability() {
        return heartRateVariability;
    }

    public void setHeartRateVariability(final RR heartRateVariability) {
        this.heartRateVariability = heartRateVariability;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("header", header)
            .append("device", device)
            .append("apps", apps)
            .append("samples", samples)
            .append("heartRateVariability", heartRateVariability)
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

        final DeviceLog deviceLog = (DeviceLog) o;

        return new EqualsBuilder()
            .append(header, deviceLog.header)
            .append(device, deviceLog.device)
            .append(apps, deviceLog.apps)
            .append(samples, deviceLog.samples)
            .append(heartRateVariability, deviceLog.heartRateVariability)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(header)
            .append(device)
            .append(apps)
            .append(samples)
            .append(heartRateVariability)
            .toHashCode();
    }
}
