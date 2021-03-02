package first_week.statements;
import java.util.Scanner;

public class zadania {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        // ZADANIE 1

        System.out.println("Podaj liczbę: ");
        int liczba = skaner.nextInt();

        if (liczba > 0) {
            System.out.println("A jest większe od 0");
        }
        if (liczba < 0) {
            System.out.println("A jest mniejsze od 0");
        }
        if (liczba == 0) {
            System.out.println("A jest równe 0");
        }

        // ZADANIE 2

        System.out.println("Podaj liczbę numer 1: ");
        int liczba1 = skaner.nextInt();

        System.out.println("Podaj liczbę numer 2: ");
        int liczba2 = skaner.nextInt();

        System.out.println("Podaj liczbę numer 3: ");
        int liczba3 = skaner.nextInt();

        if (liczba1 > liczba2) {
            if (liczba2 > liczba3) {
            }
            System.out.println("Największa liczba to: " + liczba1);
        }
        if (liczba1 < liczba2) {
            if (liczba2 > liczba3) {
            }
            System.out.println("Największa liczba to:  " + liczba2);
        }
        if (liczba1 < liczba2) {
            if (liczba2 < liczba3) {
            }
            System.out.println("Największa liczba to: " + liczba3);
        }

        // ZADANIE 3 nie do końca wiedziałem jak to wykonać ale chociaż się wyświetla że login to admin a hasło to tajnehasło

        String login = "admin";
        String haslo = "tajnehaslo";

        if (login.equals(login)) {
            System.out.println("Login: " + login);
        } else {
            System.out.println("Login niepoprawny");
        }
        if (haslo.equals(haslo)) {
            System.out.println("Haslo: " + haslo);
        } else {
            System.out.println("Haslo niepoprawne");
        }

        // ZADANIE 5


        System.out.println("Podaj pierwszą liczbę: ");
        int liczba_1 = skaner.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        int liczba_2 = skaner.nextInt();

        char znak;

        System.out.println("Dodawanie dwóch liczb - wciśnij +");
        System.out.println("Odejmowanie dwóch liczb - wciśnij -");
        System.out.println("Mnożenie dwóch liczb - wciśnij *");
        System.out.println("Dzielenie dwóch liczb - wciśnij /");

        znak = skaner.next().charAt(0);
        switch (znak) {
            case '+': {
                System.out.println(liczba_1 + liczba_2);
                break;
            }
            case '-': {
                System.out.println(liczba_1 - liczba_2);
                break;
            }
            case '*': {
                System.out.println(liczba_1 * liczba_2);
                break;
            }
            case '/': {
                System.out.println(liczba_1 / liczba_2);
                break;
            }

        }
    }
}




