package com.github.mihaildemidoff.satellite;

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
@XmlRootElement(name = "Satellite")
@XmlAccessorType(XmlAccessType.FIELD)
public class Satellite {

    @XmlElement(name = "SV", required = false)
    private Integer spaceVehicle;

    @XmlElement(name = "SNR", required = false)
    private Integer signalToNoiseRatio;

    @XmlElement(name = "CodeLocked", required = false)
    private Boolean codeLocked;

    @XmlElement(name = "Ephemeris", required = false)
    private Boolean ephemeris;

    @XmlElement(name = "Custom", required = false)
    private String custom;

    public Satellite() {
    }

    public Integer getSpaceVehicle() {
        return spaceVehicle;
    }

    public void setSpaceVehicle(final Integer spaceVehicle) {
        this.spaceVehicle = spaceVehicle;
    }

    public Integer getSignalToNoiseRatio() {
        return signalToNoiseRatio;
    }

    public void setSignalToNoiseRatio(final Integer signalToNoiseRatio) {
        this.signalToNoiseRatio = signalToNoiseRatio;
    }

    public Boolean getCodeLocked() {
        return codeLocked;
    }

    public void setCodeLocked(final Boolean codeLocked) {
        this.codeLocked = codeLocked;
    }

    public Boolean getEphemeris() {
        return ephemeris;
    }

    public void setEphemeris(final Boolean ephemeris) {
        this.ephemeris = ephemeris;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(final String custom) {
        this.custom = custom;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("spaceVehicle", spaceVehicle)
            .append("signalToNoiseRatio", signalToNoiseRatio)
            .append("codeLocked", codeLocked)
            .append("ephemeris", ephemeris)
            .append("custom", custom)
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

        final Satellite satellite = (Satellite) o;

        return new EqualsBuilder()
            .append(spaceVehicle, satellite.spaceVehicle)
            .append(signalToNoiseRatio, satellite.signalToNoiseRatio)
            .append(codeLocked, satellite.codeLocked)
            .append(ephemeris, satellite.ephemeris)
            .append(custom, satellite.custom)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(spaceVehicle)
            .append(signalToNoiseRatio)
            .append(codeLocked)
            .append(ephemeris)
            .append(custom)
            .toHashCode();
    }
}
