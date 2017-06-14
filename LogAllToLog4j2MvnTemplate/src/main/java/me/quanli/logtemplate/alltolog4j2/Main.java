package me.quanli.logtemplate.alltolog4j2;

public class Main {

    static {
        System.setProperty("java.util.logging.manager",
                "org.apache.logging.log4j.jul.LogManager");
    }

    public static void main(String[] args) {
        ClassUsingJCL.execute();
        ClassUsingJUL.execute();
        ClassUsingSlf4j.execute();
        ClassUsingLog4j2Api.execute();
        ClassUsingLog4jImpl.execute();
    }

}
