package com.rtbytez.common.util;

import org.slf4j.LoggerFactory;
import org.slf4j.impl.SimpleLogger;

import java.lang.reflect.Field;

public class Functions {

    /**
     * Have a logger that is annoying and needs disabling?
     * Well then run this method to get you out of your logger problems. Don't wait, run today!
     */

    public static void disableLoggerFor(Class clazz) {
        SimpleLogger logger = (SimpleLogger) LoggerFactory.getLogger(clazz);
        try {
            Field field = SimpleLogger.class.getDeclaredField("currentLogLevel");
            field.setAccessible(true);
            field.set(logger, 25);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
