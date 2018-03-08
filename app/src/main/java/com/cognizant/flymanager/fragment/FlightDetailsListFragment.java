package com.cognizant.flymanager.fragment;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cognizant.flymanager.adapter.FlightDetailsArrayAdapter;
import com.cognizant.flymanager.model.FlightDetails;
import com.cognizant.flymanager.task.FlightDetailsTask;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by Dipanjan on 30-10-2017.
 */

public class FlightDetailsListFragment extends ListFragment {

    private Bundle flightBundle;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = super.onCreateView(inflater, container, savedInstanceState);
        flightBundle = getActivity().getIntent().getExtras();
        String source = flightBundle.getString("source");
        String destination = flightBundle.getString("destination");
        String dateOFtravel = flightBundle.getString("date1");
        int noOfPax = flightBundle.getInt("noOfPassenger");
        FlightDetailsTask fetChFlightDetails = new FlightDetailsTask(this.getActivity(), source, destination, dateOFtravel, noOfPax);
        fetChFlightDetails.execute();
        List<FlightDetails> flightDetailList = null;
        try {
            flightDetailList = fetChFlightDetails.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        setListAdapter(new FlightDetailsArrayAdapter(getActivity(), flightDetailList));

        return v;
    }

}
