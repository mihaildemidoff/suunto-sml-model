package com.github.mihaildemidoff.device;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * @author Mikhail Demidov
 */
@XmlRootElement(name = "Info")
@XmlAccessorType(XmlAccessType.FIELD)
public class Info {

    @XmlElement(name = "SW", required = false)
    private String sw;

    @XmlElement(name = "HW", required = false)
    private String hw;

    @XmlElement(name = "BSL", required = false)
    private String bsl;

    @XmlElement(name = "SWBuildDateTime", required = false)
    private Date softwareBuildTime;

    public Info() {
    }

    public String getSw() {
        return sw;
    }

    public void setSw(final String sw) {
        this.sw = sw;
    }

    public String getHw() {
        return hw;
    }

    public void setHw(final String hw) {
        this.hw = hw;
    }

    public String getBsl() {
        return bsl;
    }

    public void setBsl(final String bsl) {
        this.bsl = bsl;
    }

    public Date getSoftwareBuildTime() {
        return softwareBuildTime;
    }

    public void setSoftwareBuildTime(final Date softwareBuildTime) {
        this.softwareBuildTime = softwareBuildTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("sw", sw)
            .append("hw", hw)
            .append("bsl", bsl)
            .append("softwareBuildTime", softwareBuildTime)
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

        final Info info = (Info) o;

        return new EqualsBuilder()
            .append(sw, info.sw)
            .append(hw, info.hw)
            .append(bsl, info.bsl)
            .append(softwareBuildTime, info.softwareBuildTime)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(sw)
            .append(hw)
            .append(bsl)
            .append(softwareBuildTime)
            .toHashCode();
    }
}
