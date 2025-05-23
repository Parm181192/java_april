package may17;

public class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this(accountHolderName,accountNumber);
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance=0;
    }

    public void deposit(double amount)
    {
        balance=balance+amount;
      //  System.out.println("Balance is: "+ balance);
    }
    public void withdraw(double amount)
    {
        if(balance>amount) {
            balance = balance - amount;
         //   System.out.println("Balance is: " + balance);
        }
        else
            System.out.println("Not having sufficient balance");
    }
    public void displayAccountInfo()
    {
        System.out.println("Account holder name: "+ accountHolderName);
        System.out.println("Account number "+ accountNumber);
        System.out.println("Balance "+balance);
    }
}

