import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    String[] palo = Card.PALO;
    String[] color = Card.COLOR;
    String[] valor = Card.VALOR;

    private final ArrayList<Card> cartas;

    public Deck() {
        cartas = new ArrayList<>();

        for (int i = 0; i < 2; i++)
            for (String s : valor) cartas.add(new Card(palo[i], color[0], s));

        for (int i = 2; i < 4; i++)
            for (String s : valor) cartas.add(new Card(palo[i], color[1], s));
    }

    public void shuffle () {
        Collections.shuffle(cartas);
        System.out.println("Se mezcló el Deck.");
        System.out.println();
    }
    public void head(){
        System.out.println(cartas.get(0));
        cartas.remove(0);
        System.out.println("Quedan " + cartas.size() + " cartas en el Deck");
        System.out.println();
    }
    public void pick() {
        Random random = new Random();
        System.out.println(cartas.get(random.nextInt(cartas.size())));
        cartas.remove(random.nextInt(cartas.size()));
        System.out.println("Quedan " + cartas.size() + " cartas en el Deck");
        System.out.println();
    }
    public void hand() {
        Collections.shuffle(cartas);
        for(int i = 0; i <= 4; i++){
            System.out.println(cartas.get(i));
        }
        for(int i = 0; i <= 4; i++){
            cartas.remove(i);
        }
        System.out.println("Quedan " + cartas.size()+ " cartas en el Deck");
        System.out.println();
    }
}
