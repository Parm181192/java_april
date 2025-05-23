package may17;

import java.util.Scanner;

public class MainBankAccount {
    public static void main(String[] args) {

        String accountHolderName;
        String accountNumber;
        double balance;

        BankAccount BAcnt=new BankAccount("Pam","1234",2000);
BAcnt.withdraw(200);
BAcnt.displayAccountInfo();
        System.out.println();
        BankAccount BAcnt1=new BankAccount("Sam","4567",4000);
        BAcnt1.deposit(300);
        BAcnt1.displayAccountInfo();
        /*

        BankAccount B1=new BankAccount("", "","")




/*
        Scanner scanner=new Scanner(String.in);
        Scanner scanner1=new Scanner(String.in);
        System.out.println("Enter account holder name");
        accountHolderName= scanner.next();
        System.out.println("Enter account number");
        accountNumber= scanner1.next();
        BankAccount BAccount = new BankAccount(accountHolderName,accountNumber);
        System.out.println("What operation you would like to perform, Press 1 for Deposit and Press 2 for withdraw ");
        Scanner scanner2=new Scanner(System.in);
        Scanner.next();
        if(scanner2.nextInt()==1)
        {
            System.out.println("Enter amount you would like to deposit");
            balance=Scanner.nextDouble();
            BAccount.deposit(balance);
        }
        else if(scanner2.nextInt()==2)
        {
            System.out.println("Enter amount you would like to withdraw");
            balance=Scanner.nextDouble();
            BAccount.withdraw(balance);
        }
        else
            System.out.println("Incorrect choice");
        BAccount.displayAccountInfo();
    }
    */

    }}
