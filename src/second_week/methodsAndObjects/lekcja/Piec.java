package second_week.methodsAndObjects.lekcja;

interface Piecyk{
    void termoobieg();
    void pieczeniechleba();
    void suszeniegrzybow();
}

public class Piec implements Piecyk {
    private int czas;
    private int temperatura;

    @Override
    public void termoobieg() {
        czas = 60;
        temperatura = 240;
        wlacz();
    }
    @Override
    public void pieczeniechleba() {
        czas = 90;
        temperatura = 300;
        wlacz();
    }
    @Override
    public void suszeniegrzybow() {
        czas = 240;
        temperatura = 140;
        wlacz();
    }

    private void wlacz() {
        System.out.println("Włączmy Piekarnik " +
                "ustawiamy czas na: " + czas + " minut, temperature na: "
                + temperatura + " stopni celsjusza");
    }

    public static void main(String[] args) {
        Piec Piecyk = new Piecyk();

        Piecyk piekarnik = piekarnik;

        piekarnik.pieczeniechleba();
        piekarnik.termoobieg();
        piekarnik.suszeniegrzybow();
    }
}
