//5. Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.

public class Main {
    public static void main (String[] args){
        BankAccount B1 = new BankAccount("B1", 500);
        //deposit money
        B1.deposit(1200);
        //withdraw money
        B1.withdraw(10000);
    }
}

//parent class
public class BankAccount {
    private String Account_Number;
    private int balance;

    public BankAccount(String Account_Number, int balance){
        this.Account_Number = Account_Number;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        }
        else if (balance <= amount){
            System.out.println("INSUFFICIENT BALANCE!");
        }
    }

    public double getBalance(){
        return balance;
    }
}

//child class
public class SavingsAccount extends BankAccount {

    public SavingsAccount(String Account_Number, int balance) {
        super(Account_Number, balance);
    }

    @Override
    public void withdraw(double amount){
        if(getBalance() - amount < 100){
            System.out.println("MINIMUM REQUIREMENT TO MAKE WITHDRAWAL IS $100!");
        }
        else {
            super.withdraw(amount);
        }
    }

}
