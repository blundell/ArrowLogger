package com.blundell.logger.arrow;

import java.util.ArrayList;
import java.util.List;

class ArrowMessageWrapper implements MessageWrapper {

    private static final int DEFAULT = -1;
    private static final int DEFAULT_HEIGHT = 5;
    private static final int DEFAULT_WIDTH = 7;

    private static final String LINE_START = "`";
    private static final String L = "\\";
    private static final String R = "/";
    private static final String SPACER = " ";

    private final int height;
    private final int width;

    static MessageWrapper newInstance() {
        return newInstance(DEFAULT, DEFAULT);
    }

    static MessageWrapper newInstance(int width, int height) {
        int checkedHeight = height == DEFAULT ? DEFAULT_HEIGHT : height;
        int checkedWidth = width == DEFAULT ? DEFAULT_WIDTH : width;
        return new ArrowMessageWrapper(checkedHeight, checkedWidth);
    }

    ArrowMessageWrapper(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public List<String> wrap(String msg) {
        List<String> logs = new ArrayList<String>(height * 2 + 1);

        String maxSpace = calculateMaxSpaceInArrow();

        logs.addAll(calculateTopArrows(maxSpace));
        logs.addAll(calculateBorder(msg, maxSpace));
        logs.addAll(calculateCenteredMessage(msg, maxSpace));
        logs.addAll(calculateBorder(msg, maxSpace));
        logs.addAll(calculateBottomArrows(maxSpace));

        return logs;
    }

    private String calculateMaxSpaceInArrow() {
        String maxSpace = "";
        for (int i = 0; i < height; i++) {
            maxSpace = maxSpace + SPACER;
        }
        return maxSpace;
    }

    private List<String> calculateTopArrows(String maxSpace) {
        List<String> logs = new ArrayList<String>();
        String topMiddleSpacer = maxSpace + maxSpace;
        String topOutsideSpace = "";
        for (int x = 0; x < height; x++) {
            topOutsideSpace = topOutsideSpace + SPACER;
            topMiddleSpacer = topMiddleSpacer.replaceFirst(SPACER + SPACER, "");
            String arrowChunk = topOutsideSpace + L + topMiddleSpacer + R + topOutsideSpace;
            String multipleArrowsChuck = getArrowChunksForRow(arrowChunk);
            logs.add(LINE_START + multipleArrowsChuck);
        }
        return logs;
    }

    private String getArrowChunksForRow(String arrowChunk) {
        String multipleArrowsChuck = arrowChunk;
        for (int y = 0; y < width; y++) {
            multipleArrowsChuck = multipleArrowsChuck + arrowChunk;
        }
        return multipleArrowsChuck;
    }

    private List<String> calculateBorder(String msg, String maxSpace) {
        List<String> logs = new ArrayList<String>();
        StringBuilder border = new StringBuilder(((maxSpace.length() + 2) * 2) * width);
        for (int i = 0; i < border.capacity(); i++) {
            border.append('=');
        }
        logs.add(LINE_START + border.toString());
        return logs;
    }

    private List<String> calculateCenteredMessage(String msg, String maxSpace) {
        int halfTheSpace = ((maxSpace.length() + 2) * width) - (msg.length() / 2);
        String msgCenterer = "";
        for (int i = 0; i < halfTheSpace; i++) {
            msgCenterer = msgCenterer + " ";
        }

        List<String> logs = new ArrayList<String>();
        logs.add(LINE_START + msgCenterer + msg);
        return logs;
    }

    private List<String> calculateBottomArrows(String maxSpace) {
        List<String> logs = new ArrayList<String>();
        String bottomOutsideSpacer = maxSpace;
        String bottomMiddleSpace = "";
        for (int x = 0; x < height; x++) {
            String arrowChunk = bottomOutsideSpacer + R + bottomMiddleSpace + L + bottomOutsideSpacer;
            String multipleArrowsChuck = getArrowChunksForRow(arrowChunk);
            logs.add(LINE_START + multipleArrowsChuck);
            bottomOutsideSpacer = bottomOutsideSpacer.replaceFirst(SPACER, "");
            bottomMiddleSpace = bottomMiddleSpace + SPACER + SPACER;
        }
        return logs;
    }

}
