package com.yourself.POO1;

import org.junit.Test;

import java.io.FileNotFoundException;

public class PointTest1 {



    @Test
    public void test() throws FileNotFoundException {
        try {
            Point p = new Point('p',3.0);

        } catch (AssertionError ae) {
            success(false);
            msg("Oops! 🐞", ae.getMessage());
            msg("Hint 💡", " 🤔");
        }
    }
    private static void msg(String channel, String msg) {
        System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
    }

    private static void success(boolean success) {
        System.out.println(String.format("TECHIO> success %s", success));
    }

}

