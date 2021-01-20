public class power{
    
    static int power(int m,int n){
        int a=1;
        for (int i=0;n>=i;i++)
        {a=a*m;}
        return a;
    }
        static int power(int m)
        {
            int a=m*m;
            return a;}
       public static void main(String[]args){
        System.out.println(power(3,4));
        System.out.println(power(3));
} }
       
