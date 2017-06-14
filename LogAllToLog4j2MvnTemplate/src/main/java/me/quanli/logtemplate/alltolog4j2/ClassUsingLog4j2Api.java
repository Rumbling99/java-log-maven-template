package me.quanli.logtemplate.alltolog4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClassUsingLog4j2Api {

    private static final Logger LOGGER = LogManager
            .getLogger(ClassUsingLog4j2Api.class);

    public static void execute() {
        LOGGER.info("message from log4j2Api");
    }

}
