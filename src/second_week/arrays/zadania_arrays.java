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

        int rand_int1 = rand.nextInt(2) +1;

        String[] stringArrayy = {"Pablo", "Adonis", "Rocky"};
        System.out.print("Imię dla psa to: ");
        System.out.println(stringArrayy[rand_int1]);

        //ZADANIE 4

        Integer[] intArray_2 = {1, 2, 3};
        Integer[] intArray_3 = {1, 2, 3};
        Integer[] intArray_4 = {1, 2, 3};
        Random rand_1 = new Random();

        int rand_int2 = rand_1.nextInt(2) +1;
        int rand_int3 = rand_1.nextInt(2) +1;
        int rand_int4 = rand_1.nextInt(2) +1;

        String[] stringArray_0 = {"Jajecznica", "Omleta na słodko", "Naleśniki"};
        System.out.print("Na śniadanie zjem: ");
        System.out.print(stringArray_0[rand_int2]);
        String[] stringArrays_1 = {"Spaghetti", "Lasagne", "Zupę Pomidorową"};
        System.out.print(", na obiad: ");
        System.out.print(stringArrays_1[rand_int3]);
        String[] stringArrays_2 = {"Kanapki", "Zapiekankę", "Nic"};
        System.out.print(",a na kolację: ");
        System.out.println(stringArrays_2[rand_int4]);

        //ZADANIE 5

        Integer[] intArray_5 = {5, 12, 14, 10, 7, 6, 9, 11, 1, 3, 8, 2, 4, 20, 17, 16, 13, 15, 19, 18};

        Arrays.sort(intArray_5, 0, 10, Collections.reverseOrder());
        Arrays.sort(intArray_5, 9, 20);
        System.out.print("Tablica: "+ Arrays.toString(intArray_5));


    }
}
