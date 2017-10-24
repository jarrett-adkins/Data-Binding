package com.example.admin.databindingapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin.databindingapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        // set content through data binding.

        ActivityMainBinding binding = DataBindingUtil.setContentView( this, R.layout.activity_main );

        binding.setPerson( new Person( "John", "Doe" ));
        binding.setViewmodel( new ViewModel());
    }
}

/*
data binding
an api to avoid find view by ids. bind pojo in xml. Enable in gradle.
 */