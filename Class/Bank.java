public class Bank{
 String depositor;
 int accountNumber;
 int accountType;
 int balanceAmount;
 
 
   
Bank(String name, int num, int type, int balance ){
    depositor = name;
    accountNumber = num;
    accountType = type;
    balanceAmount = balance;
}

void deposit(int num){
 balanceAmount += num;   
}

void withdraw(int num){
 if (num<=balanceAmount)
 {System.out.println("intial Balance : "+balanceAmount); 
 balanceAmount -= num;
     System.out.println("withdrawn amount = "+num);
    System.out.println(" Balance : "+balanceAmount); }
     
     else
     {System.out.println("insufficient balance");
}
}

void display(){
    System.out.println("Account holder :"+depositor);
    System.out.println("Balance : "+balanceAmount);
}

public static void main(String [] args){
Bank one = new Bank ("tashi sherpa",12345, 34, 100000);
one.deposit(40000);
one.withdraw(130000);
one.display();

}
}