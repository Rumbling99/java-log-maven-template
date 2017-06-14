package me.quanli.logtemplate.alltolog4j2;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ClassUsingLog4jImpl {

    private static final Logger LOGGER = LogManager
            .getLogger(ClassUsingLog4jImpl.class);

    public static void execute() {
        LOGGER.info("message from log4jImpl");
    }

}
