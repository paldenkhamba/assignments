    import java.util.Scanner;
    import java.util.Arrays;
    public class MaxMin
    {  public static void sort(int [] arr){
       Arrays.sort(arr);
       int i = 0;
       int length = arr.length;
       int [] arr2 = new int[arr.length]; 
        for(int  j = 0; j < arr.length; j++){
            if(j % 2 == 0)     
            arr2[j]=arr[--length];
            
            else
            arr2[j] = arr[i++];}
    System.out.println(Arrays.toString(arr2));
}
   public static void main(String [] args){
      
       int [] arr ={18 ,26,3,4,56,6,71,9};
        System.out.println(Arrays.toString(arr));
        sort(arr);
       
}}
