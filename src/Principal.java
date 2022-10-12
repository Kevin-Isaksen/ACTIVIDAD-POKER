import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Deck baraja = new Deck();
        showMenu(baraja);

    }

    public static void showMenu (Deck baraja){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Bienvenido a Poker!");
        System.out.println("Selecciona una opción:");
        System.out.println("1 Mezclar deck");
        System.out.println("2 Sacar una carta");
        System.out.println("3 Carta al azar");
        System.out.println("4 Generar una mano de 5 cartas");
        System.out.println("0 Salir");
        System.out.println();
        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();
        while (opcion != 0) {
            if (opcion < 0 || opcion > 4) {
                while (opcion < 0 || opcion > 4) {
                    System.out.println();
                    System.out.println("Opción invalida");
                    System.out.print("Ingresa una opción valida: ");
                    opcion = entrada.nextInt();
                }
            }
            if (opcion == 1) {
                baraja.shuffle();
            } else if (opcion == 2) {
                baraja.head();
            } else if (opcion == 3) {
                baraja.pick();
            } else if (opcion == 4) {
                baraja.hand();
            }
            System.out.print("Elije otra opción o digite 0 para salir: ");
            opcion = entrada.nextInt();
        }
    }
}
