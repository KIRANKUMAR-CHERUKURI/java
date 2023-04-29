class BankDetails {
    String name;
    String accountNumber;
    String accountType;
    double balance;

    public void getDetails(String name, String accountNumber, String accountType, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void printDetails() {
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

class BankProcess extends BankDetails {
    double amount;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        BankProcess account = new BankProcess();
        account.getDetails("John Smith", "123456789", "Savings", 5000);
        account.printDetails();
        account.deposit(1000);
        account.withdraw(2000);
    }
}
