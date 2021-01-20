    
import java.util.Arrays;
public class OddsAndEvens 
{public  static void  arrange(int[] arr){
    int[] arr2 = new int[arr.length];
    int j = 0;
    int length = arr.length;
         for(int i = 0; i < arr.length; i++){
           
            if (arr[i]%2 == 0)
             arr2[j++] = arr[i];
             else
             arr2[--length] = arr[i];
    }
    
    
    System.out.println(Arrays.toString(arr2));}

   public static void main(String [] args){
       int[] str = {21,2,213,43,4,56,15,82,32,9,22,0};
       
       System.out.println(Arrays.toString(str));
       
       arrange(str);
    }}
