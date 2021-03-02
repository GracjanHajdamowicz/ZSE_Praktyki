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

        Integer[] intArray_1 = {1, 2, 3};
        Random rand = new Random();

        int rand_int1 = rand.nextInt(3) +1;

        String[] stringArrays = {"Pablo", "Adonis", "Rocky"};
        System.out.print("Imię dla psa to: ");
        System.out.println(stringArrays[rand_int1]);

        //ZADANIE 4

        

        //ZADANIE 5

        Integer[] intArray_2 = {5, 12, 14, 10, 7, 6, 9, 11, 1, 3, 8, 2, 4, 20, 17, 16, 13, 15, 19, 18};

        Arrays.sort(intArray_2, 0, 10, Collections.reverseOrder());
        Arrays.sort(intArray_2, 9, 20);
        System.out.print("Tablica: "+ Arrays.toString(intArray_2));


    }
}
