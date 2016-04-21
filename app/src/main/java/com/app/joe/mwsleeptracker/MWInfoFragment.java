package com.app.joe.mwsleeptracker;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.mbientlab.metawear.MetaWearBoard;


public class MWInfoFragment extends Fragment {

    public  MWInfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mwinfo, container, false);

    }

    public void updateDeviceInfo(final MetaWearBoard mwBoard){

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (mwBoard != null) {
                    TextView tvMACAddress = (TextView) getView().findViewById(R.id.tvInfoMACAddress);
                    tvMACAddress.setText(mwBoard.getMacAddress());
                }
            }
        });

    }
}
