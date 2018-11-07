
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
  
    }
    public static int smallest(int[] array){
        int smallest=array[0];
        for(int i=0;i<array.length;i++){
            if(smallest>array[i])
                smallest=array[i];
        }
        
        return smallest;
    }
    public static int indexOfTheSmallest(int[]array){
       
        int index=0;
        int smallest=array[0];
        for(int i=0;i<array.length;i++){
            if(smallest>array[i]){
                smallest=array[i];
                index=i;
            }
        }
        return index;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
         int idx=index;
            int smallest=array[index];
        for(int i=index;i<array.length;i++){
            
            if(smallest>array[i]){
                smallest=array[i];
                idx=i;
            }
        }
        return idx;
    }
    public static void swap(int[] array, int index1, int index2) {
        int temp;
        temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    // code goes here
    }
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        int index=0;
        for(int i=0;i<array.length;i++){
            index=indexOfTheSmallestStartingFrom(array,i);
            swap(array,i,index);
            System.out.println(Arrays.toString(array));
            
        }
        
        
}
  

}
