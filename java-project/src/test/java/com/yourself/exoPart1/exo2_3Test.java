package com.yourself.exoPart1;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
/*
 if (nbHeures>200){
            salaire = (nbHeures - 200) * 1.5 * montantHoraire;
            nbHeures = 200;
        }
        if (nbHeures > 160 ){
            salaire = salaire + ((nbHeures-160) *1.25 * montantHoraire) ;
            nbHeures = 160;
        }
        salaire = salaire + (nbHeures*montantHoraire);
 */
public class exo2_3Test {
    @Test
    public void test() throws FileNotFoundException {
        try {
            //  System.out.println("Working Directory = " +
            //        System.getProperty("user.dir"));
            Assert.assertEquals(0,exo2_3.calcSalaire(0,0),0);
            Assert.assertEquals(150,exo2_3.calcSalaire(150,1),0);
            Assert.assertEquals(161.25,exo2_3.calcSalaire(161,1),0);
            Assert.assertEquals(225,exo2_3.calcSalaire(210,1),0);



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
