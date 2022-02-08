import java.util.ArrayList;
import java.util.List;

public class Kniznica {
    private List<Kniha> zoznamKnih = new ArrayList<>();

    void pridajKnihu(Kniha k) {
        zoznamKnih.add(k);
    }
    void vypisKnih() {
        for (Kniha kniha : zoznamKnih) {
            kniha.opis();
        }
    }
}
