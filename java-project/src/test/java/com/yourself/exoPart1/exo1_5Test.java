package com.yourself.exoPart1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class exo1_5Test {

	@Test
	public void test() throws FileNotFoundException {
		try {
            exo1_5.a = 2 ;
            exo1_5.b = 3 ;
            exo1_5.myexec();
			Assert.assertEquals("Calcul de 2 + 3 ", 5, exo1_5.resultat);
            
            exo1_5.a = 7 ;
            exo1_5.b = 2 ;
            exo1_5.myexec();
            Assert.assertEquals("Calcul de 7 + 2 ", 9 , exo1_5.resultat);
			
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
