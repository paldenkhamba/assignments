    
import java.util.Arrays;
public class Zero 
{public  static void  sort(int[] arr){
    
    int k = 0;
               for(int j = 0; j < arr.length;j++){
            if (arr[j] == 0)
            arr[k++]=0;
        }
         for(int j = k; j < arr.length;j++){
           arr[k++]=1;
        }
    
   }
   public static void main(String [] args){
       int[] nums1 = { 0,1,1,0,1,1,0,1,0,0};

       
       System.out.println("original  : "+Arrays.toString(nums1));
       sort(nums1);
       System.out.println("sorted  : "+Arrays.toString(nums1));
       
       
    }}
