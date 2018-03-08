package com.cognizant.flymanager.subactivity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.cognizant.flymanager.R;
import com.cognizant.flymanager.subfragment.PassengerFragment;
import com.cognizant.flymanager.subfragment.PaymentAndConfirmBookingFragment;
import com.cognizant.flymanager.subfragment.SelectFlightFragment;

import java.util.ArrayList;
import java.util.List;



public class CustomViewIconTextTabsActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Bundle flightbundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        flightbundle = getIntent().getExtras();

        setContentView(R.layout.activity_custom_view_icon_text_tabs);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //  getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
    }

    /**
     * Adding custom view to tab
     */
    private void setupTabIcons() {

        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabOne.setText("Select Flight");
        tabOne.setId(R.id.flightdetailsTab);
        tabLayout.getTabAt(0).setCustomView(tabOne);

        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabTwo.setText("Passenger Details");
        tabTwo.setId(R.id.passengerdetailsTab);
        tabLayout.getTabAt(1).setCustomView(tabTwo);

        TextView tabFour = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabFour.setText("Payment Details");
        tabFour.setId(R.id.paymentTab);
        tabLayout.getTabAt(2).setCustomView(tabFour);
    }

    /**
     * Adding fragments to ViewPager
     * @param viewPager
     */
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        SelectFlightFragment selectFlightFragment = new SelectFlightFragment();
        selectFlightFragment.setArguments(flightbundle);
        adapter.addFrag(selectFlightFragment, "Select Flight");
        PassengerFragment passengerFragment = new PassengerFragment();
        passengerFragment.setArguments(flightbundle);
        adapter.addFrag(passengerFragment, "Passenger Details");
        PaymentAndConfirmBookingFragment paymentAndConfirmBookingFragment = new PaymentAndConfirmBookingFragment();
        paymentAndConfirmBookingFragment.setArguments(flightbundle);
        adapter.addFrag(paymentAndConfirmBookingFragment, "Payment Details");
        viewPager.setAdapter(adapter);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && viewPager.getCurrentItem() == 1) {
            viewPager.setCurrentItem(0, true);
            return true;
        } else {
            return super.onKeyDown(keyCode, event);
        }
    }

    /**
     * For moving to the next fragment
     *
     * @param view
     */
    public void next_fragment(View view) {
        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
    }

    /**
     * Move to any fragment
     *
     * @param item
     * @param smoothScroll
     */
    public void setCurrentItem(int item, boolean smoothScroll) {
        viewPager.setCurrentItem(item, smoothScroll);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        /**
         * Returns the fragment after clicking the tab item
         *
         * @param position
         * @return
         */
        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

}
