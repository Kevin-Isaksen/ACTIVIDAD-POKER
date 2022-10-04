public class Principal {

    public static void main(String[] args) {

        Deck baraja = new Deck();

        baraja.shuffle();
        baraja.head();
        baraja.pick();
        baraja.hand();
    }
}
