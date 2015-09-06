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
@XmlRootElement(name = "AppStatus")
@XmlAccessorType(XmlAccessType.FIELD)
public class AppStatusEvent {

    @XmlElement(name = "AppNumber")
    private Integer appNumber;

    @XmlElement(name = "Running")
    @XmlJavaTypeAdapter(SmlBooleanAdapter.class)
    private Boolean running;

    @XmlElement(name = "Displayed")
    @XmlJavaTypeAdapter(SmlBooleanAdapter.class)
    private Boolean displayed;

    @XmlElement(name = "Logged")
    @XmlJavaTypeAdapter(SmlBooleanAdapter.class)
    private Boolean logged;

    public AppStatusEvent() {
    }

    public Integer getAppNumber() {
        return appNumber;
    }

    public void setAppNumber(final Integer appNumber) {
        this.appNumber = appNumber;
    }

    public Boolean getRunning() {
        return running;
    }

    public void setRunning(final Boolean running) {
        this.running = running;
    }

    public Boolean getDisplayed() {
        return displayed;
    }

    public void setDisplayed(final Boolean displayed) {
        this.displayed = displayed;
    }

    public Boolean getLogged() {
        return logged;
    }

    public void setLogged(final Boolean logged) {
        this.logged = logged;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("appNumber", appNumber)
            .append("running", running)
            .append("displayed", displayed)
            .append("logged", logged)
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

        final AppStatusEvent that = (AppStatusEvent) o;

        return new EqualsBuilder()
            .append(appNumber, that.appNumber)
            .append(running, that.running)
            .append(displayed, that.displayed)
            .append(logged, that.logged)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(appNumber)
            .append(running)
            .append(displayed)
            .append(logged)
            .toHashCode();
    }
}
