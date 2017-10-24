package com.example.admin.databindingapplication;

import android.util.Log;
import android.view.View;

public class ViewModel {

    private static final String TAG = "ViewModel";

    public void printPerson(View view, Person person ) {
        Log.d(TAG, "printPerson: " + person.toString());
    }

    public void printPersonObs( View view, Person person ) {
        Log.d(TAG, "printPersonObs: " + person.firstNameObs.get() + " " +
        person.lastNameObs.get());
    }
}
