package com.cognizant.flymanager.fragment;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.cognizant.flymanager.R;
import com.cognizant.flymanager.activity.FlightDetailsActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/**
 * This fragment will be used to fill up itinerary
 * Created by Dipanjan on 28-10-2017.
 */

public class BookingFragment extends Fragment implements View.OnClickListener {

    private static EditText mTravelDateTextView1;
    int year,month,date;
    private Button searchButton;
    private AutoCompleteTextView sourceTextView;
    private AutoCompleteTextView destinationTextView;
    private EditText noOfPassenger;
    private DatePicker datePicker;
    private Calendar calendar;

    public static void populateSetDate(int year, int month, int day) {

        mTravelDateTextView1.setText(month + "/" + day + "/" + year);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<String> airportList = null;

        try {
            JSONArray airportListArray = new JSONArray(loadJSONFromAsset());
            airportList = new ArrayList<String>();
            HashMap<String, String> m_li;
            for (int i = 0; i < airportListArray.length(); i++) {
                JSONObject jo_inside = airportListArray.getJSONObject(i);

                String airportCode = jo_inside.getString("code");
                String airportCity = jo_inside.getString("city");
                String airportCountry = jo_inside.getString("country");
                m_li = new HashMap<String, String>();
                m_li.put("code", airportCode);
                m_li.put("city", airportCity + ", " + airportCountry);
                airportList.add(airportCode);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (getActivity(), android.R.layout.select_dialog_item, airportList);

        View bookingView = inflater.inflate(R.layout.booking, container, false);
        searchButton = (Button) bookingView.findViewById(R.id.search);
        searchButton.setOnClickListener(this);

        sourceTextView = (AutoCompleteTextView)
                bookingView.findViewById(R.id.sourceTextView);
        sourceTextView.setThreshold(1);//will start working from first character
        sourceTextView.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView


        destinationTextView = (AutoCompleteTextView)
                bookingView.findViewById(R.id.destinationTextView1);
        destinationTextView.setThreshold(1);//will start working from first character
        destinationTextView.setAdapter(adapter);

        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);


        mTravelDateTextView1 = (EditText)bookingView.findViewById(R.id.TravelDateTextView1);
        mTravelDateTextView1.setOnClickListener(this);
     //   TextViewDatePicker editTextDatePicker = new TextViewDatePicker(getActivity().getApplicationContext(), mTravelDateTextView1);

        noOfPassenger = (EditText) bookingView.findViewById(R.id.NoOfPaxTextView1);

        return bookingView;
    }

    @Override
    public void onClick(View v) {
        if(v.equals(searchButton)){
            Bundle flightBundle = new Bundle();
            flightBundle.putString("source", sourceTextView.getText().toString());
            flightBundle.putString("destination", destinationTextView.getText().toString());
            flightBundle.putString("date1", mTravelDateTextView1.getText().toString());
            flightBundle.putInt("noOfPassenger", Integer.parseInt(noOfPassenger.getText().toString()));
            Intent i = new Intent(this.getActivity(), FlightDetailsActivity.class);
            i.putExtras(flightBundle);
            getContext().startActivity(i);
            this.getActivity().finish();
        }
        else if(v.equals(mTravelDateTextView1)){

           /* DatePickerDialog datePickerDialog=new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
                @Override
                public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                    datePicker.setMinDate(new Date().getTime());
                    String date = i2 + "/" + (++i1) + "/" + i;
                    mTravelDateTextView1.setText(date);
                }
            },year,month,date);

            datePickerDialog.show();*/
            DialogFragment newFragment = new SelectDateFragment();
            newFragment.show(this.getFragmentManager(), "DatePicker");
        }
    }

    /**
     * This method will read json data from the assets folder
     * @return
     */
    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getActivity().getAssets().open("airports.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    public static class SelectDateFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            final Calendar calendar = Calendar.getInstance();
            int yy = calendar.get(Calendar.YEAR);
            int mm = calendar.get(Calendar.MONTH);
            int dd = calendar.get(Calendar.DAY_OF_MONTH);
            return new DatePickerDialog(getActivity(), this, yy, mm, dd);
        }

        public void onDateSet(DatePicker view, int yy, int mm, int dd) {
            populateSetDate(yy, mm + 1, dd);
        }
    }



}
