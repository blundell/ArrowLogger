package com.blundell.logger.arrow;

import java.util.List;

public class AlertPrinter {

    private final MessageWrapper messageWrapper;
    private final Printer printer;

    public AlertPrinter(MessageWrapper messageWrapper, Printer printer) {
        this.messageWrapper = messageWrapper;
        this.printer = printer;
    }

    public void print(String msg) {
        List<String> messages = messageWrapper.wrap(msg);
        printer.print(messages);
    }

}
