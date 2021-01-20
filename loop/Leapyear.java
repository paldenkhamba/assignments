/**
*Leap year
*
*@tashi sherpa
*@version (november 9th 2020)
*/
import java.util.Scanner;
public class Leapyear
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter a year:");
       int c=sc.nextInt();
        if(c%4==0 && c%100!=0)
         {System.out.println ("leap year");}
        else if(c%4==0 && c%100==0 && c%400==0)
        {System.out.println ("leap year");}
        else
        {System.out.println ("not a leap year");}
    }
}