/**
*write a description of class LargestNumber here.
*
*@author (your name)
*@version ( a version number or a date)
*/
import java.util.Scanner;
public class LargestNumber
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("enter two numbers :");
        
        num1=sc.nextInt();
        num2=sc.nextInt();
        if(num1>num2)
        {System.out.println (num1+ " is Largest");}
        else
        {System.out.println (num2+ " is Largest");}
    }
}

