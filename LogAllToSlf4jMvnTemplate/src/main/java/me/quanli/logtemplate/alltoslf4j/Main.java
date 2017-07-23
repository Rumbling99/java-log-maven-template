package me.quanli.logtemplate.alltoslf4j;

import org.slf4j.bridge.SLF4JBridgeHandler;

public class Main {

    static {
        // redirect all JUL log records to the SLF4J API, see
        // {@link SLF4JBridgeHandler} for more info
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
    }

    public static void main(String[] args) {
        ClassUsingJCL.execute();
        ClassUsingSlf4j.execute();
        ClassUsingJUL.execute();
        ClassUsingLog4j.execute();
        ClassUsingLog4j2.execute();
    }

}
