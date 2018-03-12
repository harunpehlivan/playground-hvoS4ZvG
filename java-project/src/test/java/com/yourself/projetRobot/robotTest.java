package com.yourself.projetRobot;

import com.yourself.exoPart1.exo1_5;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class robotTest {

    @Test
    public void testMonde() throws FileNotFoundException {
        try {





            Monde m = new Monde(40,50);
            Assert.assertEquals("Dimension du monde Longueur  ", 40, m.getLongueur());
            Assert.assertEquals("Dimension du monde Largeur  ", 50, m.getLargeur());

            m = new Monde();

            Assert.assertEquals("Dimension du monde Longueur  ", 0, m.getLongueur());
            Assert.assertEquals("Dimension du monde Largeur  ", 0, m.getLargeur());

             m = new Monde();
            m.setLongueur(20);
            m.setLargeur(30);
            m.init();
            Assert.assertEquals("Dimension du monde Longueur  ", 20, m.getLongueur());
            Assert.assertEquals("Dimension du monde Largeur  ", 30, m.getLargeur());



            m = new Monde(2,2);
            Assert.assertEquals("Monde Vide  ", "-1 -1 \n-1 -1 \n", m.toString());


        } catch (AssertionError ae) {
            success(false);
            msg("Oops! 🐞", ae.getMessage());
           // msg("Hint 💡", " 🤔");
        }
    }

    private static void msg(String channel, String msg) {
        System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
    }

    private static void success(boolean success) {
        System.out.println(String.format("TECHIO> success %s", success));
    }

    // check if a string exists in a text file
    private static boolean existsInFile(String str, File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        try {
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().contains(str))
                    return true;
            }
            return false;
        } finally {
            scanner.close();
        }
    }
}
