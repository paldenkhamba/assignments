    
import java.util.Arrays;
public class MaxDiff 
{public  static void  maxdiff(int[] arr){
    
    int diff = 0;
         for(int i = 0; i < arr.length; i++){
             for(int j = 0; j < arr.length; j++){
              
            if (arr[i]-arr[j]>diff){
            diff = arr[i]-arr[j];}
            
        } }
    System.out.println("Difference : "+diff);}

   public static void main(String [] args){
       int[] arr = {32,9,22,8,56};
       
       System.out.println("Array  : "+Arrays.toString(arr));
       
       maxdiff(arr);
    }}
