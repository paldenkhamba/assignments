    
import java.util.Arrays;
public class TwoArray 
{public  static void  arrange(int[] arr, int[] arr2){
    int[] arr3 = new int[arr.length+arr2.length];
    int j = 0,k = 0, m = 0;
    int length = arr.length;
         for(int i = 0; i < arr3.length; i++){
           
            if (i >= arr.length)
             arr3[i] = arr2[j++];
             else
             arr3[i] = arr[k++];
    }
    Arrays.sort(arr3);
    for(int i = 0; i < arr3.length; i++){
       
        if(i >= arr.length)
        arr2[m++] = arr3[i];
        else arr[i] = arr3[i];
    }
    
    System.out.println("Array 1 : "+Arrays.toString(arr));
    System.out.println("Array 2 : "+Arrays.toString(arr2));}

   public static void main(String [] args){
       int[] arr = {32,9,22,0};
       int[] arr2 = {43,4,56,15,82};
       
       System.out.println("Array 1 : "+Arrays.toString(arr));
       System.out.println("Array 2 : "+Arrays.toString(arr2));
       
       arrange(arr, arr2);
    }}
