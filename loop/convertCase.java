/**
*convert the case (upper or lower) of character.
*
*@tashi sherpa
*@version (november 9th 2020)
*/
import java.util.Scanner;
public class convertCase
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        char c;
        System.out.println("enter a character:");
        c=sc.next().charAt(0);
        if(c>='A' && c<='Z')
         {char v=(char)(c+ 32);
             
             System.out.println (v);}
        else if(c>='a' && c<='z')
        {System.out.println ((char)(c-32));}
        else
        {System.out.println (c+ " is a different character");}
    }
}