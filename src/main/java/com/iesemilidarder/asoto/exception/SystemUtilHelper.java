package com.iesemilidarder.asoto.exception;

public class SystemUtilHelper {

    private SystemUtilHelper() {
        //Todo: OS generalization
    }

    public static void consolePrint(String message) {
        System.out.println(message);
    }

    public static void logError(Exception e) {
        consolePrint("Error:" + e);
    }
}
