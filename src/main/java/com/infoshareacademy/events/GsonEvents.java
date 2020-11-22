package com.infoshareacademy.events;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileReader;

public class GsonEvents {
    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");


    public Event[] getJsonEventData(String filePath) {

        Gson gson = new Gson();
        JsonReader jsonReader = null;
        try {
            jsonReader = new JsonReader(new FileReader(filePath));
        } catch (Exception e) {
            STDOUT.error("The file cannot be found or is not in JSON format. Make sure you enter the correct details.");
        }
        return gson.fromJson(jsonReader, Event[].class);
    }

}
