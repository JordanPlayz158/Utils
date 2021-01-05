package me.jordanplayz158.utils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Map;

public class LoadJson {
    private static final Gson gson = new Gson();

    // Function I have made for other projects that I put into this one for simple json value loading
    public static String value(File file, String key) {
        try {
            // create a reader
            Reader reader = Files.newBufferedReader(file.toPath());

            // convert JSON file to map
            Map<?, ?> map = gson.fromJson(reader, Map.class);

            // print map entries
            for(Map.Entry<?, ?> entry : map.entrySet()) {
                if(entry.getKey().equals(key)) {
                    return entry.getValue().toString();
                }
            }

            // close reader
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Function I have made for other projects that I put into this one for simple json value loading
    public static ArrayList<?> array(File file, String key) {
        try {
            // create a reader
            Reader reader = Files.newBufferedReader(file.toPath());

            // convert JSON file to map
            Map<?, ?> map = gson.fromJson(reader, Map.class);

            // print map entries
            for(Map.Entry<?, ?> entry : map.entrySet()) {
                if(entry.getKey().equals(key)) {
                    return (ArrayList<?>) entry.getValue();
                }
            }

            // close reader
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static JsonObject linkedTreeMap(File file) {
        try {
            // create a reader
            Reader reader = Files.newBufferedReader(file.toPath());

            return gson.fromJson(reader, JsonObject.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
