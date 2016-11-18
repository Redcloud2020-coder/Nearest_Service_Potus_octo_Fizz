package com.psarmmiey.weatherviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

    // creates the custom views for the ListView's items
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // get weather object for this specified ListView position
        Weather day = getItem(position);

        ViewHolder viewHolder; // object that reference's list item's views

        // check for reusable ViewHolder from a ListView item that scrolled
        // offscreen; otherwise, create a new ViewHolder
        if (convertView == null) { // no reusable ViewHolder, so create one
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView =
                    inflater.inflate(R.layout.list_item, parent, false);
            viewHolder.conditionImageView =
                    (ImageView) convertView.findViewById(R.id.conditionImageView);
            viewHolder.dayTextView =
                    (TextView) convertView.findViewById(R.id.dayTextView);
            viewHolder.lowTextView =
                    (TextView) convertView.findViewById(R.id.lowTextView);
            viewHolder.hiTextView =
                    (TextView) convertView.findViewById(R.id.hiTextView);
            viewHolder.humidityTextView =
                    (TextView) convertView.findViewById(R.id.humidityTextView);
            convertView.setTag(viewHolder);

        }
        else { // reuse existing ViewHolder stored as the list item's tag
            viewHolder = (ViewHolder) convertView.getTag();
        }

        // if weather condition icon already downloaded, use it;
        // otherwie, download icon in a separate thread
        // download and display weather condition image
        if (bitmaps.containsKey(day.iconURL)) {
            viewHolder.conditionImageView.setImageBitmap(
                    bitmaps.get(day.iconURL)
            );
        }
        else new LoadImageTask(viewHolder.conditionImageView).execute(
                day.iconURL);

        // get other data from Weather object and place into views
        Context context = getContext(); // for loading String resources
        viewHolder.dayTextView.setText(context.getString(
                R.string.day_description, day.dayOfWeek, day.description));
        viewHolder.lowTextView.setText(
                context.getString(R.string.low_temp, day.minTemp));
        viewHolder.hiTextView.setText(
                context.getString(R.string.high_temp, day.maxTemp));
        viewHolder.humidityTextView.setText(
                context.getString(R.string.humidity, day.humidity));

        return convertView; // return completed list item to display

    }
 }