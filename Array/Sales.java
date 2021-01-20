
/**
 * Sales management system
 * sales report
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Sales
{
   public static void barchart(double[] arr){
       System.out.println("Sales Bar Chart (Each * = Rs.1000)"); 
      for(int i = 0; i < arr.length; i++){
        System.out.print("store "+ (i+1) +" : ");
        for (int j = 0; j <arr[i]/1000; j++){
            System.out.print("*");}
        System.out.println();
    }
}

    public static void percentage( double [] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
        sum += arr[i];
        }
        System.out.println("Percentage of sales");
        for(int i = 0; i < arr.length; i++){
            
        System.out.print("store "+ (i+1) +" : ");
        System.out.printf("%5.2f",((arr[i]/sum)*100));
        System.out.println("%");
       
    }
}
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Today's Sales Report");
        double [] sales = new double [3];
        for(int i = 0; i < 3; i++){
        System.out.print("Enter Today sales for store "+ (i+1) +" : ");
        sales[i] = in.nextDouble();
        System.out.println();
    }
    barchart(sales);
    percentage(sales);
    }
}
