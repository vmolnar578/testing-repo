public class Kniha {
    private String autor;
    private String nazov;
    private int pocetStran;

    public Kniha(String autor, String nazov, int pocetStran) {
        this.autor = autor;
        this.nazov = nazov;
        this.pocetStran = pocetStran;
    }
    public void opis() {
        System.out.println(autor);
        System.out.println(nazov);
        System.out.println(pocetStran);
    }
}
