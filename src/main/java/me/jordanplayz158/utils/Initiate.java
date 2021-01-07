package me.jordanplayz158.utils;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Initiate {
    // Function I made to fix the log errors in JDA
    public static Logger log() {
        // Fix for "Failed to load class "org.slf4j.impl.StaticLoggerBinder"
        BasicConfigurator.configure();

        // Only log INFO logs as to not make console messy with DEBUG logs
        Logger logger = Logger.getRootLogger();
        logger.setLevel(Level.INFO);

        return logger;
    }

    // Function I made to fix the log errors in JDA
    public static Logger log(Level loggingType) {
        // Fix for "Failed to load class "org.slf4j.impl.StaticLoggerBinder"
        BasicConfigurator.configure();

        // Only log INFO logs as to not make console messy with DEBUG logs
        Logger logger = Logger.getRootLogger();
        logger.setLevel(loggingType);

        return logger;
    }
}
