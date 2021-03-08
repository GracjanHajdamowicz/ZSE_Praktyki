package third_week.packages;

public class dziedziczenieExample {

    public static class Vehicle {
        protected final int tankCapacity = 60;
        protected int fuelLevel = 40;

        public void fillTank() {
            int toFill = tankCapacity - fuelLevel;
            fillTank(toFill);
        }

        public void fillTank(int toFill){
            if (toFill + fuelLevel > tankCapacity){
                System.out.println("Nie moge wypelnic baku " + toFill + " litrami");
            }
            else{
                fuelLevel += toFill;
                System.out.println("Mozna jeszcze wlac " + toFill + " litrow");
            }
        }
    }


    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println("Poziom Paliwa: " + vehicle.fuelLevel + " litrow");
        vehicle.fillTank();
        vehicle.fillTank(10);

    }
}
