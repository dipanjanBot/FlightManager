package com.cognizant.flymanager.model;

/**
 * Model class for the airport Details
 * Created by Dipanjan on 06-11-2017.
 */

public class Airport {

    private String code;
    private String lat;
    private String lon;
    private String name;
    private String city;
    private String state;
    private String country;
    private int woeid;
    private String tz;
    private String phone;
    private String type;
    private String email;
    private String url;
    private int runway_length;
    private int elev;
    private String icao;
    private int direct_flights;
    private int carriers;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getWoeid() {
        return woeid;
    }

    public void setWoeid(int woeid) {
        this.woeid = woeid;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getRunway_length() {
        return runway_length;
    }

    public void setRunway_length(int runway_length) {
        this.runway_length = runway_length;
    }

    public int getElev() {
        return elev;
    }

    public void setElev(int elev) {
        this.elev = elev;
    }

    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public int getDirect_flights() {
        return direct_flights;
    }

    public void setDirect_flights(int direct_flights) {
        this.direct_flights = direct_flights;
    }

    public int getCarriers() {
        return carriers;
    }

    public void setCarriers(int carriers) {
        this.carriers = carriers;
    }
}
