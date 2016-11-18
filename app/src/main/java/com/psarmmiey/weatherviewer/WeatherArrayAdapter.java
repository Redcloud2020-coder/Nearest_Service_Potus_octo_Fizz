package com.psarmmiey.weatherviewer;

import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

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
}
