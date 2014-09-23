package com.blundell.logger.arrow;

public class ProArrowLog {

    private String msg;
    private String tag = "ProArrowLog";
    private int width = -1;
    private int height = -1;

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
        log(tag, msg, width, height);
    }

    private void log(String tag, String msg, int width, int height) {
        MessageWrapper messageWrapper = ArrowMessageWrapper.newInstance(width, height);
        Printer printer = new LogCatPrinter(tag);
        AlertPrinter alertPrinter = new AlertPrinter(messageWrapper, printer);
        alertPrinter.print(msg);
    }
}
