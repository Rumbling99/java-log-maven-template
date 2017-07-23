package me.quanli.logtemplate.alltolog4j2;

public class Main {

    static {
        System.setProperty("java.util.logging.manager",
                "org.apache.logging.log4j.jul.LogManager");
    }

    public static void main(String[] args) {
        ClassUsingJCL.execute();
        ClassUsingSlf4j.execute();
        ClassUsingJUL.execute();
        ClassUsingLog4j.execute();
        ClassUsingLog4j2.execute();
    }

}
