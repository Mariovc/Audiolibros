package com.example.audiolibros;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.audiolibros.fragments.PreferenciasFragment;

/**
 * Author: Mario Velasco Casquero
 * Date: 10/01/2016
 * Email: m3ario@gmail.com
 */
public class PreferenciasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction().replace(android.R.id.
                content, new PreferenciasFragment()).commit();
    }
}
