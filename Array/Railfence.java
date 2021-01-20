
/**
 * Write a description of class Railfence here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.Scanner;
public class Railfence
{
    public static String encode(String str,int key){
        char [][]arr = new char[key][str.length()];
        int j = 0; Boolean dirn = false;
         
        /** a matrix is formed of row : key and column :str.length()
         * the characters of the plaintext are placed diagonally in 
         * the matrix. 
         * variable dirn(direction) checks the direction.
         */
        
       
        for(int i = 0; i < str.length(); i++){
           if(j == 0 || j == key-1)
           dirn = !dirn;
           
            arr[j][i] = str.charAt(i);
            
            if(dirn)
            j++;
            else j--;
        }
        
        // the characters in the matrix are added to the String - cipherText.
        
        String cipherText = "";
        for(int i = 0; i < key; i++){
            for(int k = 0; k < str.length(); k++){
                if (arr[i][k] != 0)
                cipherText += arr[i][k];
            }}
        return cipherText;
    }
    
   public static String decode (String str, int key){
 
        char [][]arr = new char[key][str.length()];
        int j = 0; Boolean dirn = false;
         
        /** the position of the characters in the matrix of row:key and
         * column:str.length(), are mapped out with '*'.
         */ 
        
        for(int i = 0; i < str.length(); i++){
           if(j == 0 || j == key-1)
           dirn = !dirn;
           
            arr[j][i] = '*';
            
            if(dirn)
            j++;
            else j--;
        }
        
        // the '*' in the matrix are replaced with the characters in the cipher text.
        int index = 0;
        for(int i = 0; i < key; i++){
            for(int k = 0; k < str.length(); k++){
                if (arr[i][k] == '*' && index < str.length()){
                    arr[i][k] = str.charAt(index++);
                }
            }
        }
        
          String plainText = "";
          j = 0; dirn = false;
        for(int i = 0; i < str.length(); i++){
           if(j == 0 || j == key-1)
           dirn = !dirn;
           
           plainText += arr[j][i] ;
            
            if(dirn)
            j++;
            else j--;
        }
        
        
        return plainText;
    }
    public static void main (String [] args ){
        Scanner in = new Scanner(System.in);
        System.out.println("enter text : ");
     String plainText = in.nextLine();
     System.out.println("enter the key :");
     int key = in.nextInt();
     
     System.out.println("cipher text : "+encode(plainText,key));
     System.out.println("plain text :"+decode(encode(plainText,key),key));
    }
}
