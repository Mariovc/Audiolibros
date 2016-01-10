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
    private AdaptadorLibrosFiltro adaptador;

    @Override
    public void onCreate() {
        super.onCreate();
        vectorLibros = Libro.ejemploLibros();
        adaptador = new AdaptadorLibrosFiltro(this, vectorLibros);
    }

    public AdaptadorLibrosFiltro getAdaptador() {
        return adaptador;
    }

    public Vector<Libro> getVectorLibros() {
        return vectorLibros;
    }
}
