
package mochila;

public class Mochila {

     // valores y pesos deben ser arreglos globales o pasados como parámetros
    static int[] valores;
    static int[] pesos;
    static int nObjetos;

    public static int mochila(int i, int pesoRestante) {

        // si i == número de objetos o pesoRestante == 0
        if (i == nObjetos || pesoRestante == 0) {
            return 0;
        }

        // si el peso del objeto i es mayor que pesoRestante
        if (pesos[i] > pesoRestante) {
            return mochila(i + 1, pesoRestante);
        }

        // incluir
        int incluir = valores[i] + mochila(i + 1, pesoRestante - pesos[i]);

        // excluir
        int excluir = mochila(i + 1, pesoRestante);

        // retornar el máximo de incluir y excluir
        return Math.max(incluir, excluir);
    }

   
    public static void main(String[] args) {

        valores = new int[]{60, 100, 120};
        pesos   = new int[]{10, 20, 30};
        nObjetos = valores.length;

        int capacidad = 50;

        int resultado = mochila(0, capacidad);

        System.out.println("Valor máximo = " + resultado);
    }
   
}
