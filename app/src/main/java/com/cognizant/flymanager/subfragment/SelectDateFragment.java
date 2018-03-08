package com.cognizant.flymanager.subfragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;

import java.util.Calendar;

/**
 * Created by Dipanjan on 16-11-2017.
 */

public class SelectDateFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar calendar = Calendar.getInstance();
        int yy = calendar.get(Calendar.YEAR);
        int mm = calendar.get(Calendar.MONTH);
        int dd = calendar.get(Calendar.DAY_OF_MONTH);
        return new DatePickerDialog(getActivity(), this, yy, mm, dd);
    }

    public void onDateSet(DatePicker view, int yy, int mm, int dd) {
        //  populateSetDate(yy, mm+1, dd);
    }

  /*  public void populateSetDate(int year, int month, int day) {
        mTravelDateTextView1 = (EditText)getActivity().findViewById(R.id.TravelDateTextView1);
        mTravelDateTextView1.setText(month+"/"+day+"/"+year);
    }*/
}
