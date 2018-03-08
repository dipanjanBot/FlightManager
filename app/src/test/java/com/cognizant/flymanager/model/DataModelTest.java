package com.cognizant.flymanager.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import com.cognizant.flymanager.R;

/**
 * Created by 509599 on 11/20/2017.
 */
@RunWith(JUnit4.class)
public class DataModelTest {

    private DataModel dataModel;

    @Test
    public void getCarriers() throws Exception {
        dataModel = new DataModel(R.id.imageViewIcon, "Book Flight");
        assertNotNull(dataModel);
    }
}