package second_week.multiArrays.lekcja.zadania;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class multiArrays {

    public static void main(String[] args) {

        //ZADANIE 1

        int[][] array_1 = new int[5][5];
        int value_1 = 5;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                array_1[i][j] = value_1;
                value_1 = value_1 + 5;
                System.out.print(array_1[i][j] + "\t");
            }
            System.out.println();

        }

        //ZADANIE 2

        System.out.println();
        int[][][][] array_2 = new int[3][3][3][3];
        int value_2 = 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int n = 0; n < 3; n++) {
                    for (int m = 0; m < 3; m++) {
                        array_2[i][j][n][m] = value_2;
                        value_2 = value_2 + 5;
                        System.out.print(+ array_2[i][j][n][m] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }

        //ZADANIE 6

        //TWORZENIE LISTY
        ArrayList<String> lista_gier = new ArrayList<>();

        //DODAWANIE NOWEGO OBIEKTU
        lista_gier.add("Witcher 3");
        lista_gier.add("Cyberpunk 2077");
        lista_gier.add("Assasin's Creed Valhalla");
        lista_gier.add("Red Dead Redemption 2");
        System.out.println(lista_gier);

        //DODANIE NOWEGO OBIEKTU DO LISTY NA PODANY INDEKS
        lista_gier.add(1, "The Last Of Us 2");
        System.out.println(lista_gier);

        //USUWANIE OBIEKTU Z LISTY
        lista_gier.remove("Cyberpunk 2077");
        lista_gier.remove(0);
        System.out.println(lista_gier);

        //NADPISYWANIE OBIEKTÓW W LISCIE
        lista_gier.set(0, "Grand Theft Auto V");
        System.out.println(lista_gier);

        //SORTOWANIE LISTY
        Collections.sort(lista_gier);
        System.out.println(lista_gier);

        //CZYSZCENIE LISTY
        lista_gier.clear();
        System.out.println(lista_gier);


    }
}