package com.cognizant.flymanager.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by 509599 on 11/28/2017.
 */
@RunWith(JUnit4.class)
public class DateFormatConverterTest {
    @Test
    public void convertDate() throws Exception {
        assertNotNull(DateFormatConverter.convertDate(new Date()));
    }

}