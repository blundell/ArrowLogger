package com.blundell.logger.arrow;

import java.util.List;

public class AlertLog {

    private final MessageWrapper messageWrapper;
    private final Printer printer;

    public AlertLog(MessageWrapper messageWrapper, Printer printer) {
        this.messageWrapper = messageWrapper;
        this.printer = printer;
    }

    public void log(String msg) {
        List<String> messages = messageWrapper.wrap(msg);
        printer.print(messages);
    }

}
