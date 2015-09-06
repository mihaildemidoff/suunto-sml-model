package com.github.mihaildemidoff.header;

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
@XmlRootElement(name = "Header")
@XmlAccessorType(XmlAccessType.FIELD)
public class Header {

    @XmlElement(name = "Duration", required = false)
    private Double duration;

    @XmlElement(name = "Ascent", required = false)
    private Double ascent;

    @XmlElement(name = "Descent", required = false)
    private Double descent;

    @XmlElement(name = "AscentTime", required = false)
    private Double ascentTime;

    @XmlElement(name = "DescentTime", required = false)
    private Double descentTime;

    @XmlElement(name = "RecoveryTime", required = false)
    private Double recoveryTime;

    @XmlElement(name = "Speed", required = false)
    private Speed speed;

    @XmlElement(name = "Cadence", required = false)
    private Cadence cadence;

    @XmlElement(name = "Altitude", required = false)
    private Altitude altitude;

    @XmlElement(name = "HR", required = false)
    private HeartRate heartRate;

    @XmlElement(name = "PeakTrainingEffect", required = false)
    private Double peakTrainingEffect;

    @XmlElement(name = "ActivityType", required = false)
    private Integer activityType;

    @XmlElement(name = "Activity", required = false)
    private String activity;

    @XmlElement(name = "Temperature", required = false)
    private Temperature temperature;

    @XmlElement(name = "Distance", required = false)
    private Integer distance;

    @XmlElement(name = "LogItemCount", required = false)
    private Integer logItemCount;

    @XmlElement(name = "Energy", required = false)
    private Double energy;

    // TODO: change type
    @XmlElement(name = "TimeToFirstFix", required = false)
    private String timeToFirstFix;

    // TODO: change type
    @XmlElement(name = "BatteryChargeAtStart", required = false)
    private String batteryChargeAtStart;

    // TODO: change type
    @XmlElement(name = "BatteryCharge", required = false)
    private String batteryCharge;

    // TODO: change type
    @XmlElement(name = "DistanceBeforeCalibrationChange", required = false)
    private String distanceBeforeCalibrationChange;

    @XmlElement(name = "DateTime", required = false)
    private Date dateTime;

    @XmlElement(name = "PoolLength", required = false)
    private Integer poolLength;

    public Header() {
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(final Double duration) {
        this.duration = duration;
    }

    public Double getAscent() {
        return ascent;
    }

    public void setAscent(final Double ascent) {
        this.ascent = ascent;
    }

    public Double getDescent() {
        return descent;
    }

    public void setDescent(final Double descent) {
        this.descent = descent;
    }

    public Double getAscentTime() {
        return ascentTime;
    }

    public void setAscentTime(final Double ascentTime) {
        this.ascentTime = ascentTime;
    }

    public Double getDescentTime() {
        return descentTime;
    }

    public void setDescentTime(final Double descentTime) {
        this.descentTime = descentTime;
    }

    public Double getRecoveryTime() {
        return recoveryTime;
    }

    public void setRecoveryTime(final Double recoveryTime) {
        this.recoveryTime = recoveryTime;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(final Speed speed) {
        this.speed = speed;
    }

    public HeartRate getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(final HeartRate heartRate) {
        this.heartRate = heartRate;
    }

    public Double getPeakTrainingEffect() {
        return peakTrainingEffect;
    }

    public void setPeakTrainingEffect(final Double peakTrainingEffect) {
        this.peakTrainingEffect = peakTrainingEffect;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(final Integer activityType) {
        this.activityType = activityType;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(final String activity) {
        this.activity = activity;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(final Temperature temperature) {
        this.temperature = temperature;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(final Integer distance) {
        this.distance = distance;
    }

    public Integer getLogItemCount() {
        return logItemCount;
    }

    public void setLogItemCount(final Integer logItemCount) {
        this.logItemCount = logItemCount;
    }

    public Double getEnergy() {
        return energy;
    }

    public void setEnergy(final Double energy) {
        this.energy = energy;
    }

    public String getTimeToFirstFix() {
        return timeToFirstFix;
    }

    public void setTimeToFirstFix(final String timeToFirstFix) {
        this.timeToFirstFix = timeToFirstFix;
    }

    public String getBatteryChargeAtStart() {
        return batteryChargeAtStart;
    }

    public void setBatteryChargeAtStart(final String batteryChargeAtStart) {
        this.batteryChargeAtStart = batteryChargeAtStart;
    }

    public String getBatteryCharge() {
        return batteryCharge;
    }

    public void setBatteryCharge(final String batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public String getDistanceBeforeCalibrationChange() {
        return distanceBeforeCalibrationChange;
    }

    public void setDistanceBeforeCalibrationChange(final String distanceBeforeCalibrationChange) {
        this.distanceBeforeCalibrationChange = distanceBeforeCalibrationChange;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(final Date dateTime) {
        this.dateTime = dateTime;
    }

    public Altitude getAltitude() {
        return altitude;
    }

    public void setAltitude(final Altitude altitude) {
        this.altitude = altitude;
    }

    public Cadence getCadence() {
        return cadence;
    }

    public void setCadence(final Cadence cadence) {
        this.cadence = cadence;
    }

    public Integer getPoolLength() {
        return poolLength;
    }

    public void setPoolLength(final Integer poolLength) {
        this.poolLength = poolLength;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("duration", duration)
            .append("ascent", ascent)
            .append("descent", descent)
            .append("ascentTime", ascentTime)
            .append("descentTime", descentTime)
            .append("recoveryTime", recoveryTime)
            .append("speed", speed)
            .append("cadence", cadence)
            .append("altitude", altitude)
            .append("heartRate", heartRate)
            .append("peakTrainingEffect", peakTrainingEffect)
            .append("activityType", activityType)
            .append("activity", activity)
            .append("temperature", temperature)
            .append("distance", distance)
            .append("logItemCount", logItemCount)
            .append("energy", energy)
            .append("timeToFirstFix", timeToFirstFix)
            .append("batteryChargeAtStart", batteryChargeAtStart)
            .append("batteryCharge", batteryCharge)
            .append("distanceBeforeCalibrationChange", distanceBeforeCalibrationChange)
            .append("dateTime", dateTime)
            .append("poolLength", poolLength)
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

        final Header header = (Header) o;

        return new EqualsBuilder()
            .append(recoveryTime, header.recoveryTime)
            .append(duration, header.duration)
            .append(ascent, header.ascent)
            .append(descent, header.descent)
            .append(ascentTime, header.ascentTime)
            .append(descentTime, header.descentTime)
            .append(speed, header.speed)
            .append(cadence, header.cadence)
            .append(altitude, header.altitude)
            .append(heartRate, header.heartRate)
            .append(peakTrainingEffect, header.peakTrainingEffect)
            .append(activityType, header.activityType)
            .append(activity, header.activity)
            .append(temperature, header.temperature)
            .append(distance, header.distance)
            .append(logItemCount, header.logItemCount)
            .append(energy, header.energy)
            .append(timeToFirstFix, header.timeToFirstFix)
            .append(batteryChargeAtStart, header.batteryChargeAtStart)
            .append(batteryCharge, header.batteryCharge)
            .append(distanceBeforeCalibrationChange, header.distanceBeforeCalibrationChange)
            .append(dateTime, header.dateTime)
            .append(poolLength, header.poolLength)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(duration)
            .append(ascent)
            .append(descent)
            .append(ascentTime)
            .append(descentTime)
            .append(recoveryTime)
            .append(speed)
            .append(cadence)
            .append(altitude)
            .append(heartRate)
            .append(peakTrainingEffect)
            .append(activityType)
            .append(activity)
            .append(temperature)
            .append(distance)
            .append(logItemCount)
            .append(energy)
            .append(timeToFirstFix)
            .append(batteryChargeAtStart)
            .append(batteryCharge)
            .append(distanceBeforeCalibrationChange)
            .append(dateTime)
            .append(poolLength)
            .toHashCode();
    }
}
