package com.yourself.POO1;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/*
Inverse une chaîne

Par exemple: entrée: sortie "cool": "looc"
 */
public class ReverseStringTest {

    @Test
    public void test() {
        assertEquals("", new ReverseString().reverse(""));

        assertEquals("tobor", new ReverseString().reverse("robot"));

        assertEquals("nemaR", new ReverseString().reverse("Ramen"));

        assertEquals("!yrgnuh m'I", new ReverseString().reverse("I'm hungry!"));

        assertEquals("racecar", new ReverseString().reverse("racecar"));
    }

}
