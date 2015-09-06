package com.github.mihaildemidoff.sample;

import com.github.mihaildemidoff.app.AppData;
import com.github.mihaildemidoff.event.Events;
import com.github.mihaildemidoff.satellite.Satellite;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

/**
 * @author Mikhail Demidov
 */
@XmlRootElement(name = "Sample")
@XmlAccessorType(XmlAccessType.FIELD)
public class Sample {

    @XmlElementWrapper(name = "AppsData", required = false)
    @XmlElement(name = "AppData", required = false, type = AppData.class)
    private List<AppData> appsData;

    @XmlElement(name = "Events", required = false)
    private Events events;

    @XmlElement(name = "VerticalSpeed", required = false)
    private Double verticalSpeed;

    @XmlElement(name = "Cadence", required = false)
    private Double cadence;

    @XmlElement(name = "HR", required = false)
    private Double heartRate;

    @XmlElement(name = "EnergyConsumption", required = false)
    private Double energyConsumption;

    @XmlElement(name = "Temperature", required = false)
    private Double temperature;

    @XmlElement(name = "SeaLevelPressure", required = false)
    private Integer seaLevelPressure;

    @XmlElement(name = "Time", required = false)
    private Double time;

    @XmlElement(name = "SampleType", required = false)
    private String sampleType;

    @XmlElement(name = "Altitude", required = false)
    private Integer altitude;

    @XmlElement(name = "Distance", required = false)
    private Integer distance;

    @XmlElement(name = "Speed", required = false)
    private Double speed;

    @XmlElement(name = "WristCadence", required = false)
    private Double wristCadence;

    @XmlElement(name = "WristAccSpeed", required = false)
    private Double wristAccSpeed;

    @XmlElement(name = "BikePodSpeed", required = false)
    private Double bikePodSpeed;

    @XmlElement(name = "UTC", required = false)
    private Date utcTime;

    // -------------------- NAVIGATION --------------------------
    // fields used for gps-tiny

    @XmlElement(name = "Latitude", required = false)
    private Double latitude;

    @XmlElement(name = "Longitude", required = false)
    private Double longitude;

    @XmlElement(name = "EHPE", required = false)
    private Double estimatedHorizontalPositionError;

    // fields for gps-small

    @XmlElement(name = "NumberOfSatellites", required = false)
    private Integer numberOfSatellites;

    // fields for gps-base

    @XmlElement(name = "GPSAltitude", required = false)
    private Double gpsAltitude;

    @XmlElement(name = "GPSHeading", required = false)
    private Double gpsHeading;

    @XmlElement(name = "GPSSpeed", required = false)
    private Double gpsSpeed;

    @XmlElement(name = "GpsHDOP", required = false)
    private Double gpsHorizontalDilutionOfPrecision;

    @XmlElement(name = "NavType", required = false)
    private String navType;

    @XmlElement(name = "NavValid", required = false)
    private String navValid;

    @XmlElement(name = "NavTypeExplanation", required = false)
    private String navTypeExplanation;

    @XmlElementWrapper(name = "Satellites", required = false)
    @XmlElement(name = "Satellite", required = false, type = Satellite.class)
    private List<Satellite> satellites;

    public Sample() {
    }

    public Double getVerticalSpeed() {
        return verticalSpeed;
    }

    public void setVerticalSpeed(final Double verticalSpeed) {
        this.verticalSpeed = verticalSpeed;
    }

    public Double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(final Double heartRate) {
        this.heartRate = heartRate;
    }

    public Double getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(final Double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(final Double temperature) {
        this.temperature = temperature;
    }

    public Integer getSeaLevelPressure() {
        return seaLevelPressure;
    }

    public void setSeaLevelPressure(final Integer seaLevelPressure) {
        this.seaLevelPressure = seaLevelPressure;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(final Double time) {
        this.time = time;
    }

    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(final String sampleType) {
        this.sampleType = sampleType;
    }

    public Integer getAltitude() {
        return altitude;
    }

    public void setAltitude(final Integer altitude) {
        this.altitude = altitude;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(final Double speed) {
        this.speed = speed;
    }

    public Date getUtcTime() {
        return utcTime;
    }

    public void setUtcTime(final Date utcTime) {
        this.utcTime = utcTime;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(final Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(final Double longitude) {
        this.longitude = longitude;
    }

    public Double getEstimatedHorizontalPositionError() {
        return estimatedHorizontalPositionError;
    }

    public void setEstimatedHorizontalPositionError(final Double estimatedHorizontalPositionError) {
        this.estimatedHorizontalPositionError = estimatedHorizontalPositionError;
    }

    public Integer getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public void setNumberOfSatellites(final Integer numberOfSatellites) {
        this.numberOfSatellites = numberOfSatellites;
    }

    public Double getGpsAltitude() {
        return gpsAltitude;
    }

    public void setGpsAltitude(final Double gpsAltitude) {
        this.gpsAltitude = gpsAltitude;
    }

    public Double getGpsHeading() {
        return gpsHeading;
    }

    public void setGpsHeading(final Double gpsHeading) {
        this.gpsHeading = gpsHeading;
    }

    public Double getGpsSpeed() {
        return gpsSpeed;
    }

    public void setGpsSpeed(final Double gpsSpeed) {
        this.gpsSpeed = gpsSpeed;
    }

    public Double getGpsHorizontalDilutionOfPrecision() {
        return gpsHorizontalDilutionOfPrecision;
    }

    public void setGpsHorizontalDilutionOfPrecision(final Double gpsHorizontalDilutionOfPrecision) {
        this.gpsHorizontalDilutionOfPrecision = gpsHorizontalDilutionOfPrecision;
    }

    public String getNavType() {
        return navType;
    }

    public void setNavType(final String navType) {
        this.navType = navType;
    }

    public String getNavValid() {
        return navValid;
    }

    public void setNavValid(final String navValid) {
        this.navValid = navValid;
    }

    public String getNavTypeExplanation() {
        return navTypeExplanation;
    }

    public void setNavTypeExplanation(final String navTypeExplanation) {
        this.navTypeExplanation = navTypeExplanation;
    }

    public List<Satellite> getSatellites() {
        return satellites;
    }

    public void setSatellites(final List<Satellite> satellites) {
        this.satellites = satellites;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(final Integer distance) {
        this.distance = distance;
    }

    public Double getCadence() {
        return cadence;
    }

    public void setCadence(final Double cadence) {
        this.cadence = cadence;
    }

    public List<AppData> getAppsData() {
        return appsData;
    }

    public void setAppsData(final List<AppData> appsData) {
        this.appsData = appsData;
    }

    public Double getWristCadence() {
        return wristCadence;
    }

    public void setWristCadence(final Double wristCadence) {
        this.wristCadence = wristCadence;
    }

    public Double getWristAccSpeed() {
        return wristAccSpeed;
    }

    public void setWristAccSpeed(final Double wristAccSpeed) {
        this.wristAccSpeed = wristAccSpeed;
    }

    public Double getBikePodSpeed() {
        return bikePodSpeed;
    }

    public void setBikePodSpeed(final Double bikePodSpeed) {
        this.bikePodSpeed = bikePodSpeed;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(final Events events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("appsData", appsData)
            .append("events", events)
            .append("verticalSpeed", verticalSpeed)
            .append("cadence", cadence)
            .append("heartRate", heartRate)
            .append("energyConsumption", energyConsumption)
            .append("temperature", temperature)
            .append("seaLevelPressure", seaLevelPressure)
            .append("time", time)
            .append("sampleType", sampleType)
            .append("altitude", altitude)
            .append("distance", distance)
            .append("speed", speed)
            .append("wristCadence", wristCadence)
            .append("wristAccSpeed", wristAccSpeed)
            .append("bikePodSpeed", bikePodSpeed)
            .append("utcTime", utcTime)
            .append("latitude", latitude)
            .append("longitude", longitude)
            .append("estimatedHorizontalPositionError", estimatedHorizontalPositionError)
            .append("numberOfSatellites", numberOfSatellites)
            .append("gpsAltitude", gpsAltitude)
            .append("gpsHeading", gpsHeading)
            .append("gpsSpeed", gpsSpeed)
            .append("gpsHorizontalDilutionOfPrecision", gpsHorizontalDilutionOfPrecision)
            .append("navType", navType)
            .append("navValid", navValid)
            .append("navTypeExplanation", navTypeExplanation)
            .append("satellites", satellites)
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
        final Sample sample = (Sample) o;

        return new EqualsBuilder()
            .append(appsData, sample.appsData)
            .append(events, sample.events)
            .append(verticalSpeed, sample.verticalSpeed)
            .append(cadence, sample.cadence)
            .append(heartRate, sample.heartRate)
            .append(energyConsumption, sample.energyConsumption)
            .append(temperature, sample.temperature)
            .append(seaLevelPressure, sample.seaLevelPressure)
            .append(time, sample.time)
            .append(sampleType, sample.sampleType)
            .append(altitude, sample.altitude)
            .append(distance, sample.distance)
            .append(speed, sample.speed)
            .append(wristCadence, sample.wristCadence)
            .append(wristAccSpeed, sample.wristAccSpeed)
            .append(bikePodSpeed, sample.bikePodSpeed)
            .append(utcTime, sample.utcTime)
            .append(latitude, sample.latitude)
            .append(longitude, sample.longitude)
            .append(estimatedHorizontalPositionError, sample.estimatedHorizontalPositionError)
            .append(numberOfSatellites, sample.numberOfSatellites)
            .append(gpsAltitude, sample.gpsAltitude)
            .append(gpsHeading, sample.gpsHeading)
            .append(gpsSpeed, sample.gpsSpeed)
            .append(gpsHorizontalDilutionOfPrecision, sample.gpsHorizontalDilutionOfPrecision)
            .append(navType, sample.navType)
            .append(navValid, sample.navValid)
            .append(navTypeExplanation, sample.navTypeExplanation)
            .append(satellites, sample.satellites)
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(appsData)
            .append(events)
            .append(verticalSpeed)
            .append(cadence)
            .append(heartRate)
            .append(energyConsumption)
            .append(temperature)
            .append(seaLevelPressure)
            .append(time)
            .append(sampleType)
            .append(altitude)
            .append(distance)
            .append(speed)
            .append(wristCadence)
            .append(wristAccSpeed)
            .append(bikePodSpeed)
            .append(utcTime)
            .append(latitude)
            .append(longitude)
            .append(estimatedHorizontalPositionError)
            .append(numberOfSatellites)
            .append(gpsAltitude)
            .append(gpsHeading)
            .append(gpsSpeed)
            .append(gpsHorizontalDilutionOfPrecision)
            .append(navType)
            .append(navValid)
            .append(navTypeExplanation)
            .append(satellites)
            .toHashCode();
    }
}
