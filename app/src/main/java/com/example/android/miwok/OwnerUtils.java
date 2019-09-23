package com.example.android.miwok;

import android.util.Log;

import com.example.android.miwok.Owner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Helper methods related to requesting and receiving earthquake data from USGS.
 */
public final class OwnerUtils {

    /** Sample JSON response for a USGS query */
    private static final String SAMPLE_JSON = "{\"owners\":[{\"name\":\"Durga\",\"address\":\"AP\",\"city\":\"Vizag\",\"contact\":\"9490150379\",\"pets\":\"Dog\"},{\"name\":\"Malli\",\"address\":\"AP\",\"city\":\"Vizag\",\"contact\":\"9490150379\",\"pets\":\"Dog\"},{\"name\":\"Ravi\",\"address\":\"AP\",\"city\":\"Vizag\",\"contact\":\"9490150379\",\"pets\":\"Dog\"},{\"name\":\"Hari\",\"address\":\"AP\",\"city\":\"Vizag\",\"contact\":\"9490150379\",\"pets\":\"Dog\"},{\"name\":\"Anil\",\"address\":\"AP\",\"city\":\"Vizag\",\"contact\":\"9490150379\",\"pets\":\"Dog\"},{\"name\":\"Durga\",\"address\":\"AP\",\"city\":\"Vizag\",\"contact\":\"9490150379\",\"pets\":\"Dog\"},{\"name\":\"Durga\",\"address\":\"AP\",\"city\":\"Vizag\",\"contact\":\"9490150379\",\"pets\":\"Dog\"}]}";


    /**
     * Create a private constructor because no one should ever create a {@link OwnerUtils} object.
     * This class is only meant to hold static variables and methods, which can be accessed
     * directly from the class name QueryUtils (and an object instance of QueryUtils is not needed).
     */
    private OwnerUtils() {
    }

    /**
     * Return a list of {@link Earthquake} objects that has been built up from
     * parsing a JSON response.
     */
    public static ArrayList<Owner> extractOwnersList() {

        // Create an empty ArrayList that we can start adding earthquakes to
        ArrayList<Owner> records = new ArrayList<>();

        // Try to parse the SAMPLE_JSON_RESPONSE. If there's a problem with the way the JSON
        // is formatted, a JSONException exception object will be thrown.
        // Catch the exception so the app doesn't crash, and print the error message to the logs.
        try {

            // TODO: Parse the response given by the SAMPLE_JSON_RESPONSE string and
            // build up a list of Earthquake objects with the corresponding data.

            JSONObject root = new JSONObject(SAMPLE_JSON);
            JSONArray ownersArray = root.getJSONArray("owners");

            int count = 7;


            for(int counter = 0; counter < count; counter++){
                JSONObject each_owner = ownersArray.getJSONObject(counter);
                String name = each_owner.getString("name");
                String addr = each_owner.getString("address");
                String city = each_owner.getString("city");
                String contact = each_owner.getString("contact");
                String pets = each_owner.getString("pets");



                records.add(new Owner(name, addr, city, contact, pets));


            }


        } catch (JSONException e) {
            // If an error is thrown when executing any of the above statements in the "try" block,
            // catch the exception here, so the app doesn't crash. Print a log message
            // with the message from the exception.
            Log.e("QueryUtils", "Problem parsing the earthquake JSON results", e);
        }

        // Return the list of earthquakes
        return records;
    }

}