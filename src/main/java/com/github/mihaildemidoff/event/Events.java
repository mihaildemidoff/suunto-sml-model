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
@XmlRootElement(name = "Events")
@XmlAccessorType(XmlAccessType.FIELD)
public class Events {

    @XmlElement(name = "Activity", required = false)
    private ActivityEvent activity;

    @XmlElement(name = "Pause", required = false)
    private PauseEvent pause;

    @XmlElement(name = "Lap", required = false)
    private LapEvent lap;

    @XmlElement(name = "Distance", required = false)
    private DistanceEvent distance;

    @XmlElement(name = "Swimming", required = false)
    private SwimmingEvent swimming;

    @XmlElement(name = "Altitude", required = false)
    private AltitudeEvent altitude;

    @XmlElement(name = "Cadence", required = false)
    private CadenceEvent cadence;

    @XmlElement(name = "AppStatus", required = false)
    private AppStatusEvent appStatus;

    public Events() {
    }

    public ActivityEvent getActivity() {
        return activity;
    }

    public void setActivity(final ActivityEvent activity) {
        this.activity = activity;
    }

    public PauseEvent getPause() {
        return pause;
    }

    public void setPause(final PauseEvent pause) {
        this.pause = pause;
    }

    public LapEvent getLap() {
        return lap;
    }

    public void setLap(final LapEvent lap) {
        this.lap = lap;
    }

    public DistanceEvent getDistance() {
        return distance;
    }

    public void setDistance(final DistanceEvent distance) {
        this.distance = distance;
    }

    public SwimmingEvent getSwimming() {
        return swimming;
    }

    public void setSwimming(final SwimmingEvent swimming) {
        this.swimming = swimming;
    }

    public AltitudeEvent getAltitude() {
        return altitude;
    }

    public void setAltitude(final AltitudeEvent altitude) {
        this.altitude = altitude;
    }

    public CadenceEvent getCadence() {
        return cadence;
    }

    public void setCadence(final CadenceEvent cadence) {
        this.cadence = cadence;
    }

    public AppStatusEvent getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(final AppStatusEvent appStatus) {
        this.appStatus = appStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("activity", activity)
            .append("pause", pause)
            .append("lap", lap)
            .append("distance", distance)
            .append("swimming", swimming)
            .append("altitude", altitude)
            .append("cadence", cadence)
            .append("appStatus", appStatus)
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

        final Events events = (Events) o;

        return new EqualsBuilder()
            .append(activity, events.activity)
            .append(pause, events.pause)
            .append(lap, events.lap)
            .append(distance, events.distance)
            .append(swimming, events.swimming)
            .append(altitude, events.altitude)
            .append(cadence, events.cadence)
            .append(appStatus, events.appStatus)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(activity)
            .append(pause)
            .append(lap)
            .append(distance)
            .append(swimming)
            .append(altitude)
            .append(cadence)
            .append(appStatus)
            .toHashCode();
    }
}
