// Encapsulation + Single Responsibility Principle
class BankAccount {
    //  Encapsulation: private fields - data hiding
    private String accountNumber;   
    private double balance;

    //  SRP - Constructor ka kaam sirf object initialize karna hai
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //  Encapsulation -  getter -> data ko read karne ka controlled way
    public String getAccountNumber() {
        return accountNumber;
    }

    //  Encapsulation - getter -> balance read karne ka controlled way
    public double getBalance() {
        return balance;
    }

    //  Encapsulation - setter -> balance update karne ka controlled way
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// SRP - EncapsulationTest ka kaam sirf BankAccount ko test karna hai
class EncapsulationTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 1000.0);

        // read account details
        System.out.println("Account No: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        // update balance
        account.setBalance(1500.0);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}


// Inheritance + Open/Closed Principle
class Bank {
    //  OCP - Parent class open for extension (child classes override method), closed for modification
    public double calculateInterest(double balance) {
        return balance * 0.05; // default 5%
    }
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
        //  Polymorphism: Parent reference can point to child objects
        Bank saving = new SavingAccount();
        Bank current = new CurrentAccount();

        //Overridden methods called based on actual object
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
        //  Polymorphism: Parent reference points to child objects
        BankAccountPoly acc1 = new SavingAccountPoly();
        BankAccountPoly acc2 = new CurrentAccountPoly();

        //  Runtime polymorphism: Actual child method executed
        acc1.withdraw(500);   // SavingAccountPoly withdraw called
        acc2.withdraw(1000);  // CurrentAccountPoly withdraw called
    }
}

// Abstraction + Interface Segregation Principle
interface DepositService {
    void deposit(double amount);   // only deposit responsibility
}

interface WithdrawService {
    void withdraw(double amount);  // only withdraw responsibility
}

//  Abstraction - SavingAccountAbs implements abstraction via interfaces
//  SRP - Each class/method has a single responsibility
class SavingAccountAbs implements DepositService, WithdrawService {
    private double balance = 0;  // Encapsulation - balance hidden, controlled via methods

    //  Deposit functionality
   
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Saving Account Balance = " + balance);
    }

    //  Withdraw functionality
   
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrew " + amount + " from Saving Account Balance = " + balance);
    }
}

class AbstractionTest {
    public static void main(String[] args) {
        // Abstraction in action: we use only the required interfaces
        SavingAccountAbs saving = new SavingAccountAbs();
        saving.deposit(2000);   // Deposit using DepositService
        saving.withdraw(500);   // Withdraw using WithdrawService
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

//  High-level module (Business logic) depends on abstraction
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

        bankService.openAccount("98765967"); // BankService works without knowing concrete repo
    }
}


class FactorialUsingRecursion {

    static int factorial(int n) { // Method Area, n in Stack
        if (n == 0 || n == 1) return 1; // return in Stack
        else return n * factorial(n - 1); // recursive call, new Stack frame
    }

    public static void main(String[] args) {
        int n = 3; // Stack
        int result = factorial(n); // Stack
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


