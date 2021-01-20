    
import java.util.Arrays;
public class Product 
{public  static void  product(int[] arr){
    int product = 1;
    int [] prod = new int [arr.length];
         for(int i = 0; i < arr.length; i++){
               for(int j = 0; j < arr.length;j++){
            if (i != j){
            product *= arr[j];}}
            
         prod[i] = product;
        product = 1;}
    System.out.println(Arrays.toString(prod));}

   public static void main(String [] args){
       int[] nums1 = { 1, 2, 3, 4, 5, 6, 7},nums2 = {0, 1, 2, 3, 4, 5, 6, 7};

       
       System.out.println("nums1  : "+Arrays.toString(nums1));
       
       System.out.println("nums2  : "+Arrays.toString(nums2));
       
       product(nums1);
       product(nums2);
    }}
