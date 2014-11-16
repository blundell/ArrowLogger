package com.blundell.logger.arrow;

import java.util.List;

import junit.framework.TestCase;

public class ArrowMessageWrapperTest extends TestCase {

    public void testSimpleWrap() throws Exception {
        MessageWrapper wrapper = new ArrowMessageWrapper(7, 5);
        List<String> test = wrapper.wrap("test sentence is this long");

        new DebugPrinter().print(test);

        assertFalse("MessageWrapper output was empty", test.isEmpty());
    }

    private static final class DebugPrinter implements Printer {

        @Override
        public void print(List<String> logs) {
            for (String l : logs) {
                System.out.println(l);
            }
        }
    }
}
