package com.example.louisfavret.journeydiaries;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.louisfavret.journeydiaries.databinding.MainActivityBinding;
import com.example.louisfavret.journeydiaries.model.JourneyCreationFragment;
import com.example.louisfavret.journeydiaries.model.JourneysFragment;

/**
 * Created by louis.favret on 09/10/17.
 */

public class MainActivity extends AppCompatActivity {

    private MainActivityBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.main_activity);
        this.showStartup();

    }

    public void showStartup() {
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        JourneysFragment fragment = new JourneysFragment();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.commit();
    }

    public void addNewJourney(View v) {
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        JourneyCreationFragment fragment = new JourneyCreationFragment();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.commit();
    }
}
