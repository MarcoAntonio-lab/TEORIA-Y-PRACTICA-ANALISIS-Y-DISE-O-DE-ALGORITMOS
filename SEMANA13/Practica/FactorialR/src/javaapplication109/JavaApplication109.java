
package javaapplication109;


public class JavaApplication109 {

   
    public static int factorialk(int n) {
        if (n == 0 || n == 1) {
            return 1;  // Caso base
        } else {
            return n * factorialk(n - 1);  // Llamada recursiva
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = factorialk(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
    
}
