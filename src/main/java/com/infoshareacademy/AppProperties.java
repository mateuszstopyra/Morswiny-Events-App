package com.infoshareacademy;

import java.io.*;
import java.util.Properties;

public class AppProperties {

    private Properties properties = new Properties();
    private File file = new File("resources/config.properties");

    public void loadProperties() throws IOException {

        FileInputStream input = null;
        try {
            input = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        properties.load(input);
        input.close();

    }

    public void addAndSaveProperties(String key, String value){
        OutputStream output;
        try {
            output = new FileOutputStream(file);
            properties.setProperty(key, value);
            properties.store(output, null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

