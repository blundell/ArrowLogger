package com.blundell.logger.arrow;

public class ProArrowLog {

    private static final String DEFAULT_TAG = "ProArrowLog";
    private static final int DEFAULT_DIMEN = -1;

    private String msg;
    private String tag = DEFAULT_TAG;
    private int width = DEFAULT_DIMEN;
    private int height = DEFAULT_DIMEN;

    public static ProArrowLog pal() {
        return new ProArrowLog();
    }

    public ProArrowLog height(int height) {
        this.height = height;
        return this;
    }

    public ProArrowLog width(int width) {
        this.width = width;
        return this;
    }

    public ProArrowLog log(String msg) {
        this.msg = msg;
        return this;
    }

    public ProArrowLog tag(String tag) {
        this.tag = tag;
        return this;
    }

    public void now() {
        if (msg == null) {
            throw new IllegalStateException("msg is null, call log(String msg). I thought you were pr0 d3v?");
        }
        log(tag, msg, width, height);
    }

    private void log(String tag, String msg, int width, int height) {
        MessageWrapper messageWrapper = ArrowMessageWrapper.newInstance(width, height);
        Printer printer = new LogCatPrinter(tag);
        AlertPrinter alertPrinter = new AlertPrinter(messageWrapper, printer);
        alertPrinter.print(msg);
    }
}
