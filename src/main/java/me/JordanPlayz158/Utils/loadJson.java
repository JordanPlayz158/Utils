package me.JordanPlayz158.Utils;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;

public class loadJson {
    private static final Gson gson = new Gson();

    // Function I have made for other projects that I put into this one for simple json value loading
    public static String value(String file, String key) {
        try {
            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get(file));

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
    public static ArrayList array(String file, String key) {
        try {
            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get(file));

            // convert JSON file to map
            Map<?, ?> map = gson.fromJson(reader, Map.class);

            // print map entries
            for(Map.Entry<?, ?> entry : map.entrySet()) {
                if(entry.getKey().equals(key)) {
                    return (ArrayList) entry.getValue();
                }
            }

            // close reader
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
