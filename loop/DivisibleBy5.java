/**
* Divisible by 5 
*
rp*@tashi shea
*@version (november 9th 2020)
*/
import java.util.Scanner;
public class DivisibleBy5
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num1;
        System.out.println("enter a number:");
        num1=sc.nextInt();
        if(num1%5==0)
         {System.out.println (num1+ "is Divisible by 5");}
        else
        {System.out.println (num1+ " is not Divisible by 5");}
        
    }
}