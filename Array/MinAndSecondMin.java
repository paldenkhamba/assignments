    import java.util.Scanner;
    import java.util.Arrays;
    public class MinAndSecondMin
    {  public static void smallest(int [] arr){
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for(int  j = 0; j < arr.length; j++){
                 if(arr[j]<min){
                 min = arr[j];
    }
                if(arr[j]<min2 && arr[j]!=min){
                min2 = arr[j];}
            }
    System.out.println(min+" "+min2);
}
   public static void main(String [] args){
      
       int [] arr ={18 ,26,3,4,56,6,71,9};
        System.out.println(Arrays.toString(arr));
        smallest(arr);
       
}}
