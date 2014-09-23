package com.blundell.logger.arrow;

public class ArrowLog {

    private static final String DEFAULT_TAG = "ArrowLog";

    public static void log(String msg) {
        log(DEFAULT_TAG, msg);
    }

    public static void log(String tag, String msg) {
        MessageWrapper messageWrapper = ArrowMessageWrapper.newInstance();
        Printer printer = new LogCatPrinter(tag, Level.D);
        AlertPrinter alertPrinter = new AlertPrinter(messageWrapper, printer);
        alertPrinter.print(msg);
    }

}
