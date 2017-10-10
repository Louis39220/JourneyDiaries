package com.example.louisfavret.journeydiaries.model;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.louisfavret.journeydiaries.JourneyListAdapter;
import com.example.louisfavret.journeydiaries.R;
import com.example.louisfavret.journeydiaries.databinding.JourneysFragmentBinding;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/**
 * Created by louis.favret on 09/10/17.
 */

public class JourneysFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        List<Journey> journeys = new ArrayList<>();

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
        try {
            cal.setTime(sdf.parse("Mon Mar 14 16:02:37 GMT 2011"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        journeys.add(new Journey("India", cal, cal));
        journeys.add(new Journey("India", cal, cal));
        journeys.add(new Journey("India", cal, cal));
        journeys.add(new Journey("India", cal, cal));
        journeys.add(new Journey("India", cal, cal));

        JourneysFragmentBinding binding = DataBindingUtil.inflate(inflater, R.layout.journeys_fragment,container,false);
        binding.journeysList.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext()));
        binding.journeysList.setAdapter(new JourneyListAdapter(journeys));


        return binding.getRoot();
    }

}
