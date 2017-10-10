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
import com.example.louisfavret.journeydiaries.databinding.JourneyCreationFragmentBinding;
import com.example.louisfavret.journeydiaries.databinding.JourneysFragmentBinding;
import com.example.louisfavret.journeydiaries.viewModel.JourneyViewModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/**
 * Created by Christian on 10/10/17.
 */

public class JourneyCreationFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.journey_creation_fragment, container,
                false);
        JourneyCreationFragmentBinding binding = DataBindingUtil.
                inflate(inflater,R.layout.journey_creation_fragment,
                        container,false);
        binding.setJvm(new JourneyViewModel(new Journey()));

        return view;
    }
}
