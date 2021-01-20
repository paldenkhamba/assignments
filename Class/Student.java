public class Student{
 String name;
 int age;
 int m1;
 int m2;
 int m3;
 int maximum;
 int average;
 
 Student(String name, int age , int m1,int m2,int m3){
     this.name= name;
     this.age = age;
     this.m1 = m1;
     this.m2 = m2;
     this.m3 = m3;
     maximum= m1>m2?m1>m3?m1:m3:m2>m3?m2:m3;
     average = (m1+m2+m3)/3;
    
    }
    void display(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("marks 1 : "+m1);
        System.out.println("marks 2 : "+m2);
        System.out.println("marks 3 : "+m3);
        System.out.println("maximum : "+maximum);
        System.out.println("average : "+average);
    
    }
    public static void main(String [] args){
        Student one = new Student("tashi sherpa",20 , 81,71,91);
        one.display();
    }
    
}