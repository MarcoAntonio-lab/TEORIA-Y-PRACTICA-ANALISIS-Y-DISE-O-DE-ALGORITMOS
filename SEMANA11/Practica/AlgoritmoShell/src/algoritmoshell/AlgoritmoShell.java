
package algoritmoshell;

;
public class AlgoritmoShell {

    
    public static void main(String[] args) {
      int n = 5;
      int[] arr = {33, 45, 62, 12, 98}; //inicializa el arreglo
      System.out.print("Arreglo antes del ordenamiento: ");
      for(int i = 0; i<n; i++)
         System.out.print(arr[i] + " ");
      System.out.println();
      int gap;
      for(gap = n/2; gap > 0; gap = gap / 2) { //inicializa el espacio = n/2, disminuyendo por espacio /2
         for(int j = gap; j<n; j++) {
            for(int k = j-gap; k>=0; k -= gap) {
               if(arr[k+gap] >= arr[k])
                  break;
               else {
                  int temp;
                  temp = arr[k+gap];
                  arr[k+gap] = arr[k];
                  arr[k] = temp;
               }
            }
         }
      }
      System.out.print("Arreglo despues del ordenamiento: ");
      for(int i = 0; i<n; i++)
         System.out.print(arr[i] + " ");
      System.out.println();
    }
    
}
