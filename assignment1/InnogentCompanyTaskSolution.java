
class BankAccount {
   
    private String accountNumber;   
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

  
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// SRP - EncapsulationTest ka kaam sirf BankAccount ko test karna hai
class EncapsulationTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 1000.0);

        System.out.println("Account No: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        account.setBalance(1500.0);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}


 // Open/Closed Principle
class Bank {
    //  OCP - Parent class open for extension (child classes override method), closed for modification
    public double calculateInterest(double balance) {
        return balance * 0.05;     }
}

//  Inheritance - SavingAccount extends Bank → reuse parent class
//  OCP - Extends parent to change behavior (override) without modifying Bank class
class SavingAccount extends Bank {
    
    public double calculateInterest(double balance) {
        return balance * 0.07; 
    }
}

//  Inheritance - CurrentAccount extends Bank
//  OCP - Different interest calculation without changing Bank
class CurrentAccount extends Bank {
   
    public double calculateInterest(double balance) {
        return balance * 0.04; 
    }
}

class InheritanceTest {
    public static void main(String[] args) {
        
        Bank saving = new SavingAccount();
        Bank current = new CurrentAccount();

        System.out.println("Saving Account Interest: " + saving.calculateInterest(1000));
        System.out.println("Current Account Interest: " + current.calculateInterest(1000));
    }
}


// Polymorphism + Liskov Substitution Principle
class BankAccountPoly {
    //  High-level generic account withdraw method
    public void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + " from generic account");
    }
}

//  Inheritance + LSP - SavingAccountPoly can replace BankAccountPoly without breaking behavior
class SavingAccountPoly extends BankAccountPoly {
   
    public void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + " from Saving Account");
    }
}

//  Inheritance + LSP - CurrentAccountPoly can replace BankAccountPoly without breaking behavior
class CurrentAccountPoly extends BankAccountPoly {
   
    public void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + " from Current Account");
    }
}

class PolymorphismTest {
    public static void main(String[] args) {
        
        BankAccountPoly acc1 = new SavingAccountPoly();
        BankAccountPoly acc2 = new CurrentAccountPoly();

        
        acc1.withdraw(500);
        acc2.withdraw(1000);
    }
}

// Abstraction + Interface Segregation Principle
interface DepositService {
    void deposit(double amount);
}

interface WithdrawService {
    void withdraw(double amount);
}

//  Abstraction - SavingAccountAbs implements abstraction via interfaces
//  SRP - Each class/method has a single responsibility
class SavingAccountAbs implements DepositService, WithdrawService {
    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Saving Account Balance = " + balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrew " + amount + " from Saving Account Balance = " + balance);
    }
}

class AbstractionTest {
    public static void main(String[] args) {
       
        SavingAccountAbs saving = new SavingAccountAbs();
        saving.deposit(2000);
        saving.withdraw(500);
    }
}

// DIP (Dependency Inversion Principle)
//  High-level module depends on abstraction, not concrete class
interface AccountRepository {
    void saveAccount(String accountNumber);  // abstraction for saving account
}

// Low-level module implements the abstraction
class DatabaseAccountRepository implements AccountRepository {
    
    public void saveAccount(String accountNumber) {
        System.out.println("Saving account " + accountNumber + " into Database");
    }
}

//High-level module (Business logic) depends on abstraction
class BankService {
    private AccountRepository repo;  // DIP -> depends on interface

    // Dependency Injection via constructor -> Loose coupling
    public BankService(AccountRepository repo) {
        this.repo = repo; 
    }

    // SRP: only responsible for opening account
    public void openAccount(String accountNumber) {
        repo.saveAccount(accountNumber); // delegate to repository
    }
}

class DIPTest {
    public static void main(String[] args) {
        //Low-level implementation injected into high-level service
        AccountRepository repo = new DatabaseAccountRepository(); 
        BankService bankService = new BankService(repo);

        bankService.openAccount("1000"); // BankService works without knowing concrete repo
    }
}


class FactorialUsingRecursion {

    static int factorial(int n) { 
        if (n == 0 || n == 1) return 1; 
        else return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; 
        int result = factorial(n); 
        System.out.println("Factorial of " + n + " is: " + result); // String Pool, println in Method Area
    }
}


class FactorialProgram{

    public static int fact(int n){ // Method Area, n in Stack
         int data = 1; // Stack
         for(int i=1;i<=n;i++){ // i in Stack
             data = data * i; // Stack
         }
         return data; // Stack
    }

    public static void main(String[] args) {
        int n = 5; // Stack
        System.out.println(fact(n)); // Stack, println in Method Area
    }
}


class FactorialPrint{

    static int factorial(int n){
        if(n==0||n==1)return 1;
        else return n* factorial(n-1);
    }
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        int result = factorial(n);
        System.out.println(result);
    }
}


