//import java.util.Scanner;
//public class banking_system_project {
//    public class Account {
//        int accountNumber;
//        double balance;
//        Account(int accountNumber, double balance) {
//            this.accountNumber=accountNumber;
//            this.balance=balance;
//        }
//        public static void deposit(double amount,double balance){
//            double total_balance=amount+balance;
//            System.out.println("CONGRATULATIONS,YOU ARE SUCCESSFULLY CREDITED YOUR AMOUNT IN YOUR  BANK ACCOUNT");
//
//        }
//        public static void withdraw(double amount,double balance){
//           if(amount>balance){
//               System.out.println("SORRY SIR,your bank doesn't have sufficient balance,please deposit in your bank account for further transactions");
//           }
//           final double total_balance=balance-amount;
//            System.out.println("you are successfully debited your amount from your bank account");
//
//        }
//        double getaccountNo(){
//            return accountNumber;
//
//        }
//        public  double getbalance(){
//            return balance;
//
//        }
//
//
//        public String  toString(){
//            return "Account no="+ "accountNumber+"+"balance = "+" "+balance;
//
//        }
//    }
//
//    public class SavingAccount extends Account {
//        double interestRate;
//
//        SavingAccount(int accountNumber, double balance) {
//            super(accountNumber, balance);
//        }
//
//      public static void applyInterest(){
//
//      }
//
//
//
//    }
//
//    public class CheckingAccount extends Account {
//    double overdraft;
//
//        CheckingAccount(int accountNumber, double balance,double overdraft) {
//            super(accountNumber, balance);
//            this.overdraft=overdraft;
//        }
//        void withdraw(double amount){
//            double bal=getbalance()+overdraft;
//            if(bal>amount){
//                balance=balance-amount;
//            }
//            else{
//                System.out.println("NOT possible");
//            }
//        }
//    }
//
//    public void main(String[] args) {
//        SavingAccount savingAccount = new SavingAccount(1001, 1000.0, 5.0);
//        CheckingAccount checkingAccount = new CheckingAccount(2001, 500.0, 200.0);
//
//        System.out.println(savingAccount);
//        System.out.println(checkingAccount);
//
//        savingAccount.deposit(200.0);
//        checkingAccount.deposit(100.0);
//
//        System.out.println("After deposits:");
//        System.out.println(savingAccount);
//        System.out.println(checkingAccount);
//
//        savingAccount.applyInterest();
//        checkingAccount.withdraw(800.0);
//
//        System.out.println("After interest and withdrawal:");
//        System.out.println(savingAccount);
//        System.out.println(checkingAccount);
//
//
//
//
//    }
//}
