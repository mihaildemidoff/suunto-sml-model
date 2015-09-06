package com.github.mihaildemidoff.app;

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
@XmlRootElement(name = "App")
@XmlAccessorType(XmlAccessType.FIELD)
public class App {

    @XmlElement(name = "Name", required = true)
    private String name;

    @XmlElement(name = "AppId", required = true)
    private String appId;

    @XmlElement(name = "Format", required = true)
    private String format;

    @XmlElement(name = "Prefix", required = true)
    private String prefix;

    @XmlElement(name = "Logged", required = true)
    @XmlJavaTypeAdapter(SmlBooleanAdapter.class)
    private Boolean logged;

    @XmlElement(name = "Displayed", required = true)
    @XmlJavaTypeAdapter(SmlBooleanAdapter.class)
    private Boolean displayed;

    @XmlElement(name = "Running", required = true)
    @XmlJavaTypeAdapter(SmlBooleanAdapter.class)
    private Boolean running;

    public App() {
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(final String appId) {
        this.appId = appId;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(final String format) {
        this.format = format;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public Boolean getLogged() {
        return logged;
    }

    public void setLogged(final Boolean logged) {
        this.logged = logged;
    }

    public Boolean getDisplayed() {
        return displayed;
    }

    public void setDisplayed(final Boolean displayed) {
        this.displayed = displayed;
    }

    public Boolean getRunning() {
        return running;
    }

    public void setRunning(final Boolean running) {
        this.running = running;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("name", name)
            .append("appId", appId)
            .append("format", format)
            .append("prefix", prefix)
            .append("logged", logged)
            .append("displayed", displayed)
            .append("running", running)
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

        final App app = (App) o;

        return new EqualsBuilder()
            .append(name, app.name)
            .append(appId, app.appId)
            .append(format, app.format)
            .append(prefix, app.prefix)
            .append(logged, app.logged)
            .append(displayed, app.displayed)
            .append(running, app.running)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(name)
            .append(appId)
            .append(format)
            .append(prefix)
            .append(logged)
            .append(displayed)
            .append(running)
            .toHashCode();
    }
}
