
package laberinto;


public class Laberinto {
    
    
    public static boolean resolverLaberinto(int[][] matriz, int x, int y, int salidaX, int salidaY) {

        // Si x e y son la posición de la salida
        if (x == salidaX && y == salidaY) {
            matriz[x][y] = 2; // marco la salida también
            return true;
        }

        // Si está fuera de límites o es un 1 (pared)
        if (x < 0 || y < 0 || x >= matriz.length || y >= matriz[0].length || matriz[x][y] != 0) {
            return false;
        }

        // Marcar como parte de la solución (2)
        matriz[x][y] = 2;

        // Abajo
        if (resolverLaberinto(matriz, x + 1, y, salidaX, salidaY)) {
            return true;
        }

        // Derecha
        if (resolverLaberinto(matriz, x, y + 1, salidaX, salidaY)) {
            return true;
        }

        // Arriba
        if (resolverLaberinto(matriz, x - 1, y, salidaX, salidaY)) {
            return true;
        }

        // Izquierda
        if (resolverLaberinto(matriz, x, y - 1, salidaX, salidaY)) {
            return true;
        }

        // Backtracking
        matriz[x][y] = 0;

        return false;
    }

    // ---------------- IMPRESIÓN DEL LABERINTO ----------------
    public static void imprimirLaberinto(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[][] matriz = {
            {0, 1, 0, 0},
            {0, 0, 0, 1},
            {1, 0, 1, 0},
            {0, 0, 0, 0}
        };

        int inicioX = 0, inicioY = 0;
        int salidaX = 3, salidaY = 3;

        System.out.println("Laberinto antes:");
        imprimirLaberinto(matriz);

        boolean exito = resolverLaberinto(matriz, inicioX, inicioY, salidaX, salidaY);

        System.out.println("Se encontro camino " + exito);
        System.out.println("Laberinto despues:");
        imprimirLaberinto(matriz);
    }
        
}
    

