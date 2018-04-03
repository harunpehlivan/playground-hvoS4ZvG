package com.yourself.exoPart1;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class exo2_4Test {
    @Test
    public void test() throws FileNotFoundException {
        try {
            

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
