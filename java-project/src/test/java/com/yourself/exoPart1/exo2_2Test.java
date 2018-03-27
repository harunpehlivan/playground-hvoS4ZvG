package com.yourself.exoPart1;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by richard on 27/03/2018.
 */
//Decomposition
//100 Euros, 50 Euros , 20 Euos 10 Euros, et
// de pièces de 2 Euros et 1 Euro qu'elle représente.
public class exo2_2Test {
    @Test
    public void test() throws FileNotFoundException {
        try {
          //  System.out.println("Working Directory = " +
            //        System.getProperty("user.dir"));
            boolean hasFor = libUtil.existsInFile("for",new File("src/main/java/com/yourself/exoPart1/exo2_2.java"));
            Assert.assertEquals("NO FOR",hasFor,false);
            boolean hasWhile = libUtil.existsInFile("while",new File("src/main/java/com/yourself/exoPart1/exo2_2.java"));
            Assert.assertEquals("NO While",hasWhile,false);
            // Assert.assertEquals("pour 325", "3 0 1 0 2 1", exo2_2.calc(325));
           // Assert.assertEquals("pour 0", "0 0 0 0 0 0", exo2_2.calc(325));

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
