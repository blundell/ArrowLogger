package com.blundell.logger.arrow;

import java.util.ArrayList;
import java.util.List;

class ArrowMessageWrapper implements MessageWrapper {

    // TODO add multiple arrows along the row

    private static final String LINE_START = "`";
    private static final String L = "\\";
    private static final String R = "/";
    private static final String SPACER = " ";
    private static final int DEPTH = 5;
    private static final int LENGTH = 7;

    @Override
    public List<String> wrap(String msg) {
        List<String> logs = new ArrayList<String>(DEPTH * 2 + 1);

        String maxSpace = calculateMaxSpaceInArrowHead();

        logs.addAll(calculateTopArrowHead(maxSpace));
        logs.addAll(calculateBorder(msg));
        logs.addAll(calculateCenteredMessage(msg, maxSpace));
        logs.addAll(calculateBorder(msg));
        logs.addAll(calculateBottomArrowHead(maxSpace));

        return logs;
    }

    private List<String> calculateBorder(String msg) {
        List<String> logs = new ArrayList<String>();
        StringBuilder border = new StringBuilder(msg.length());
        for (int i = 0; i < msg.length(); i++) {
            border.append('=');
        }
        logs.add(LINE_START + border.toString());
        return logs;
    }

    private String calculateMaxSpaceInArrowHead() {
        String maxSpace = "";
        for (int i = 0; i < DEPTH; i++) {
            maxSpace = maxSpace + SPACER;
        }
        return maxSpace;
    }

    private List<String> calculateTopArrowHead(String maxSpace) {
        List<String> logs = new ArrayList<String>();
        String topMiddleSpacer = maxSpace + maxSpace;
        String topOutsideSpace = "";
        for (int x = 0; x < DEPTH; x++) {
            topOutsideSpace = topOutsideSpace + SPACER;
            topMiddleSpacer = topMiddleSpacer.replaceFirst(SPACER + SPACER, "");
            String arrowChunk = topOutsideSpace + L + topMiddleSpacer + R + topOutsideSpace;
            String multipleArrowsChuck = getArrowChunksForRow(arrowChunk);
            logs.add(LINE_START + multipleArrowsChuck);
        }
        return logs;
    }

    private List<String> calculateCenteredMessage(String msg, String maxSpace) {
        String msgCenterer = maxSpace.replaceFirst(maxSpace.substring(0, maxSpace.length() / 2), "");

        List<String> logs = new ArrayList<String>();
        logs.add(LINE_START + msgCenterer + msg);
        return logs;
    }

    private List<String> calculateBottomArrowHead(String maxSpace) {
        List<String> logs = new ArrayList<String>();
        String bottomOutsideSpacer = maxSpace;
        String bottomMiddleSpace = "";
        for (int x = 0; x < DEPTH; x++) {
            String arrowChunk = bottomOutsideSpacer + R + bottomMiddleSpace + L + bottomOutsideSpacer;
            String multipleArrowsChuck = getArrowChunksForRow(arrowChunk);
            logs.add(LINE_START + multipleArrowsChuck);
            bottomOutsideSpacer = bottomOutsideSpacer.replaceFirst(SPACER, "");
            bottomMiddleSpace = bottomMiddleSpace + SPACER + SPACER;
        }
        return logs;
    }

    private String getArrowChunksForRow(String arrowChunk) {
        String multipleArrowsChuck = arrowChunk;
        for (int y = 0; y < LENGTH; y++) {
            multipleArrowsChuck = multipleArrowsChuck + arrowChunk;
        }
        return multipleArrowsChuck;
    }

}
