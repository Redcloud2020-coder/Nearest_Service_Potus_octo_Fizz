// Weather.java
// Maintains one day's weather information

package com.psarmmiey.placesViewer;

import java.text.NumberFormat;

/**
 * Created by psarmmiey on 11/18/16.
 */


class Weather {

    public final double lat;
    public final double lng;
    public final double humidity;
    public final String iconURL;
    public final String placeID;
    public  String nameOfPlace = "";
    public  String description = "";

    // constructor
    public Weather(String name, double lat, double lng,
                   double humidity, String description, String iconName, String placeID) {
        // NumberFormat to format double temperatures rounded to integers
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(0);

        this.nameOfPlace= name;
        this.lat = lat;
        this.lng = lng;
        this.humidity = humidity;
        this.description = description;
        this.iconURL = iconName;
        this.placeID = placeID;


    }

}
