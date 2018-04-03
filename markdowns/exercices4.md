

# Exercice 2.2
Robot simulateur
Écris un simulateur de robot.

L'installation d'essai d'une usine de robot a besoin d'un programme pour vérifier les mouvements du robot.

Les robots ont trois mouvements possibles:

tournez à droite
tournez à gauche
avance
Les robots sont placés sur une grille hypothétique infinie,
face à une direction particulière
 (nord, est, sud ou ouest) à un ensemble de coordonnées {x, y},
 par exemple, {3,8}, avec des coordonnées augmentant au nord et à l'est .

Le robot reçoit alors un certain nombre d'instructions,


La chaîne de caractères "RAALAL" signifie:
Tournez à droite
Avancer deux fois
Tournez à gauche
Avancer une fois
Tournez encore à gauche
Supposons qu'un robot commence à {7, 3}
en faisant face au nord. Ensuite, ce flux d'instructions
 devrait le laisser à {9, 4} face à l'ouest.
 
@[3.2]({"stubs": ["src/main/java/com/yourself/exoPart1/exo2_4.java"], "command": "com.yourself.exoPart1.exo2_4Test#test"})