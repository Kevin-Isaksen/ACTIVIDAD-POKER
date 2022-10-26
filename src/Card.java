public class Card {

    private final String palo;
    private final String color;
    private final String valor;
    public static final String [] PALO = {"corazones", "diamantes", "trébol", "picas"};
    public static final String [] COLOR = {"rojo", "negro"};
    public static final String [] VALOR = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    public String toString() {
        return "Palo = " + palo + ", " + "Color = " + color +
                ", " + "Valor = " + valor;
    }
}