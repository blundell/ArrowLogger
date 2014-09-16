package com.blundell.logger.arrow;

public class ArrowLog {

    private static final String DEFAULT_TAG = "ArrowLog";

    public static void log(String msg) {
        log(DEFAULT_TAG, msg);
    }

    public static void log(String tag, String msg) {
        AlertPrinter alertPrinter = new AlertPrinter(new ArrowMessageWrapper(), new LogCatPrinter(tag));
        alertPrinter.print(msg);
    }

}
