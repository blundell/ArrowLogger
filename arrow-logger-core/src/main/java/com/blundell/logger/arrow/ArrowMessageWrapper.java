package com.blundell.logger.arrow;

import java.util.ArrayList;
import java.util.List;

class ArrowMessageWrapper implements MessageWrapper {

    // TODO add multiple arrows along the row
    // TODO encase the text in a line of equals signs
    // TODO center the text on the line (account for text length)

    private static final String LINE_START = "`";
    private static final String L = "\\";
    private static final String R = "/";
    private static final String SPACER = " ";
    private static final int DEPTH = 5;

    @Override
    public List<String> wrap(String msg) {
        List<String> logs = new ArrayList<String>(DEPTH * 2 + 1);

        String maxSpace = calculateMaxSpaceInArrowHead();

        logs.addAll(calculateTopArrowHead(maxSpace));
        logs.addAll(calculateCenteredMessage(msg, maxSpace));
        logs.addAll(calculateBottomArrowHead(maxSpace));

        return logs;
    }

    private List<String> calculateTopArrowHead(String maxSpace) {
        List<String> logs = new ArrayList<String>();
        String topMiddleSpacer = maxSpace + maxSpace;
        String topOutsideSpace = "";
        for (int i = 0; i < DEPTH; i++) {
            topOutsideSpace = topOutsideSpace + SPACER;
            topMiddleSpacer = topMiddleSpacer.replaceFirst(SPACER + SPACER, "");
            logs.add(LINE_START + topOutsideSpace + L + topMiddleSpacer + R + topOutsideSpace);
        }
        return logs;
    }

    private List<String> calculateCenteredMessage(String msg, String maxSpace) {
        List<String> logs = new ArrayList<String>();
        String msgCenterer = maxSpace.replaceFirst(maxSpace.substring(0, maxSpace.length() / 2), "");
        logs.add(LINE_START + msgCenterer + msg);
        return logs;
    }

    private List<String> calculateBottomArrowHead(String maxSpace) {
        List<String> logs = new ArrayList<String>();
        String bottomOutsideSpacer = maxSpace;
        String bottomMiddleSpace = "";
        for (int i = 0; i < DEPTH; i++) {
            logs.add(LINE_START + bottomOutsideSpacer + R + bottomMiddleSpace + L + bottomOutsideSpacer);
            bottomOutsideSpacer = bottomOutsideSpacer.replaceFirst(SPACER, "");
            bottomMiddleSpace = bottomMiddleSpace + SPACER + SPACER;
        }
        return logs;
    }

    private String calculateMaxSpaceInArrowHead() {
        String maxSpace = "";
        for (int i = 0; i < DEPTH; i++) {
            maxSpace = maxSpace + SPACER;
        }
        return maxSpace;
    }

}
