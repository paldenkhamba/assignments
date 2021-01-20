
import java.util.Scanner;
public class Area
{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println(area(num1,num2,num3));
    }
    public static double area(int a,int b,int c)
    {double p = (a + b + c)/2;
        
        return Math.sqrt(p * ( p - a) *(p - b)*(p - c));
    }
}
