import java.util.Scanner;

public class Separar_y_Contar_Nombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        String[] palabras = nombreCompleto.split(" ");

        for (String palabra : palabras) {
            int cantidadLetras = contarLetras(palabra);
            System.out.println(palabra + ": " + cantidadLetras + " letras");
        }
    }

    public static int contarLetras(String palabra) {
        int contador = 0;
        for (char c : palabra.toCharArray()) {
            if (Character.isLetter(c)) {
                contador++;
            }
        }
        return contador;
    }
}
