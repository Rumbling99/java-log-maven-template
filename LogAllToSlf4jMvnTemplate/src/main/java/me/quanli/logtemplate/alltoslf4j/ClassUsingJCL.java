package me.quanli.logtemplate.alltoslf4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ClassUsingJCL {

    private static final Log LOGGER = LogFactory.getLog(ClassUsingJCL.class);

    public static void execute() {
        LOGGER.info("message from JCL");
    }

}
