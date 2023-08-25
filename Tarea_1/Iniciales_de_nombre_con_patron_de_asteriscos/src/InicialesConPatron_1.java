import java.util.Scanner;

public class InicialesConPatron_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las letras en mayúscula:");
        String letras = scanner.next();

        for (int i = 0; i < 7; i++) {
            for (char letra : letras.toCharArray()) {
                String dibujo = dibujarLetra(letra, i);
                if (dibujo != null) {
                    System.out.print(dibujo);
                } else {
                    System.out.print("???");
                }
                System.out.print("     ");  // Espacio entre letras
            }
            System.out.println();
        }
    }

    public static String dibujarLetra(char letra, int fila) {
        switch (letra) {
            case 'A':
                return dibujarLetraA(fila);
            case 'B':
                return dibujarLetraB(fila);
            case 'C':
                return dibujarLetraC(fila);
            case 'D':
                return dibujarLetraD(fila);
            case 'E':
                return dibujarLetraE(fila);
            case 'F':
                return dibujarLetraF(fila);
            case 'G':
                return dibujarLetraG(fila);
            case 'H':
                return dibujarLetraH(fila);
            case 'I':
                return dibujarLetraI(fila);
            case 'J':
                return dibujarLetraJ(fila);
            case 'K':
                return dibujarLetraK(fila);
            case 'L':
                return dibujarLetraL(fila);
            case 'M':
                return dibujarLetraM(fila);
            case 'N':
                return dibujarLetraN(fila);
            case 'O':
                return dibujarLetraO(fila);
            case 'P':
                return dibujarLetraP(fila);
            case 'Q':
                return dibujarLetraQ(fila);
            case 'R':
                return dibujarLetraR(fila);
            case 'S':
                return dibujarLetraS(fila);
            case 'T':
                return dibujarLetraT(fila);
            case 'U':
                return dibujarLetraU(fila);
            case 'V':
                return dibujarLetraV(fila);
            case 'W':
                return dibujarLetraW(fila);
            case 'X':
                return dibujarLetraX(fila);
            case 'Y':
                return dibujarLetraY(fila);
            case 'Z':
                return dibujarLetraZ(fila);

            default:
                return null;
        }
    }

    public static String dibujarLetraA(int fila) {
        String[] dibujo = {
                "    **    ",
                "   ****   ",
                "  **  **  ",
                " ******** ",
                " **    ** ",
                " **    ** ",
                " **    ** "
        };
        return dibujo[fila];
    }

    public static String dibujarLetraB(int fila) {
        String[] dibujo = {
                "*******  ",
                "**     **",
                "**     **",
                "*******  ",
                "**     **",
                "**     **",
                "*******  "
        };
        return dibujo[fila];
    }

    public static String dibujarLetraC(int fila) {
        String[] dibujo = {
                "  *****  ",
                " **   ** ",
                "**       ",
                "**       ",
                "**       ",
                " **   ** ",
                "  *****  "
        };
        return dibujo[fila];
    }

    public static String dibujarLetraD(int fila) {
        String[] dibujo = {
                "******   ",
                "**    ** ",
                "**     **",
                "**     **",
                "**     **",
                "**    ** ",
                "******   "
        };
        return dibujo[fila];
    }

    public static String dibujarLetraE(int fila) {
        String[] dibujo = {
                "*******  ",
                "**       ",
                "**       ",
                "*******  ",
                "**       ",
                "**       ",
                "*******  "
        };
        return dibujo[fila];
    }

    public static String dibujarLetraF(int fila) {
        String[] dibujo = {
                "*******  ",
                "**       ",
                "**       ",
                "*******  ",
                "**       ",
                "**       ",
                "**       "
        };
        return dibujo[fila];
    }

    public static String dibujarLetraG(int fila) {
        String[] dibujo = {
                " ******  ",
                "**    ** ",
                "**       ",
                "**  **** ",
                "**     **",
                "**     **",
                " ****** *"
        };
        return dibujo[fila];
    }

    public static String dibujarLetraH(int fila) {
        String[] dibujo = {
                "**    **",
                "**    **",
                "**    **",
                "********",
                "**    **",
                "**    **",
                "**    **"
        };
        return dibujo[fila];
    }

    public static String dibujarLetraI(int fila) {
        String[] dibujo = {
                "*******",
                "   **  ",
                "   **  ",
                "   **  ",
                "   **  ",
                "   **  ",
                "*******"
        };
        return dibujo[fila];
    }

    public static String dibujarLetraJ(int fila) {
        String[] dibujo = {
                " ******",
                "     **",
                "     **",
                "     **",
                "**   **",
                "**   **",
                " ****  "
        };
        return dibujo[fila];
    }

    public static String dibujarLetraK(int fila) {
        String[] dibujo = {
                "**    **",
                "**   ** ",
                "**  **  ",
                "****    ",
                "**  **  ",
                "**   ** ",
                "**    **"
        };
        return dibujo[fila];
    }

    public static String dibujarLetraL(int fila) {
        String[] dibujo = {
                "**      ",
                "**      ",
                "**      ",
                "**      ",
                "**      ",
                "**      ",
                "******* "
        };
        return dibujo[fila];
    }

    public static String dibujarLetraM(int fila) {
        String[] dibujo = {
                "**      **",
                "***    ***",
                "****  ****",
                "**  **  **",
                "**      **",
                "**      **",
                "**      **"
        };
        return dibujo[fila];
    }

    public static String dibujarLetraN(int fila) {
        String[] dibujo = {
                "**    **",
                "***   **",
                "****  **",
                "** ** **",
                "**  ****",
                "**   ***",
                "**    **"
        };
        return dibujo[fila];
    }

    public static String dibujarLetraO(int fila) {
        String[] dibujo = {
                "  ****  ",
                " **  ** ",
                "**    **",
                "**    **",
                "**    **",
                " **  ** ",
                "  ****  "
        };
        return dibujo[fila];
    }

    public static String dibujarLetraP(int fila) {
        String[] dibujo = {
                "******* ",
                "**    **",
                "**    **",
                "******* ",
                "**      ",
                "**      ",
                "**      "
        };
        return dibujo[fila];
    }

    public static String dibujarLetraQ(int fila) {
        String[] dibujo = {
                "  ****  ",
                " **  ** ",
                "**    **",
                "**    **",
                "**  ** *",
                " **  ** ",
                "  **** *"
        };
        return dibujo[fila];
    }

    public static String dibujarLetraR(int fila) {
        String[] dibujo = {
                "*******  ",
                "**    ** ",
                "**    ** ",
                "*******  ",
                "**   **  ",
                "**    ** ",
                "**     **"
        };
        return dibujo[fila];
    }

    public static String dibujarLetraS(int fila) {
        String[] dibujo = {
                " ******  ",
                "**     **",
                "**       ",
                " ******  ",
                "      ** ",
                "**     **",
                " ******  "
        };
        return dibujo[fila];
    }

    public static String dibujarLetraT(int fila) {
        String[] dibujo = {
                "*******",
                "   **  ",
                "   **  ",
                "   **  ",
                "   **  ",
                "   **  ",
                "   **  "
        };
        return dibujo[fila];
    }

    public static String dibujarLetraU(int fila) {
        String[] dibujo = {
                "**    **",
                "**    **",
                "**    **",
                "**    **",
                "**    **",
                "**    **",
                " ****** "
        };
        return dibujo[fila];
    }

    public static String dibujarLetraV(int fila) {
        String[] dibujo = {
                "**    **",
                "**    **",
                " **  ** ",
                " **  ** ",
                "  ****  ",
                "  ****  ",
                "   **   "
        };
        return dibujo[fila];
    }

    public static String dibujarLetraW(int fila) {
        String[] dibujo = {
                "**    **",
                "**    **",
                "**    **",
                "** ** **",
                "**** ****",
                "***  ***",
                "**    **"
        };
        return dibujo[fila];
    }

    public static String dibujarLetraX(int fila) {
        String[] dibujo = {
                "**    **",
                " **  ** ",
                "  ****  ",
                "  ****  ",
                " **  ** ",
                "**    **"
        };
        return dibujo[fila];
    }

    public static String dibujarLetraY(int fila) {
        String[] dibujo = {
                "**    **",
                " **  ** ",
                "  ****  ",
                "   **   ",
                "   **   ",
                "   **   ",
                "   **   "
        };
        return dibujo[fila];
    }

    public static String dibujarLetraZ(int fila) {
        String[] dibujo = {
                "*******",
                "     **",
                "    ** ",
                "   **  ",
                "  **   ",
                " **    ",
                "*******"
        };
        return dibujo[fila];
    }

    //Estuve probando varias opciones y la verdad que ninguna me sirvió con ciclos. Por eso mejor funciones con el patron de cada letra.

}
