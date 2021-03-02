package zadania;

public class zadania_petle {

    public static void main(String[] args) {

        //ZADANIE 1

        for(int k=0;k<=20;k+=2){

            System.out.println("rosnace liczby "+k);
        }
        //ZADANIE 2

        for(int i=30;i>=0;i-=3){
            System.out.println("malejace liczby"+i);
        }
        //ZADANIE 3

        for (int h = 1; h <= 10; h++) {
            for (int g = 1; g <= 10; g++) {
                if(h*g%2==1){
                    System.out.println("\t");
                }
                else{
                    System.out.println(h + " * " + g + " = " + h * g);
                }
            }
        }
        //ZADANIE 4

        for (int j = -40; j <= 40; j++) {
            if (j % 4 == 0) {
                System.out.println("liczba podzielna przez 4 to: " + j);
            } else{
                System.out.println("\t");
            }
        }
        //ZADANIE 5

        int x=0;
        while(x<=20){
            System.out.println(x);
            x+=2;
        }
        int z=30;

        do{
            System.out.println(z);
            z-=3;
        } while(z>=0);
    }

    }

