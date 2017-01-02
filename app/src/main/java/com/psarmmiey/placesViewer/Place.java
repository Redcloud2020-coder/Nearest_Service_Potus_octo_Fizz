package com.psarmmiey.placesViewer;

/**
 * Created by psarmmiey on 12/22/16.
 */

class Place {

    private static String name;
    private static String address;
    private static String website;
    private static float rating;
    private static String iconLink;
    private static String phoneNumber;

    Place(String website) {
        /*setName(name);
        setAddress(address);*/
        setWebsite(website);
        /*setRating(Integer.parseInt(rating));
        setIconLink(iconLink);
        setPhoneNumber(phoneNumber);*/

    }

    public Place() {

    }

    public static String getName() {
        return name;
    }

// --Commented out by Inspection START (12/30/16 4:34 PM):
//    private static void setName(String name) {
//        Place.name = name;
//    }
// --Commented out by Inspection STOP (12/30/16 4:34 PM)

    public static String getAddress() {
        return address;
    }

// --Commented out by Inspection START (12/30/16 4:35 PM):
//    private static void setAddress(String address) {
//        Place.address = address;
//    }
// --Commented out by Inspection STOP (12/30/16 4:35 PM)

    public static String getWebsite() {
        return website;
    }

    private static void setWebsite(String website) {
        Place.website = website;
    }

    public static float getRating() {
        return rating;
    }

// --Commented out by Inspection START (12/30/16 4:35 PM):
//    private static void setRating(float rating) {
//        Place.rating = rating;
//    }
// --Commented out by Inspection STOP (12/30/16 4:35 PM)

    public static String getIconLink() {
        return iconLink;
    }

// --Commented out by Inspection START (12/30/16 4:35 PM):
//    private static void setIconLink(String iconLink) {
//        Place.iconLink = iconLink;
//    }
// --Commented out by Inspection STOP (12/30/16 4:35 PM)

    public static String getPhoneNumber() {
        return phoneNumber;
    }

    private static void setPhoneNumber(String phoneNumber) {
        Place.phoneNumber = phoneNumber;
    }
}
