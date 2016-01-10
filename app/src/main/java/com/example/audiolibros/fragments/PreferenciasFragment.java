package com.example.audiolibros.fragments;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import com.example.audiolibros.R;

/**
 * Author: Mario Velasco Casquero
 * Date: 10/01/2016
 * Email: m3ario@gmail.com
 */
public class PreferenciasFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.preferences);
    }
}