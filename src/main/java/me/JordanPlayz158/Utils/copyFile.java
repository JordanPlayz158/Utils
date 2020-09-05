package me.JordanPlayz158.Utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class copyFile {
    // Another function I have made for other projects that I put into this one for a simple file copying function
    public static void copyFile(String internalName, String externalName) throws IOException {
        // Defines the file destination of where the file will be saved to
        File fileDest = new File(externalName);
        // Grabs the file from within the jar to be copied outside of the jar
        InputStream fileSrc = Thread.currentThread().getContextClassLoader().getResourceAsStream(internalName);

        // Checks if the file exists so it doesn't overwrite existing settings each time it is run
        if(fileDest.createNewFile()) {
            Files.copy(fileSrc, fileDest.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
    }
}
