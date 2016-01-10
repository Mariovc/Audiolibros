package com.example.audiolibros;

import android.app.Application;

import java.util.Vector;

/**
 * Author: Mario Velasco Casquero
 * Date: 20/12/2015
 * Email: m3ario@gmail.com
 */
public class Aplicacion extends Application {

    private Vector<Libro> vectorLibros;
    private AdaptadorLibros adaptador;

    @Override
    public void onCreate() {
        super.onCreate();
        vectorLibros = Libro.ejemploLibros();
        adaptador = new AdaptadorLibros (this, vectorLibros);
    }

    public AdaptadorLibros getAdaptador() {
        return adaptador;
    }

    public Vector<Libro> getVectorLibros() {
        return vectorLibros;
    }
}
