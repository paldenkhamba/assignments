
/*
 * leaders : numbers greater than all the numbers to their right.
 * from the right, numbers are compared to a max value(initially 0 ,
 * if all elements are greater than 0),
 * which changes as it 
 * continues to find numbers greater than itself(leaders) 
 * and becomes the greater number found.
 */import java.util.Scanner; 
import java.util.Arrays;
public class Leader
{public  static void  lead(int[] arr){
         System.out.println("leaders :");
         int max = 0;
         for(int i = arr.length-1; i >= 0 ; i--){
            
            if (arr[i] > max){
        System.out.println(arr[i]);
        max = arr[i]; }}
    }


   public static void main(String [] args){
       Scanner in = new Scanner (System.in);
       System.out.println("enter array size :");
       int size = in.nextInt();
       int[] str = new int[size];
       for(int i = 0; i< str.length ; i++){
       str[i] = in.nextInt();
        }
      
       System.out.println("array  : " +Arrays.toString(str));
      
       lead(str);
    }}
