package com.yourself.POO1;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/*

Two Fer
Two-fer or  ou 2-fer est court pour deux pour un. Un pour vous et un pour moi.

1
"Un pour X, un pour moi."
Quand X est un nom ou "vous".

Si le prénom est "Alice", le résultat devrait être  "One for Alice, one for me."
 Si aucun nom n'est donné, le résultat devrait être "One for you, one for me."
 */
public class TwoferTest {

    private Twofer twofer;

    @Before
    public void setup() {
        twofer = new Twofer();
    }

    @Test
    public void Test() {
        String input = null;
        String expected = "One for you, one for me.";

        assertEquals(expected, twofer.twofer(input));

      input = "Alice";
         expected = "One for Alice, one for me.";

        assertEquals(expected, twofer.twofer(input));

         input = "Bob";
         expected = "One for Bob, one for me.";

        assertEquals(expected, twofer.twofer(input));
    }
}