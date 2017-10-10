package com.example.louisfavret.journeydiaries.viewModel;

import android.databinding.BaseObservable;

import com.example.louisfavret.journeydiaries.model.Journey;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by Christian on 10/10/17.
 */

public class JourneyViewModel extends BaseObservable {

    private Journey journey;

    public JourneyViewModel(Journey journey) {
        this.journey = journey;
    }

    public String getName() {
        return journey.getName();
    }

    public String getFrom() {
        Calendar cal = journey.getFrom();
        DateFormat sdf = SimpleDateFormat.getDateInstance(SimpleDateFormat.MEDIUM,
                Locale.getDefault());
        return sdf.format(cal.getTime());
    }

    public String getTo() {
        Calendar cal = journey.getTo();
        DateFormat sdf = SimpleDateFormat.getDateInstance(SimpleDateFormat.MEDIUM,
                Locale.getDefault());
        return sdf.format(cal.getTime());
    }

    public void onJourneyClick() {
        System.out.println("OnClick "+getName());
    }

    public void save (String name, String from, String to) {
        try {
            this.journey.setName(name);
            Calendar calFrom = Calendar.getInstance();
            Calendar calTo = Calendar.getInstance();

            SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
            calFrom.setTime(sdf.parse(from));
            calTo.setTime(sdf.parse(to));
            this.journey.setFrom(calFrom);
            this.journey.setTo(calTo);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
