package org.example.controller;

import org.example.model.Logger;

public class Utils {
    public static void runLoggers(Logger [] loggers){
        for (Logger logger : loggers){
            logger.log();
        }
    }
}
