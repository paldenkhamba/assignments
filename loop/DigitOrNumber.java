/**
*given letter digit or number
*
*@tashi sherpa
*@version (november 10th 2020)
*/
import java.util.Scanner;
public class DigitOrNumber
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        char c;
        System.out.println("enter a character:");
        c=sc.next().charAt(0);
        if(Character.isLetter(c))
         {System.out.println ("letter");}
        else if(Character.isDigit(c))
        {System.out.println ("Digit");}
        else
        {System.out.println (c+ " is a different character");}
    }
}