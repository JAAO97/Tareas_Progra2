import java.util.Random;

public class Dados_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int jugador1 = 0;
        int jugador2 = 0;

        System.out.println("Lanzando dados\n");

        for (int i = 1; i <= 4; i++) {
            int dado = random.nextInt(6) + 1;

            if (i <= 2) {
                jugador1 += dado;
                System.out.println("Jugador 1 - Lanzamiento " + i + ": " + dado);
            } else {
                jugador2 += dado;
                System.out.println("Jugador 2 - Lanzamiento " + (i - 2) + ": " + dado); //i -2 para que no diga lanzamiento 3 y 4
            }
        }

        System.out.println("\nResultado final:");
        System.out.println("Jugador 1: " + jugador1);
        System.out.println("Jugador 2: " + jugador2);

        if (jugador1 > jugador2) {
            System.out.println("¡Jugador 1 gana!");
        } else if (jugador2 > jugador1) {
            System.out.println("¡Jugador 2 gana!");
        } else {
            System.out.println("¡Empate!");
        }
    }
}