
package busquedabinaria;


public class BusquedaBinaria {
    
    private static int binarySearch(int[] numbers, int numberToFind){
        int low = 0; 
        int high = numbers.length - 1; 
        
        while(low <= high){
            int middlePosition = (low + high) / 2; 
            int middleNumber =  numbers[middlePosition];
            
            if(numberToFind == middlePosition){
                return middlePosition;
            }
            if(numberToFind < middleNumber){
                high = middlePosition - 1; 
            } else {
                low = middlePosition + 1; 
            }    
        }
        return - 1;
    }
    
    public static void main(String[] args) {
        
        int [] ints = {1, 2, 3, 4, 5, 6, 7, 9, 11, 15, 16}; 
        System.out.println(binarySearch(ints, 8));
       
    }
    
}
