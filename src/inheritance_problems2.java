//5. Write a Java program to create a class known as "BankAccount" with methods called deposit()
// and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent
// withdrawals if the account balance falls below one hundred.
import java.util.Scanner;
class BankAccount{
    public void deposit(){
        int totalamount=500;
        System.out.println("i am a bank holder , deposit amount 2000 in current saving account");
    }
    public void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter amount should be withdraw=");
        int amount=sc.nextInt();
        if(amount<=100){
            System.out.println("you can't withdraw amount,your amount is less,please deposit sufficient money to your saving account");
        }
    }
}
class SavingsAccount extends BankAccount{
    @Override
    public void withdraw() {
        super.withdraw();
    }
}
public class inheritance_problems2 {
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.deposit();
        b.withdraw();
        SavingsAccount s=new SavingsAccount();
        s.withdraw();

    }
}
