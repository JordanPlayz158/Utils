package me.JordanPlayz158.Utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class loadConfig {
    // Function I have made for other projects that I put into this one for simple json file/data loading
    public static String loadConfig(String file, String key) {
        // Defines a JSONParser
        JSONParser jsonParser = new JSONParser();
        // Tries to parse the JSON File
        try {
            // Parsing the JSON file
            JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(file));
            // Returns the key requested by the statement calling the function
            return (String) jsonObject.get(key);
        // Catches any errors that might occur and prints it to console for inspection of what went wrong
        } catch (IOException | ParseException e) {
            e.printStackTrace();
            return "1";
        }
    }
}
