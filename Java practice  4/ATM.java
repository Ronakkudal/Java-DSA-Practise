import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
  private static ArrayList<Account> accounts = new ArrayList<>();
  private static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    accounts.add(new Account(1, "John Doe", 1000.0));
    accounts.add(new Account(2, "Jane Doe", 2000.0));

    int option = 0;
    while (option != 5) {
      System.out.println("1. Login");
      System.out.println("2. Create Account");
      System.out.println("3. List Accounts");
      System.out.println("4. Transactions");
      System.out.println("5. Exit");
      System.out.print("Enter an option: ");
      option = scan.nextInt();
      switch (option) {
        case 1:
          login();
          break;
        case 2:
          createAccount();
          break;
        case 3:
          listAccounts();
          break;
        case 4:
          transactions();
          break;
        case 5:
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid option. Try again.");
          break;
      }
    }
    scan.close();
  }

  private static void login() {
    System.out.print("Enter account number: ");
    int accountNumber = scan.nextInt();
    Account account = getAccount(accountNumber);
    if (account == null) {
      System.out.println("Account not found");
      return;
    }
    int option = 0;
    while (option != 4) {
      System.out.println("1. Deposit");
      System.out.println("2. Withdraw");
      System.out.println("3. Check Balance");
      System.out.println("4. Logout");
      System.out.print("Enter an option: ");
      option = scan.nextInt();
      switch (option) {
        case 1:
          System.out.print("Enter an amount to deposit: ");
          double depositAmount = scan.nextDouble();
          account.deposit(depositAmount);
          break;
        case 2:
          System.out.print("Enter an amount to withdraw: ");
          double withdrawAmount = scan.nextDouble();
          account.withdraw(withdrawAmount);
          break;
        case 3:
          account.checkBalance();
          break;
        case 4:
          System.out.println("Logging out...");
          break;
        default:
          System.out.println("Invalid option. Try again.");
          break;
      }
    }
  }

  private static void createAccount() {
    System.out.print("Enter name: ");
    String name = scan.next();
    System.out.print("Enter initial deposit: ");
    double deposit = scan.nextDouble();
    int accountNumber = accounts.size() + 1;
    accounts.add(new Account(accountNumber, name, deposit));
    System.out.println("Account created successfully with account number " + accountNumber + ".");
}

private static void listAccounts() {
System.out.println("List of Accounts: ");
for (Account account : accounts) {
System.out.println("Account number: " + account.getAccountNumber() +
", Name: " + account.getName() +
", Balance: " + account.getBalance());
}
}

private static void transactions() {
System.out.print("Enter source account number: ");
int sourceAccountNumber = scan.nextInt();
Account sourceAccount = getAccount(sourceAccountNumber);
if (sourceAccount == null) {
System.out.println("Source account not found");
return;
}
System.out.print("Enter destination account number: ");
int destinationAccountNumber = scan.nextInt();
Account destinationAccount = getAccount(destinationAccountNumber);
if (destinationAccount == null) {
System.out.println("Destination account not found");
return;
}
System.out.print("Enter transfer amount: ");
double transferAmount = scan.nextDouble();
if (sourceAccount.getBalance() < transferAmount) {
System.out.println("Insufficient balance in source account");
return;
}
sourceAccount.withdraw(transferAmount);
destinationAccount.deposit(transferAmount);
System.out.println("Transaction completed successfully.");
}

private static Account getAccount(int accountNumber) {
for (Account account : accounts) {
if (account.getAccountNumber() == accountNumber) {
return account;
}
} 
return null;
}
}

class Account {
private int accountNumber;
private String name;
private double balance;

public Account(int accountNumber, String name, double balance) {
this.accountNumber = accountNumber;
this.name = name;
this.balance = balance;
}

public int getAccountNumber() {
return accountNumber;
}

public String getName() {
return name;
}

public double getBalance() {
return balance;
}

public void deposit(double amount) {
balance += amount;
System.out.println("Deposit successful. New balance: " + balance);
}

public void withdraw(double amount) {
if (balance < amount) {
System.out.println("Insufficient balance");
return;
}
balance -= amount;
System.out.println("Withdrawal successful. New balance: " + balance);
}

public void checkBalance() {
System.out.println("Balance: " + balance);
}
}
