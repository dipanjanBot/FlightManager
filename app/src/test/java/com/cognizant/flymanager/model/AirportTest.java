package com.cognizant.flymanager.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by 509599 on 11/20/2017.
 */
@RunWith(JUnit4.class)
public class AirportTest {

    private Airport airport;

    @Before
    public void setUp() throws Exception {
        airport = new Airport();
    }


    @Test
    public void getCode() throws Exception {
        airport.setCode("123");
        assertTrue(airport.getCode() == "123");
    }

    @Test
    public void setCode() throws Exception {
        airport.setCode("123");
        assertTrue(airport.getCode() == "123");
    }

    @Test
    public void getLat() throws Exception {
        airport.setLat("67.75767757");
        assertTrue(airport.getLat() == "67.75767757");
    }

    @Test
    public void setLat() throws Exception {
        airport.setLat("67.75767757");
        assertFalse(airport.getLat() == "67.87687");
    }

    @Test
    public void getLon() throws Exception {
        airport.setLon("123.765765");
        assertTrue(airport.getLon() == "123.765765");
    }

    @Test
    public void setLon() throws Exception {
        airport.setLon("123.765765");
        assertTrue(airport.getLon() == "123.765765");
    }

    @Test
    public void getName() throws Exception {
        airport.setName("DAL");
        assertTrue(airport.getName() == "DAL");
    }

    @Test
    public void setName() throws Exception {
        airport.setCode("HOU");
        assertTrue(airport.getCode() == "HOU");
    }

    @Test
    public void getCity() throws Exception {
        airport.setCity("Dallas");
        assertTrue(airport.getCity() == "Dallas");
    }

    @Test
    public void setCity() throws Exception {
        airport.setCity("Texas");
        assertTrue(airport.getCity() == "Texas");
    }

    @Test
    public void getState() throws Exception {
        airport.setState("Texas");
        assertTrue(airport.getState() == "Texas");
    }

    @Test
    public void setState() throws Exception {
        airport.setState("Texas");
        assertTrue(airport.getState() == "Texas");
    }

    @Test
    public void getCountry() throws Exception {
        airport.setCountry("USA");
        assertTrue(airport.getCountry() == "USA");
    }

    @Test
    public void setCountry() throws Exception {
        airport.setCountry("USA");
        assertTrue(airport.getCountry() == "USA");
    }

    @Test
    public void getWoeid() throws Exception {
        airport.setWoeid(123);
        assertTrue(airport.getWoeid() == 123);
    }

    @Test
    public void setWoeid() throws Exception {
        airport.setWoeid(123);
        assertTrue(airport.getWoeid() == 123);
    }

    @Test
    public void getTz() throws Exception {
        airport.setTz("123");
        assertTrue(airport.getTz() == "123");
    }

    @Test
    public void setTz() throws Exception {
        airport.setTz("123");
        assertTrue(airport.getTz() == "123");
    }

    @Test
    public void getPhone() throws Exception {
        airport.setPhone("1234567890");
        assertTrue(airport.getPhone() == "1234567890");
    }

    @Test
    public void setPhone() throws Exception {
        airport.setPhone("1234567890");
        assertTrue(airport.getPhone() == "1234567890");
    }

    @Test
    public void getType() throws Exception {
        airport.setType("Airport");
        assertTrue(airport.getType() == "Airport");
    }

    @Test
    public void setType() throws Exception {
        airport.setType("Airport");
        assertTrue(airport.getType() == "Airport");
    }

    @Test
    public void getEmail() throws Exception {
        airport.setEmail("test@cognizant.com");
        assertTrue(airport.getEmail() == "test@cognizant.com");
    }

    @Test
    public void setEmail() throws Exception {
        airport.setEmail("test@cognizant.com");
        assertTrue(airport.getEmail() == "test@cognizant.com");
    }

    @Test
    public void getUrl() throws Exception {
        airport.setUrl("www.google.com");
        assertTrue(airport.getUrl() == "www.google.com");
    }

    @Test
    public void setUrl() throws Exception {
        airport.setUrl("www.google.com");
        assertTrue(airport.getUrl() == "www.google.com");
    }

    @Test
    public void getRunway_length() throws Exception {
        airport.setRunway_length(523);
        assertTrue(airport.getRunway_length() == 523);
    }

    @Test
    public void setRunway_length() throws Exception {
        airport.setRunway_length(523);
        assertTrue(airport.getRunway_length() == 523);
    }

    @Test
    public void getElev() throws Exception {
        airport.setElev(23);
        assertTrue(airport.getElev() == 23);
    }

    @Test
    public void setElev() throws Exception {
        airport.setElev(23);
        assertTrue(airport.getElev() == 23);
    }

    @Test
    public void getIcao() throws Exception {
        airport.setIcao("123");
        assertTrue(airport.getIcao() == "123");
    }

    @Test
    public void setIcao() throws Exception {
        airport.setIcao("123");
        assertTrue(airport.getIcao() == "123");
    }

    @Test
    public void getDirect_flights() throws Exception {
        airport.setDirect_flights(230);
        assertTrue(airport.getDirect_flights() == 230);
    }

    @Test
    public void setDirect_flights() throws Exception {
        airport.setDirect_flights(230);
        assertTrue(airport.getDirect_flights() == 230);
    }

    @Test
    public void getCarriers() throws Exception {
        airport.setCarriers(125);
        assertTrue(airport.getCarriers() == 125);
    }

    @Test
    public void setCarriers() throws Exception {
        airport.setCarriers(125);
        assertTrue(airport.getCarriers() == 125);
    }

    @After
    public void tearDown() throws Exception {
        airport = null;
    }

}