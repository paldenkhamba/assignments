
import java.util.Arrays;
import java.util.Random;
public class Shuffle
{public  static void  shuffle(int[] arr){
        int temp = 0,index = 0;
         Random rand = new Random();
         for(int i = 0; i <arr.length ; i++){
             index = rand.nextInt(arr.length);
             temp = arr[index];
             arr[index] = arr[i];
             arr[i] = temp; 
            }
           System.out.println("shuffled array  : " +Arrays.toString(arr));
      
    }


   public static void main(String [] args){
       int[] arr = {43,4,56,15,82};
       
       System.out.println("array  : " +Arrays.toString(arr));
      
       shuffle(arr);
    }}
