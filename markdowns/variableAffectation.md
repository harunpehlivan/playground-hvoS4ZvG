#1 - Variable et affectation 

En programmation, une **variable** est un nom qui sert à repérer un emplacement donné de la mémoire centrale.
Chaque variable a  un nom fixe et une valeur variable 

En  programmation informatique, une **affectation**, ou assignation, est une structure qui permet d'attribuer une valeur à une variable.

```
//par exemple en java
// declaration de a comme entier
int a ;
//affectation de a avec la valeur 3
a = 3;
```


#Exerice 1.1 
quelles seront les valeurs des variables a, b et c, après l’exécution de ces  instructions 
```java runnable
// { autofold
import java.io.*;

import java.util.*;



public class Main {

    public static void main (String[] args)  
    {
        int a;
        int b;
        int c;
        
    //}  
    a=5;
    b=3; 
    c=a+b;
    a=2;
    c=b-a;

        System.out.println("Hello World!");
   // { autofold
    }

} //}
```

?[Résultat ?]
-[ ] a->1 b->1 c->1 
-[x] a->2 b->3 c->1
-[ ] a->1 b->3 c->2
-[ ] a->2 b->3 c->2

