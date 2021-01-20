/*
 * array should be kept in sorted order. (Arrays.sort(arr))
 * the element is compared with next and if matched isnot included
 * in the array. in this way the last element wont be added as any number
 * next to the number matches it. hence it is added separately.
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Duplicate
{  public static int check(int [] arr){
      int [] temp = new int [arr.length];
     int j = 0;
      for(int i = 0; i < arr.length-1; i++){
             if(arr[i] !=  arr[i+1] ){
                 temp[j++] = arr [i];}
                }
                temp[j++]=arr[arr.length-1];
                for(int i = 0; i < arr.length; i++){
                    arr[i] = temp [i];}
                    return j;
    }
       
   public static void main(String [] args){
      
       int [] arr ={20, 20, 30,20, 40, 50, 50, 50};
        System.out.println(Arrays.toString(arr));
       int length = check(arr);
       for(int i = 0; i < length; i++){
                    System.out.println(arr[i]);}
                    System.out.println("length ="+length);
}}
