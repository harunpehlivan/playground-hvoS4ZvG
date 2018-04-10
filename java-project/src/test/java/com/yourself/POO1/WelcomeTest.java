package com.yourself.POO1;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
La tâche

Pensez à un moyen de stocker les langues en tant que base de données (par exemple un objet). Les langues sont listées ci-dessous afin que vous puissiez copier et coller!
Ecrivez une fonction 'welcome' qui prend un paramètre 'language' (toujours une chaîne), et retourne un message d'accueil - si vous l'avez dans votre base de données. Il devrait par défaut à l'anglais si la langue n'est pas dans la base de données, ou dans le cas d'une entrée invalide.

Base de donnée

english: "Welcome",
czech: "Vitejte",
danish: "Velkomst",
dutch: "Welkom",
estonian: "Tere tulemast",
finnish: "Tervetuloa",
flemish: "Welgekomen",
french: "Bienvenue",
german: "Willkommen",
irish: "Failte",
italian: "Benvenuto",
latvian: "Gaidits",
lithuanian: "Laukiamas",
polish: "Witamy",
spanish: "Bienvenido",
swedish: "Valkommen",
welsh: "Croeso"


 */
public class WelcomeTest {

	@Test
	public void test() throws FileNotFoundException {
		try {

			Assert.assertEquals("Your function should have returned 'Welcome'. Try again.","Welcome", Welcome.greet("english"));
			Assert.assertEquals("Your function should have returned 'Welkom'. Try again.", "Welkom", Welcome.greet("dutch"));
			Assert.assertEquals("Your function should have returned 'Welcome'. Try again.", "Welcome", Welcome.greet("IP_ADDRESS_INVALID"));



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
