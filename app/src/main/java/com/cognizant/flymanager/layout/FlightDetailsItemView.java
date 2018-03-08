package com.cognizant.flymanager.layout;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cognizant.flymanager.R;
import com.cognizant.flymanager.model.FlightDetails;

/**
 * Created by Dipanjan on 30-10-2017.
 */

public class FlightDetailsItemView extends RelativeLayout {


    private TextView mFlightSegmentTextView;
    private TextView mFlightNumberTextView;
    private TextView mFlightTimeTextView;
    private TextView mFlightDateTextView;
    private TextView mGateTextView;
    private Button mBusinessClasBtn;

    public FlightDetailsItemView(Context c) {
        this(c, null);
    }

    public FlightDetailsItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FlightDetailsItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LayoutInflater.from(context).inflate(R.layout.list_view_item_row, this, true);
        Activity currentActivity = (Activity) context;
        setupChildren(currentActivity);
    }

    public static FlightDetailsItemView inflate(ViewGroup parent) {
        FlightDetailsItemView itemView = (FlightDetailsItemView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.flightdetails_item_view, parent, false);

        return itemView;
    }

    private void setupChildren(final Activity activity) {
        mFlightSegmentTextView = (TextView) findViewById(R.id.segmentDeails);
        mFlightNumberTextView = (TextView) findViewById(R.id.flightNumber);
        mFlightTimeTextView = (TextView) findViewById(R.id.flyTime);
        mFlightDateTextView = (TextView) findViewById(R.id.flyDate);
        //mGateTextView = (TextView) findViewById(R.id.terminalGate);
        mBusinessClasBtn = (Button) findViewById(R.id.businessCLass);

    }

    public void setItem(FlightDetails flightDetails) {
        mFlightSegmentTextView.setText(flightDetails.getSource() + "-" + flightDetails.getDestination());
        mFlightNumberTextView.setText(flightDetails.getCarrierCode() + " " + flightDetails.getFlightNumber());
        mFlightTimeTextView.setText(flightDetails.getDepartureTime() + "-" + flightDetails.getArrivalTime());
        //mFlightDateTextView.setText(DateFormatConverter.convertDate(new Date()));
        mFlightDateTextView.setText(flightDetails.getFightDate());
        // mGateTextView.setText(flightDetails.getGateNo());
    }
}
