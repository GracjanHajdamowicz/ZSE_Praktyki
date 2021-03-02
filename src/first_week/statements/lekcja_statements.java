//package first_week.statements;
//
//import java.util.Scanner;
//
//public class lekcja_statements {
//
//    public static void main(String[] args) {
//
//        Scanner skaner = new Scanner(System.in);
//
//        boolean stan = false;
//
//        if (stan) {
//            System.out.println("Wykonywała się instrukcja IF.");
//        } else {
//            System.out.println("Wykonywałą się instrukcja ELSE.");
//        }
//
//
//        Scanner skaner = new Scanner(System.in);
//        System.out.println("Podaj swój wiek: ");
//        int wiek = skaner.nextInt();
//
//        if (wiek >= 18) {
//            System.out.println("Jesteś pełnoletni!");
//        } else {
//            System.out.println(("Jesteś niepełnoletni!"));
//        }
//
//        System.out.println("Podaj liczbę: ");
//        int liczba = skaner.nextInt();
//
//        if(10 < liczba && liczba <20){
//            System.out.println("Liczba mieści się w zakresie.");
//        }
//        else{
//            System.out.println("Liczba nie mieści się w zakresie.");
//        }
//
//        System.out.println("Podaj liczbę całkowitą A: ");
//        int a = skaner.nextInt();
//
//        System.out.println("Podaj liczbę całkowitą B: ");
//        int b = skaner.nextInt();
//
//        if(a > b){
//            System.out.println("A jest większe od B.");
//        }
//        if(a < b){
//            System.out.println("B jest większe od A.");
//        }
//        if(a == b){
//            System.out.println("A jest równe B.");
//        }
//
//        if(a > b){
//            System.out.println("A jest większe od B.");
//            else{
//                if(a < b){
//                    System.out.println("B jest większe od A.");
//            }
//                else{
//                    System.out.println("A jest równe B.");
//                }
//
//                char charA = 'A';
//                char charB = 'B';
//
//                if(charA > charB){
//                    System.out.println("charA ma większą wartość od charB  w tabelii ASCII.");
//                }
//                else{
//                        System.out.println("charA ma mniejsza wartość od charB w tabelii ASCII.");
//                    }
//
//                String hello = "hello";
//                String world = "world";
//
//                if(hello.equals(world)){
//                    System.out.println("hello jest równe world");
//                }
//                else{
//                    System.out.println("hello nie jest równe world");
//                }
//
//        System.out.println("Podaj swój wybór (1, 2): ");
//        int x = skaner.nextInt();
//
//        switch (x){
//            case 1:
//                System.out.println("Przypadek pierwszy.");
//                break;
//            case 2:
//                System.out.println("Przypadek drugi.");
//                break;
//            default:
//                System.out.println("Nie wybrano poprawnej opcji.");
//                break;
//        }
//
//        System.out.println("Podaj swój wybór (1, 2, A, B): ");
//        String y = skaner.next();
//
//        switch (y){
//            case "1":
//                System.out.println("Przypadek pierwszy.");
//                break;
//            case "2":
//                System.out.println("Przypadek drugi.");
//                break;
//            case "A":
//                System.out.println("Przypadek A.");
//                break;
//            case "B":
//                System.out.println("Przypadek B.");
//                break;
//            default:
//                System.out.println("Nie wybrano poprawnej opcji.");
//                break;
//        }
//
//        System.out.println("Podaj swój wybór (1, 2, A, B): ");
//        char z = skaner.next().charAt(0);
//
//        switch (z){
//            case '1':
//                System.out.println("Przypadek pierwszy.");
//                break;
//            case '2':
//                System.out.println("Przypadek drugi.");
//                break;
//            case 'A':
//                System.out.println("Przypadek A.");
//                break;
//            case 'B':
//                System.out.println("Przypadek B.");
//                break;
//            default:
//                System.out.println("Nie wybrano poprawnej opcji.");
//                break;
//        }
//    }
//}