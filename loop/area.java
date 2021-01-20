/**
* area of rectangle , circle and square
*
*@tashi sherpa
*@version (november 9th 2020)
*/
import java.util.Scanner;
public class area
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("find area of :"+"\n"+"1. rectangle"+"\n"+"2. circle"+"\n"+"3. square");
        int a =sc.nextInt();
        switch(a){
        case 1 :
         System.out.println("enter length:");
         System.out.println("enter breadth:");
         int l =sc.nextInt();
         int b =sc.nextInt();
         System.out.println("area : "+l*b);
         break;
         
         case 2 :
        System.out.println("enter radius:");
        int r=sc.nextInt();
        System.out.println("area : "+3.14*r*r);
        break;
        
        case 3 :
        System.out.println("enter length:");
        int sl=sc.nextInt();
        System.out.println("area : "+sl*sl);
        break;
        
        default:
        System.out.println("invalid");
    }
}
}