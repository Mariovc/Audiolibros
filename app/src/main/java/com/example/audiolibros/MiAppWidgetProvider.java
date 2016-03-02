package com.example.audiolibros;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViews;

/**
 * Author: Mario Velasco Casquero
 * Date: 02/03/2016
 */
public class MiAppWidgetProvider extends AppWidgetProvider {
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] widgetIds) {
        for (int widgetId: widgetIds) {
//            actualizaWidget(context, widgetId);
            irUltimoVisitado(context, widgetId);
        }
    }

//    public static void actualizaWidget(Context context, int widgetId) {
//        int cont = incrementaContador(context, widgetId);
//        RemoteViews remoteViews = new RemoteViews(context.getPackageName(),
//                R.layout.widget);
//        remoteViews.setTextViewText(R.id.textView1, "Contador: " + cont);
//        AppWidgetManager.getInstance(context).updateAppWidget(widgetId,
//
//                remoteViews);
//    }
//
//    private static int incrementaContador(Context context, int widgetId) {
//        SharedPreferences prefs = context.getSharedPreferences("contadores",
//
//                Context.MODE_PRIVATE);
//        int cont = prefs.getInt("cont_" + widgetId, 0);
//        cont++;
//        SharedPreferences.Editor editor = prefs.edit();
//        editor.putInt("cont_" + widgetId, cont);
//        editor.commit();
//        return cont;
//    }

    public void irUltimoVisitado(Context context, int widgetId) {
        SharedPreferences pref = context.getSharedPreferences(
                "com.example.audiolibros_internal", Context.MODE_PRIVATE);
        int id = pref.getInt("ultimo", -1);
        if (id >= 0) {
            Libro libro = ((Aplicacion) context.getApplicationContext())
                    .getVectorLibros().elementAt(id);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(),
                    R.layout.widget);
            remoteViews.setTextViewText(R.id.textView1, libro.titulo);
            remoteViews.setTextViewText(R.id.textView2, libro.autor);
            Intent intent = new Intent(context, MainActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
            remoteViews.setOnClickPendingIntent(R.id.widget_layout, pendingIntent);
            AppWidgetManager.getInstance(context).updateAppWidget(widgetId, remoteViews);
        }
    }
}
