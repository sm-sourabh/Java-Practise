//package Previoud IPA;
import java.util.*;

class BankAccount{
    String accNo;
    String accHolderName;
    double balance;

    BankAccount(){};
    
    BankAccount(String accNo, String accHolderName,double balance){
        this.accNo=accNo;
        this.accHolderName=accHolderName;
        this.balance=balance;
    }
}
class BankUtils{
    BankAccount fromAccount;
    BankAccount toAccount;
    double amount;
    String transactionCode;

    public static Transaction transferFunds(BankAccount obj1,BankAccount obj2,double transferMoney,String transactionCode){
        Transaction temp=new Transaction();
        obj1.balance=obj1.balance-transferMoney;
        obj2.balance=obj2.balance+transferMoney;
        temp.amount=transferMoney;
        temp.transactionCode=transactionCode;


        return temp;
    } 
}
class Transaction{
    String transactionCode;
    double amount;
    String timestamp;
    
    Transaction(){};

    Transaction(String transactionCode,double amount,String timestamp){
        this.transactionCode=transactionCode;
        this.amount=amount;
        this.timestamp=timestamp;
    }
}
class insufficientBalanceException extends Exception{
    insufficientBalanceException(String message){
        super(message);
    }
}

public class IPA50 {
    public static void main(String args[]){
        BankAccount obj1=new BankAccount();
        BankAccount obj2=new BankAccount();
        Scanner sc=new Scanner(System.in);
        
        BankAccount[] arr=new BankAccount[2];
        // arr[0]=obj1;
        // arr[1]=obj2;

        for(int i=0;i<2;i++){
            String accNo=sc.nextLine();
            String accHolderName=sc.nextLine();
            double balance=sc.nextDouble();
            sc.nextLine();
            arr[i] = new BankAccount(accNo,accHolderName,balance);
        }
        double transferMoney=sc.nextDouble();
        sc.nextLine();
        String transactionCode=sc.nextLine();
        sc.close();

        Transaction res=BankUtils.transferFunds(arr[0],arr[1],transferMoney, transactionCode);

            System.out.println("Transaction Code :" + res.transactionCode);
            System.out.println("Amount Transferred :" + res.amount);
            System.out.println();

            for(int i=0;i<2;i++){
                System.out.println("Account: " + i+1);
                System.out.println("Account Number :" + arr[i].accNo);
                System.out.println("New Balance :"+ arr[i].balance);
                System.out.println();
            }

    }
    
}
