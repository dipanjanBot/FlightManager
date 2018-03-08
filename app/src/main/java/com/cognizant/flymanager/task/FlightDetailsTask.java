package com.cognizant.flymanager.task;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import com.cognizant.flymanager.model.FlightDetails;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * This async task will load the flight schedule details
 * Created by Dipanjan on 06-11-2017.
 */

public class FlightDetailsTask extends AsyncTask<String, String, List<FlightDetails>> {

    ProgressDialog progressDialog;
    String source, destination, dateOfFlight;
    int noOfPax;
    private String resp;
    private Context context;
    private List<FlightDetails> flightDetailsList;
    private Activity mActivity;

    public FlightDetailsTask(Activity mActivity, String source, String destination, String dateOfFlight, int noOfPax) {
        this.mActivity = mActivity;
        this.source = source;
        this.destination = destination;
        this.dateOfFlight = dateOfFlight;
        this.noOfPax = noOfPax;
    }

    @Override
    protected List<FlightDetails> doInBackground(String... params) {
        publishProgress("Loading.."); // Calls onProgressUpdate()

        try {
            String fightDetailsJsonString = loadJSONFromAsset(source, destination, dateOfFlight);
            JSONObject flightDetailsMainJson = new JSONObject(fightDetailsJsonString);
            JSONObject flightItineraryMain = flightDetailsMainJson.getJSONObject("flightItinerary");
            JSONArray flightDetailsJsonList = flightDetailsMainJson.getJSONArray("schedules");
            flightDetailsList = new ArrayList<FlightDetails>();
            for (int i = 0; i < flightDetailsJsonList.length(); i++) {
                JSONObject jo_inside = flightDetailsJsonList.getJSONObject(i);
                FlightDetails flightDetails = new FlightDetails();
                flightDetails.setFlightNumber(jo_inside.getString("flightNo"));
                flightDetails.setSource(flightItineraryMain.getString("Source"));
                flightDetails.setDestination(flightItineraryMain.getString("Destination"));
                flightDetails.setCarrierCode(jo_inside.getString("carrier"));
                flightDetails.setFightDate(dateOfFlight);
                flightDetails.setArrivalTime(jo_inside.getString("arrivalTime"));
                flightDetails.setDepartureTime(jo_inside.getString("departureTime"));
                flightDetails.setGateNo(jo_inside.getString("gateNo"));
                List<String> fareclasses = new ArrayList<>();
                fareclasses.add(jo_inside.getString("fareClass"));
                flightDetails.setFareClass(fareclasses);
                flightDetailsList.add(flightDetails);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return flightDetailsList;
    }

    @Override
    protected void onPostExecute(List<FlightDetails> result) {
        // execution of result of Long time consuming operation
        progressDialog.dismiss();

        // finalResult.setText(result);
    }


    @Override
    protected void onPreExecute() {
        progressDialog = ProgressDialog.show(mActivity,
                "Loading...",
                "Wait for " + "test " + " seconds");
    }


    @Override
    protected void onProgressUpdate(String... text) {
        //  finalResult.setText(text[0]);

    }
    /**
     * This method will read json data from the assets folder
     * @return
     */
    public String loadJSONFromAsset(String source, String destination, String dateOfDeparture) {
        String json = null;
        try {
            String jsonFileName = source + "_" + destination + ".json";
            InputStream is = mActivity.getAssets().open(jsonFileName);
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
}
