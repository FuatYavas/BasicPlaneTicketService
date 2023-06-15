package entities.abstracts;
import java.util.HashMap;
import java.util.Map;
public abstract class Ucus {
    protected String havayoluAdi;
    protected Map<String, Boolean> koltuklar;
    public Ucus(String havayoluAdi) {
        this.havayoluAdi = havayoluAdi;
        this.koltuklar = new HashMap<>();
    }
    public abstract void uygunKoltuklariGoster();
    public abstract int fiyatHesapla(String koltuk, boolean yurtdisiUcusu);
    public abstract void koltukRezervasyonuYap(String koltuk, boolean yurtdisiUcusu);
}