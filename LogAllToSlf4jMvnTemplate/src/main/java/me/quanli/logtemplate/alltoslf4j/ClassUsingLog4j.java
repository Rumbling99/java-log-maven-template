package me.quanli.logtemplate.alltoslf4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ClassUsingLog4j {

    private static final Logger LOGGER = LogManager
            .getLogger(ClassUsingLog4j.class);

    public static void execute() {
        LOGGER.info("message from log4j");
    }

}
