import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws Exception {

        Deck baraja = new Deck();
        showMenu(baraja);

    }

    public static void showMenu (Deck baraja) throws Exception {
        Scanner sn = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        while (!salir){
            System.out.println("Bienvenido a Poker!");
            System.out.println("Selecciona una opción:");
            System.out.println("1 Mezclar deck");
            System.out.println("2 Sacar una carta");
            System.out.println("3 Carta al azar");
            System.out.println("4 Generar una mano de 5 cartas");
            System.out.println("0 Salir");
            System.out.println();
            try{
                System.out.print("Elija una opción: ");
                opcion = sn.nextInt();
                    if (opcion == 1) {
                        baraja.shuffle();
                    } else if (opcion == 2) {
                        baraja.head();
                    } else if (opcion == 3) {
                        baraja.pick();
                    } else if (opcion == 4) {
                        baraja.hand();
                    } else if (opcion == 0) {
                        salir = true;
                    } else {
                        throw new IllegalArgumentException("Opción no valida");
                    }
            } catch(InputMismatchException e){
                System.out.println("Debes de teclear un número");
                sn.next();
                System.out.println();
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                System.out.println();
            } catch(Exception e){
                System.out.println(e.getMessage());
                salir = true;
            }
        }
    }
}