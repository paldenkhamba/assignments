
/**
*Compute Tax
*
*@tashi sherpa
*@version (november 9th 2020)
*/
import java.util.Scanner;
public class annualIncomeTax
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter annual income:");
       int c=sc.nextInt();
        if(c<=100000)
         {System.out.println ("no tax");}
        else if(c>100000 && c<=150000)
        {System.out.println ("tax :"+c*.10);}
        else if (c>1500000 && c<=250000)
        {System.out.println ("tax :"+(c*.20+5000));}
        else
        {System.out.println ("tax :"+(c*.30+25000));}
    }
}