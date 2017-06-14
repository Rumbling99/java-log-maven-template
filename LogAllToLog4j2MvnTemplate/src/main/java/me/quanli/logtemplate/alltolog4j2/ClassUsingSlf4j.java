package me.quanli.logtemplate.alltolog4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassUsingSlf4j {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(ClassUsingSlf4j.class);

    public static void execute() {
        LOGGER.info("message from slf4j");
    }

}
