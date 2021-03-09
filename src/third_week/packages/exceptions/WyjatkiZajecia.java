package third_week.packages.exceptions;

import java.util.Scanner;

public class WyjatkiZajecia {

    public static void isNotNegative(int a, int b) throws Exception {

        if (b < 0){
            throw new Exception();
        }
    }

    private static Object exception;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int i = 1;
        
        try{
        System.out.println("Podaj liczbe A: ");
        int A = scanner.nextInt();

        System.out.println("Podaj liczbe B: ");
        int B = scanner.nextInt();

        System.out.println("Liczba A: " + A + " Liczba B: " + B);

        isNotNegative(A, B);

        System.out.println(A/B);

    } catch(Exception exception) {
        System.out.println("Wyskoczył Błąd, Spróbuj Ponownie");
    }
    System.out.println("Koniec programu");

    }
}