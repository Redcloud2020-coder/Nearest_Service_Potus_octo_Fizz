package com.psarmmiey.weatherviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by psarmmiey on 11/18/16.
 */

class WeatherArrayAdapter extends ArrayAdapter<Weather> {
    // class fpr reusing views as list items scroll off and onto the screen
    private static class ViewHolder {
        ImageView conditionImageView;
        TextView dayTextView;
        TextView lowTextView;
        TextView hiTextView;
        TextView humidityTextView;
    }


    // stores already downloaded Bitmaps for reuse
    private Map<String, Bitmap> bitmaps = new HashMap<>();

    // constructor to initialize inherited member
    public WeatherArrayAdapter(Context context, List<Weather> forecast) {
        super (context, -1, forecast);
    }
 }
