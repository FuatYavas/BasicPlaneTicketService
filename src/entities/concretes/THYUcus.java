package entities.concretes;
import entities.abstracts.Ucus;
import java.util.Map;
public class THYUcus extends Ucus {
    public THYUcus() {
        super("THY");
        initializeKoltuklar();
    }
    private void initializeKoltuklar() {
        for (char satir = 'A'; satir <= 'F'; satir++) {
            for (int koltukNo = 1; koltukNo <= 6; koltukNo++) {
                String koltuk = "" + satir + koltukNo;
                koltuklar.put(koltuk, false);
            }
        }
    }
    @Override
    public void uygunKoltuklariGoster() {
        System.out.println(havayoluAdi + " için uygun koltuklar:");
        for (Map.Entry<String, Boolean> entry : koltuklar.entrySet()) {
            if (!entry.getValue()) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }
    @Override
    public int fiyatHesapla(String koltuk, boolean yurtdisiUcusu) {
        if (koltuk.charAt(0) <= 'C') {
            return 1200;
        } else {
            return 600;
        }
    }
    @Override
    public void koltukRezervasyonuYap(String koltuk, boolean yurtdisiUcusu) {
        if (koltuklar.containsKey(koltuk) && !koltuklar.get(koltuk)) {
            koltuklar.put(koltuk, true);
            int fiyat = fiyatHesapla(koltuk, yurtdisiUcusu);
            System.out.println(koltuk + " koltuğu " + fiyat + " TL karşılığında rezerve edildi.");
            System.out.println("Bu " + (yurtdisiUcusu ? "yurtdışı" : "yurtiçi") + " uçuşta yemek servisi yapılacaktır.");
        } else {
            System.out.println("Üzgünüz, o koltuk müsait değildir.");
        }
    }
}

