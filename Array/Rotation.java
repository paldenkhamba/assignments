
import java.util.Arrays;
public class Rotation
{
   
 public static void rotate(int [] a){
      int temp = a[0];
      for(int i = 0; i < a.length-1; i++){
             a[i]=a[i+1];
    }
    a[a.length-1] = temp;
    System.out.println(Arrays.toString(a));
}
       
   public static void main(String [] args){
      
       int [] arr ={20, 28, 30,12, 40, 59, 150, 5};
        System.out.println(Arrays.toString(arr));
       rotate(arr);
}}


