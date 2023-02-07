package ru.lessons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Slf4jSimple {
    private static final Logger log = LoggerFactory.getLogger(Slf4jSimple.class.getName());
    private static final Marker IMPORTANT = MarkerFactory.getMarker("IMPORTANT");

    public static void main(String[] args) {
        log.info("Program starting...");

        for (int i = 0; i < 20; i++)
            if (i % 2 == 0) {
                log.debug("Debug index {}", i);
            } else {
                log.warn(IMPORTANT, "Warning index {}", i);
            }

        log.info("Program close...");
    }
}

