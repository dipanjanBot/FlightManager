package com.cognizant.flymanager.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cognizant.flymanager.R;

/**
 * Created by Dipanjan on 29-10-2017.
 */

public class HomePageFragment extends Fragment {

    public HomePageFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.home, container, false);

        return rootView;
    }
}
