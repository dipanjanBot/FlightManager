package com.cognizant.flymanager.model;

import java.util.List;

/**
 * POJO class to represent Flight Details
 * Created by 509599 on 29-10-2017.
 */

public class FlightDetails {

    private String flightNumber;
    private String fightDate;
    private String arrivalTime;
    private String departureTime;
    private String source;
    private String destination;
    private String carrierCode;
    private String gateNo;
    private List<String> fareClass;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFightDate() {
        return fightDate;
    }

    public void setFightDate(String fightDate) {
        this.fightDate = fightDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public List<String> getFareClass() {
        return fareClass;
    }

    public void setFareClass(List<String> fareClass) {
        this.fareClass = fareClass;
    }

    public String getGateNo() {
        return gateNo;
    }

    public void setGateNo(String gateNo) {
        this.gateNo = gateNo;
    }
}
