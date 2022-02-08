public class Main {
    public static void main(String[] args) {
        Kniha k1 = new Kniha("J.K. Rowling", "Harry Potter", 354);
        Kniznica kn1 = new Kniznica();
        kn1.pridajKnihu(k1);
        kn1.vypisKnih();
    }
}
