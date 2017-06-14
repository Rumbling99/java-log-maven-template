package me.quanli.logtemplate.alltoslf4j;

import java.util.logging.Logger;

public class ClassUsingJUL {

    private static final Logger LOGGER = Logger
            .getLogger(ClassUsingJUL.class.getName());

    public static void execute() {
        LOGGER.info("message from JUL");
    }

}
