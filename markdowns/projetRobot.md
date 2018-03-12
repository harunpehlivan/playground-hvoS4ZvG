#  Projet ROBOT

On souhaite réaliser une applications gérant des robots dans un monde en 2 dimensions.

# Le monde 
Afin de pouvoir faire évoluer ces robots, nous allons créer un monde en 2 dimensions. Cet environnement, décrit dans un classe Monde sera un tableau à 2 dimensions (de taille maximale 20 par 30). On ajoutera 2 données membres largeur et longueur (définissant la largeur et la longueur réelles de l’environnement).

Cette classe comprendra un constructeur ayant pour paramètres la largeur et la longueur du monde. Ce constructeur initialisera les valeurs de l’ensemble du tableau à -1 (signifiant qu’aucun robot n’est présent).

Cette classe comprendra des méthodes dont :
-------------

– une méthode public void toString(), qui calcule la représentaiotn de  l’environnement dans la console.
par exemple:
```java runnable 
Monde m = new Monde(2,2);
System.out.println(m.toString())

```
Affiche le texte
```
-1 -1
-1 -1
```

– une méthode public boolean estLibre(int X, int Y), prenant comme paramètres une coordonnée X et  
une coordonnée Y de l’environnement, qui renverra false si la case de l’environnement  est  
déjà occupée par un robot.


– une méthode public void libere(int X, int Y), prenant comme paramètres une coordonnée X et une co- ordonnée Y de l’environnement, qui libérera la case correspondante (en attribuant la valeur -1).

– une méthode public void occupe(int X, int Y, int num), prenant comme paramètres une coordonnée X et une coordonnée Y de l’environnement, ainsi qu’un numéro de robot, qui indiquera que la case est occupée par  ce robot.

