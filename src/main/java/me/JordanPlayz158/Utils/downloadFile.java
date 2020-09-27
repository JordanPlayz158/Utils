package me.JordanPlayz158.Utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public class downloadFile {
    // Function I made to easily download and save files
    public static void downloadFile(URL url, String filename) throws IOException {
        // Opens/reads the file
        ReadableByteChannel readableByteChannel = Channels.newChannel(url.openStream());

        // Tells the function what to log the downloaded file to (which in this case is the String defined when calling the function, filename)
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        FileChannel fileChannel = fileOutputStream.getChannel();

        // Writes the contents of the readableByteChannel to the file
        fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
    }
}
