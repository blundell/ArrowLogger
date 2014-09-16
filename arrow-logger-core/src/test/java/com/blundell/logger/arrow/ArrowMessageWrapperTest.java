package com.blundell.logger.arrow;

import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class ArrowMessageWrapperTest {

    @Test
    public void testWrap() throws Exception {
        MessageWrapper wrapper = new ArrowMessageWrapper();
        List<String> test = wrapper.wrap("test");

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
