package me.JordanPlayz158.Utils;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class initiateLog {
    // Function I made to fix the log errors in JDA
    public static void initiateLog() {
        // Fix for "Failed to load class "org.slf4j.impl.StaticLoggerBinder"
        BasicConfigurator.configure();

        // Only log INFO logs as to not make console messy with DEBUG logs
        Logger.getRootLogger().setLevel(Level.INFO);
    }
}
