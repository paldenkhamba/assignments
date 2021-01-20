/**
*upper or lower case or other character.
*
*@tashi sherpa
*@version (november 9th 2020)
*/
import java.util.Scanner;
public class character
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        char c;
        System.out.println("enter a character:");
        c=sc.next().charAt(0);
        if(c>='A' && c<='Z')
         {System.out.println (c+ " is upper case");}
        else if(c>='a' && c<='z')
        {System.out.println (c+ " is lower case");}
        else
        {System.out.println (c+ " is a different character");}
    }
}