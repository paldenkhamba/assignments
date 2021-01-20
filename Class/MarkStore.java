import java.util.Scanner;

public class MarkStore

{

  public static void main(String [] args){

    final int STUDENTS = 2;

    final int SUBJECTS = 3;

    double[][] marks = new double [STUDENTS] [SUBJECTS];

   

    Scanner in = new Scanner(System.in);

    for(int i = 0; i<STUDENTS; i++){

    System.out.println("enter student "+(i+1)+" marks  :");

    for (int j= 0; j<SUBJECTS ; j++){

    marks[i][j] = in.nextDouble();

   }}

  

    double [][]scores = marks;

   

    System.out.println("\nTotal and average for each student");

    totalAverageStd(scores);

   

    System.out.println("\nTotal and average for each Assignment");

    totalAverageAssignments(scores);

   }


    public static void totalAverageStd(double [][]scores){

      

        System.out.println("Student Total \t Average ");

            double []total = new double [scores.length];

            double []Average = new double [scores.length];

           

            for(int i = 0; i<scores.length; i++){

        for (int j= 0; j<scores[i].length ; j++){

            total [i] += scores[i][j];

   }

   Average [i] = total [i]/scores[i].length;

}

 

for(int i = 0; i<scores.length; i++){

System.out.printf((i+1) +"\t"+total[i]+"\t"+ " %5.2f%n",Average[i]);

}

}

 

 

   public static void totalAverageAssignments(double [][]scores){

       System.out.println("Subject Total \t Average ");

            double []total = new double [scores[0].length];


double []Average = new double [scores[0].length];

            int k = 0;

           

        for (int j= 0; j<scores[0].length ; j++){

            for(int i = 0; i<scores.length; i++){

            total [k] += scores[i][j];

   }

   Average [k] = total [k++]/scores.length;

}

 

for(int i = 0; i<scores[0].length; i++){

System.out.printf((i+1) +"\t"+total[i]+"\t"+ " %5.2f%n",Average[i]);

}

 

}

}