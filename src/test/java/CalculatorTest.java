import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
//alt + insert entre les accolades pour generate test , par défaut le nom de la méthode sera void name() ensuite on change ce nom
    void testAddTwoPositiveNumbers() {
        // 1) ARRANGE   on organise les entrants, on crée 2 nombres entiers
        int a = 2;
        int b = 3;

        //et je  crée aussi une classe Calculator
        Calculator calculator = new Calculator();//cette classe n'existe pas encore mais grâce à IDE on va la créer
        //mais cette fois-ci dans le vrai source du projet SRC / MAIN / JAVA
        //Nous avons donc une classe Calculator vide mais notre code de test compile

        // 2) ACT   j'appelle l'ajout de 2 nombre sur la classe calculator et je sauvegarde le résultat
        int somme = Calculator.add(a, b); //eclipse nous aide à créer la méthode

        // 1) ASSERT   Vérification   on va utiliser une méthode de Junit pour vérifier que le résultat que donne le Calculator
        //est bien la somme de 2 et 3 à savoir 5
        assertEquals(5, somme);  //expected, actual

        //Et donc grâce à cette méthode on vérifie que somme = 5  on compile CalculatorTest et ca va échouer car la méthode
        //n'est pas encore implémentée dans Calculator, on l'implémente et là ca marche
    }
}
