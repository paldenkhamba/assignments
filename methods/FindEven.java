

import java.util.Scanner;
public class FindEven
{
 public static void main(String [] args){
 Scanner input=new Scanner(System.in);
 System.out.println("Enter Size:");
 int size=input.nextInt();
 int [] numbers=new int [size];
 System.out.println("Enter " +size + " integer values:");
 for (int i = 0; i < size; i++){
     numbers [ i ] = input.nextInt();}
     System.out.println("Sum = "+evenNumbers(numbers));
 //Assign the value received from user to array, call appropriate method to find
// even number and display the sum

 }
 public static int evenNumbers(int [] num)
 { int total=0;
     for (int i = 0; i < num.length; i++){
     if(num[ i ] % 2 == 0)
     System.out.println(num[ i ]);
     total+=num [ i ];}
     return(total);
     
 //determine and print the even numbers and return the
//sum of even numbers after calculation

 }
}
