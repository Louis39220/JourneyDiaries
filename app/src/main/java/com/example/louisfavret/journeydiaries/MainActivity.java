package com.example.louisfavret.journeydiaries;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by louis.favret on 09/10/17.
 */

public class MainActivity extends AppCompatActivity {

    private MainActivityBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.main_activity);
    }
}
