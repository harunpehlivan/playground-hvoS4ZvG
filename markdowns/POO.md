# Exercice 4.1
Ecrire une classe point
@[4.1]({"stubs": ["src/main/java/com/yourself/POO1/Point.java"], "command": "com.yourself.POO1.PointTest1#test"})
# Exercice 4.2

Inverse une chaîne

Par exemple: entrée: sortie "cool": "looc"

@[4.2]({"stubs": ["src/main/java/com/yourself/POO1/ReverseString.java"], "command": "com.yourself.POO1.ReverseStringTest#test"})



# Exercice 4.3
Créer une classe Ball.

Les objets boule doivent accepter un argument pour "type de boule" lorsqu'ils sont instanciés.

Si aucun argument n'est donné, les objets ball devraient instancier avec un "type de boule" de "regular".

ball1 = new Ball();
ball2 = new Ball("super");

ball1.ballType     //=> "regular"
ball2.ballType     //=> "super"


@[4.3]({"stubs": ["src/main/java/com/yourself/POO1/Ball.java"], "command": "com.yourself.POO1.BallTest#test"})


# Exercice 4.4
Créer une classe Ghost

Les objets fantômes sont instanciés sans arguments.

Les objets fantômes reçoivent un attribut de couleur aléatoire "blanc" ou "jaune" ou "violet" ou "rouge" lorsqu'ils sont instanciés

Ghost ghost = new Ghost();
ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
@[4.4]({"stubs": ["src/main/java/com/yourself/POO1/Ghost.java"], "command": "com.yourself.POO1.GhostTest#test"})



# Exercice 4.5
Two Fer
Two-fer or  ou 2-fer est court pour deux pour un. Un pour vous et un pour moi.

1
"Un pour X, un pour moi."
Quand X est un nom ou "vous".

Si le prénom est "Alice", le résultat devrait être  "One for Alice, one for me."
 Si aucun nom n'est donné, le résultat devrait être "One for you, one for me."

@[4.5]({"stubs": ["src/main/java/com/yourself/POO1/Twofer.java"], "command": "com.yourself.POO1.TwoferTest#test"})

# Exercice 4.6

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


@[4.6]({"stubs": ["src/main/java/com/yourself/POO1/Welcome.java"], "command": "com.yourself.POO1.WelcomeTest#test"})