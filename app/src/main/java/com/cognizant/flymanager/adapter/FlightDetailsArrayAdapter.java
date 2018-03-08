package com.cognizant.flymanager.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.cognizant.flymanager.layout.FlightDetailsItemView;
import com.cognizant.flymanager.model.FlightDetails;

import java.util.List;

/**
 * Created by Dipanjan on 29-10-2017.
 */

public class FlightDetailsArrayAdapter extends ArrayAdapter<FlightDetails> {

    public FlightDetailsArrayAdapter(Context c, List<FlightDetails> flightDetailsList) {
        super(c, 0, flightDetailsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        FlightDetailsItemView flightDetailsItemView = (FlightDetailsItemView)convertView;
        if (null == flightDetailsItemView)
            flightDetailsItemView = FlightDetailsItemView.inflate(parent);
        flightDetailsItemView.setItem(getItem(position));
        return flightDetailsItemView;
    }
}


