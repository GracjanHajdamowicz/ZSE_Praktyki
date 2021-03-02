package second_week.arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class zadania_arrays {

    public static void main(String[] args) {

        //ZADANIE 1

        char[] charArray = {'b', 'c', 'd', 'a', 'e', 'g', 'f', 'i', 'j', 'k', 'm', 'n', 'h', 'l'};
        Arrays.sort(charArray);
        System.out.println("Sortowanie w porządku rosnącym: " + Arrays.toString(charArray));

        //ZADANIE 2

        String[] stringArray = {"Na", "wyścigach", "wyścigowych", "wyścigówka", "wyścigowa", "wyścignęła", "wyścigówkę", "wyścigową", "koloru", "czerwonego"};
        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println("Sortowanie w porządku malejącym: " + Arrays.toString(stringArray));

        //ZADANIE 3

        String[] stringsArray = {1, 2, 3};
        Random rand = new Random();

        int rand_string = rand.toString("Pimpek", "Adonis", "Pablo");

        System.out.println("Imię: " +rand_string);


    }
}
