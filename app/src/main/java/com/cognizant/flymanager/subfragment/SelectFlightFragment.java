package com.cognizant.flymanager.subfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cognizant.flymanager.R;


public class SelectFlightFragment extends Fragment {
    private Bundle flightBundle;
    private Context context;

    public SelectFlightFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        flightBundle = getArguments();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for th+is fragment
    /*    Fragment flightDetailsListFragment = new FlightDetailsListFragment();
        flightDetailsListFragment.setArguments(flightBundle);
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.itemListFragment, flightDetailsListFragment).commit();*/

        //    FlightDetailsListFragment flightDetailsListFragment =(FlightDetailsListFragment)getFragmentManager().findFragmentById(R.id.itemListFragment);


        return inflater.inflate(R.layout.select_flight_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //FlightDetailsListFragment flightDetailsListFragment = view.findViewById(R.id.itemListFragment);
    }
}
