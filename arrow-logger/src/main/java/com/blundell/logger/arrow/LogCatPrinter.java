package com.blundell.logger.arrow;

import android.util.Log;

import java.util.List;

class LogCatPrinter implements Printer {

    private final String tag;
    private final Level level;

    public LogCatPrinter(String tag, Level level) {
        this.tag = tag;
        this.level = level;
    }

    @Override
    public void print(List<String> logs) {
        for (String s : logs) {
            log(s);
        }
    }

    private void log(String msg) {
        switch (level) {
            case V:
                Log.v(tag, msg);
                break;
            case I:
                Log.i(tag, msg);
                break;
            case D:
                Log.d(tag, msg);
                break;
            case W:
                Log.w(tag, msg);
                break;
            case E:
                Log.e(tag, msg);
                break;
            case WTF:
                Log.wtf(tag, msg);
                break;
            default:
                throw new IllegalStateException("Level " + level + " unrecognised");
        }
    }

}
