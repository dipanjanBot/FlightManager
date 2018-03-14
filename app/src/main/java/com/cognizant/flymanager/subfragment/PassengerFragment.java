package com.cognizant.flymanager.subfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.cognizant.flymanager.R;
import com.cognizant.flymanager.subactivity.CustomViewIconTextTabsActivity;


public class PassengerFragment extends Fragment implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    private Spinner genderspinner;
    private Button confirm;
    private Bundle flightBundle;
    private int noOfPassenger;
    private String[] gender = {"Male", "Female"};
    private View view;

    public PassengerFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        flightBundle = getActivity().getIntent().getExtras();
        int noOfPassenger = flightBundle.getInt("noOfPassenger");
        loadPassengerForm(noOfPassenger);
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_two, container, false);
        genderspinner = (Spinner) view.findViewById(R.id.p1_gender_select);
        ArrayAdapter<String> adapter_state = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_spinner_item, gender);
        adapter_state
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderspinner.setAdapter(adapter_state);
        genderspinner.setOnItemSelectedListener(this);
        confirm = (Button) view.findViewById(R.id.confirm_fillUp);
        confirm.setOnClickListener(this);
        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        genderspinner.setSelection(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.confirm_fillUp:
                ((CustomViewIconTextTabsActivity) getActivity()).setCurrentItem(2, true);

                break;
        }
    }

    /**
     * Dynamically load no of passenger
     *
     * @param noOfPassenger
     */
    private void loadPassengerForm(int noOfPassenger) {

        if (noOfPassenger > 2) {
            LinearLayout p1Form = (LinearLayout) view.findViewById(R.id.p1);
            p1Form.setVisibility(View.VISIBLE);
        }
        if (noOfPassenger > 3) {
            LinearLayout p2Form = (LinearLayout) view.findViewById(R.id.p2);
            p2Form.setVisibility(View.VISIBLE);
        }
        if (noOfPassenger > 4) {
            LinearLayout p3Form = (LinearLayout) view.findViewById(R.id.p3);
            p3Form.setVisibility(View.VISIBLE);
        }
        if (noOfPassenger > 5) {
            LinearLayout p4Form = (LinearLayout) view.findViewById(R.id.p4);
            p4Form.setVisibility(View.VISIBLE);
        }
        if (noOfPassenger > 6) {
            LinearLayout p5Form = (LinearLayout) view.findViewById(R.id.p5);
            p5Form.setVisibility(View.VISIBLE);
        }
        if (noOfPassenger > 7) {
            LinearLayout p6Form = (LinearLayout) view.findViewById(R.id.p6);
            p6Form.setVisibility(View.VISIBLE);
        }
        if (noOfPassenger > 8) {
            LinearLayout p7Form = (LinearLayout) view.findViewById(R.id.p7);
            p7Form.setVisibility(View.VISIBLE);
        }
        if (noOfPassenger > 9) {
            LinearLayout p8Form = (LinearLayout) view.findViewById(R.id.p8);
            p8Form.setVisibility(View.VISIBLE);
        }
        if (noOfPassenger > 10) {
            LinearLayout p9Form = (LinearLayout) view.findViewById(R.id.p9);
            p9Form.setVisibility(View.VISIBLE);
        }
    }
}
