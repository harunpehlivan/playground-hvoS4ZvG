package com.yourself.POO1;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*

Créer une classe Ghost

Les objets fantômes sont instanciés sans arguments.

Les objets fantômes reçoivent un attribut de couleur aléatoire "blanc" ou "jaune" ou "violet" ou "rouge" lorsqu'ils sont instanciés

Ghost ghost = new Ghost();
ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"


 */
public class GhostTest {

	@Test
	public void test() throws FileNotFoundException {
		try {
			Ghost ghost = new Ghost();
			ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
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
