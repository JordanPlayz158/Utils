package me.jordanplayz158.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileUtils {
    // Another function I have made for other projects that I put into this one for a simple file copying function
    public static void copyFile(File internalName, File externalName) throws IOException {
        // Grabs the file from within the jar to be copied outside of the jar
        InputStream fileSrc = Thread.currentThread().getContextClassLoader().getResourceAsStream(internalName.getPath());

        // Checks if the file exists so it doesn't overwrite existing settings each time it is run
        if(externalName.createNewFile()) {
            assert fileSrc != null;
            Files.copy(fileSrc, externalName.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
    }

    public static void copyFile(File name) throws IOException {
        // Grabs the file from within the jar to be copied outside of the jar
        InputStream fileSrc = Thread.currentThread().getContextClassLoader().getResourceAsStream(name.getPath());

        // Checks if the file exists so it doesn't overwrite existing settings each time it is run
        if(name.createNewFile()) {
            assert fileSrc != null;
            Files.copy(fileSrc, name.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
    }

    // Function I made to easily download and save files
    public static void downloadFile(URL url, File filename) throws IOException {
        // Opens/reads the url
        ReadableByteChannel readableByteChannel = Channels.newChannel(url.openStream());

        // Tells the function what to log the downloaded file to (which in this case is the String defined when calling the function, filename)
        FileOutputStream fileOutputStream = new FileOutputStream(filename);

        // Writes the contents of the readableByteChannel to the file
        fileOutputStream.getChannel().transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
    }
}
