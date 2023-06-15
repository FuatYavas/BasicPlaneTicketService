import business.UygulamaServisi;

public class Main {
    public static void main(String[] args) {
        UygulamaServisi uygulama = new UygulamaServisi();

        System.out.println("THY uçuşları:");
        uygulama.uygunKoltuklariGoster("THY");
        System.out.println();

        System.out.println("Pegasus uçuşları:");
        uygulama.uygunKoltuklariGoster("Pegasus");
        System.out.println();

        uygulama.koltukRezervasyonuYap("THY", "A2", true);
        System.out.println();

        uygulama.koltukRezervasyonuYap("Pegasus", "A1", true);
        System.out.println();

        System.out.println("THY uçuşlarındaki güncel koltuk durumu:");
        uygulama.uygunKoltuklariGoster("THY");
        System.out.println();

        System.out.println("Pegasus uçuşlarındaki güncel koltuk durumu:");
        uygulama.uygunKoltuklariGoster("Pegasus");
    }
}
