package com.yourself.POO1;


import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*

Créer une classe Ball.

Les objets boule doivent accepter un argument pour "type de boule" lorsqu'ils sont instanciés.

Si aucun argument n'est donné, les objets ball devraient instancier avec un "type de boule" de "regular".

ball1 = new Ball();
ball2 = new Ball("super");

ball1.ballType     //=> "regular"
ball2.ballType     //=> "super"


 */
public class BallTest {

	@Test
	public void test() throws FileNotFoundException {
		try {
			Assert.assertEquals(new Ball().ballType, "regular");
			Assert.assertEquals(new Ball("super").ballType, "super");
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
