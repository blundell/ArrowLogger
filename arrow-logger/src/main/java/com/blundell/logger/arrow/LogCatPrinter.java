package com.blundell.logger.arrow;

import android.util.Log;

import java.util.List;

class LogCatPrinter implements Printer {

    private final String tag;

    public LogCatPrinter(String tag) {
        this.tag = tag;
    }

    @Override
    public void print(List<String> logs) {
        for (String s : logs) {
            Log.d(tag, s);
        }
    }
}
