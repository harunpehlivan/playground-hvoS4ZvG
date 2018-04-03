# 1 - Variable et affectation 

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


# Exerice 1.1 
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

       
   // { autofold
    }

} //}
```

?[Résultat ?]
-[ ] a->1 b->1 c->1 
-[x] a->2 b->3 c->1
-[ ] a->1 b->3 c->2
-[ ] a->2 b->3 c->2


# Exercice 1.2
quelles seront les valeurs des variables a et b après l’exécution de ces  instructions 
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
    b=a+4;
    a=a+1;
    b=a-4;

       
   // { autofold
    }

} //}
```

?[Résultat ?]
-[ ] a->1 b->1  
-[x] a->6 b->2 
-[ ] a->5 b->3
-[ ] a->0 b->0


# Exercice 1.3
quelles seront les valeurs des variables a et b  après l’exécution de ces  instructions 
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
    a=5 ;
    b=7 ;
    a=b ;
    b=a;
    
       
   // { autofold
    }

} //}
```

?[Résultat ?]
-[ ] a->5 b->7  
-[x] a->7 b->7 
-[ ] a->5 b->5
-[ ] a->7 b->5 


# Exercice 1.4
quelles seront les valeurs des variables a et b  après l’exécution de ces  instructions 
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
    a=5 ;
    b=7 ;
    b=a ;
    a=b;
    
       
   // { autofold
    }

} //}
```

?[Résultat ?]
-[ ] a->5 b->7  
-[ ] a->7 b->7 
-[x] a->5 b->5
-[ ] a->7 b->5 




# Exercice 1.5 
Ecrire un programme qui calcule la somme de deux nombres.
les valeurs sont renseignées dans a et b. Le résultat est rangé dans resultat.

@[1.5]({"stubs": ["src/main/java/com/yourself/exoPart1/exo1_5.java"], "command": "com.yourself.exoPart1.exo1_5Test#test"})

# Exercice 1.6 
Ecrire un programme qui calcule la différence de deux nombres.
les valeurs sont renseignées dans a et b. Le résultat est rangé dans resultat.

@[1.6]({"stubs": ["src/main/java/com/yourself/exoPart1/exo1_6.java"], "command": "com.yourself.exoPart1.exo1_6Test#test"})

# Exercice 1.7 
Ecrire un programme qui calcule le reste de la division de deux nombres.
les valeurs sont renseignées dans a et b. Le résultat est rangé dans resultat.

@[1.6]({"stubs": ["src/main/java/com/yourself/exoPart1/exo1_7.java"], "command": "com.yourself.exoPart1.exo1_7Test#test"})



