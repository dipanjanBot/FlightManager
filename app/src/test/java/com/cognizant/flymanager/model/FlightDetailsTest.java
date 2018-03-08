package com.cognizant.flymanager.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 509599 on 11/20/2017.
 */
@RunWith(JUnit4.class)
public class FlightDetailsTest {

    FlightDetails flightDetails;

    @Before
    public void setUp() throws Exception {
        flightDetails = new FlightDetails();
    }


    @Test
    public void getFlightNumber() throws Exception {
        flightDetails.setFlightNumber("123");
        assertTrue(flightDetails.getFlightNumber() == "123");
    }

    @Test
    public void setFlightNumber() throws Exception {
        flightDetails.setFlightNumber("123");
        assertTrue(flightDetails.getFlightNumber() == "123");
    }

    @Test
    public void getFightDate() throws Exception {
        flightDetails.setFightDate("29-Feb-2018");
        assertTrue(flightDetails.getFightDate() == "29-Feb-2018");
    }

    @Test
    public void setFightDate() throws Exception {
        flightDetails.setFightDate("29-Feb-2018");
        assertTrue(flightDetails.getFightDate() == "29-Feb-2018");
    }

    @Test
    public void getArrivalTime() throws Exception {
        flightDetails.setArrivalTime("09:20AM");
        assertTrue(flightDetails.getArrivalTime() == "09:20AM");
    }

    @Test
    public void setArrivalTime() throws Exception {
        flightDetails.setArrivalTime("09:20AM");
        assertTrue(flightDetails.getArrivalTime() == "09:20AM");
    }

    @Test
    public void getDepartureTime() throws Exception {
        flightDetails.setDepartureTime("12:45PM");
        assertTrue(flightDetails.getDepartureTime() == "12:45PM");
    }

    @Test
    public void setDepartureTime() throws Exception {
        flightDetails.setDepartureTime("12:45PM");
        assertTrue(flightDetails.getDepartureTime() == "12:45PM");
    }

    @Test
    public void getSource() throws Exception {
        flightDetails.setSource("LAS");
        assertTrue(flightDetails.getSource() == "LAS");
    }

    @Test
    public void setSource() throws Exception {
        flightDetails.setSource("LAS");
        assertTrue(flightDetails.getSource() == "LAS");
    }

    @Test
    public void getDestination() throws Exception {
        flightDetails.setDestination("MEX");
        assertTrue(flightDetails.getDestination() == "MEX");
    }

    @Test
    public void setDestination() throws Exception {
        flightDetails.setDestination("MEX");
        assertTrue(flightDetails.getDestination() == "MEX");
    }

    @Test
    public void getFareClass() throws Exception {
        List<String> fareClassList = new ArrayList<>();
        fareClassList.add("MEX");
        flightDetails.setFareClass(fareClassList);
        assertTrue(flightDetails.getFareClass() == fareClassList);
    }

    @Test
    public void setFareClass() throws Exception {
        List<String> fareClassList = new ArrayList<>();
        fareClassList.add("MEX");
        flightDetails.setFareClass(fareClassList);
        assertTrue(flightDetails.getFareClass() == fareClassList);
    }

    @After
    public void tearDown() throws Exception {
        flightDetails = null;
    }

}