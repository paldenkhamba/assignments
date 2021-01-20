/**
*odd or even.
*
*@tashi sherpa
*@version (november 9th 2020)
*/
import java.util.Scanner;
public class oddneven
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num1;
        System.out.println("enter a number:");
        num1=sc.nextInt();
        if(num1%2==0)
         {System.out.println (num1+ " is even");}
        else
        {System.out.println (num1+ " is odd");}
        
    }
}