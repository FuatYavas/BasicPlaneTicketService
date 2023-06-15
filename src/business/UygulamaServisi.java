package business;
import entities.abstracts.Ucus;
import entities.concretes.PegasusUcus;
import entities.concretes.THYUcus;
public class UygulamaServisi {
    private final Ucus thyUcus;
    private final Ucus pegasusUcus;
    public UygulamaServisi() {
        thyUcus = new THYUcus();
        pegasusUcus = new PegasusUcus();
    }
    public void uygunKoltuklariGoster(String havayolu) {
        if (havayolu.equalsIgnoreCase("THY")) {
            thyUcus.uygunKoltuklariGoster();
        } else if (havayolu.equalsIgnoreCase("Pegasus")) {
            pegasusUcus.uygunKoltuklariGoster();
        } else {
            System.out.println("Geçersiz havayolu seçimi.");
        }
    }
    public void koltukRezervasyonuYap(String havayolu, String koltuk, boolean yurtdisiUcusu) {
        if (havayolu.equalsIgnoreCase("THY")) {
            thyUcus.koltukRezervasyonuYap(koltuk, yurtdisiUcusu);
        } else if (havayolu.equalsIgnoreCase("Pegasus")) {
            pegasusUcus.koltukRezervasyonuYap(koltuk, yurtdisiUcusu);
        } else {
            System.out.println("Geçersiz havayolu seçimi.");
        }
    }
}