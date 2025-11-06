import java.util.Scanner;


class InvalidInputException extends Exception {
    public InvalidInputException(String msg) {
        super(msg);
    }
}

// ========== SRP ==========
class BankAccount {
    private String accNo;
    private double balance;

    public BankAccount(String accNo, double balance) throws InvalidInputException {
        if(accNo == null || accNo.trim().isEmpty())
            throw new InvalidInputException("Account number cannot be empty");

        if(balance < 0) 
            throw new InvalidInputException("Balance cannot be negative");

        this.accNo = accNo;
        this.balance = balance;
    }

    public String getAccNo() { return accNo; }
    public double getBalance() { return balance; }

    public void setBalance(double balance) throws InvalidInputException {
        if(balance < 0) 
            throw new InvalidInputException("Balance cannot be negative");
        this.balance = balance;
    }
}

class EncapsulationDemo {
    public void run() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Account Number: ");
            String acc = sc.nextLine().trim();
            if(acc.isEmpty())
                throw new InvalidInputException("Account number cannot be empty");

            System.out.print("Enter opening balance: ");
            if(!sc.hasNextDouble())
                throw new InvalidInputException("Enter numeric value only");

            double bal = sc.nextDouble();
            if(bal < 0)
                throw new InvalidInputException("Balance must be positive");

            BankAccount b = new BankAccount(acc, bal);

            System.out.println("Account: " + b.getAccNo() + " | Balance: " + b.getBalance());

            System.out.print("Enter new balance: ");
            if(!sc.hasNextDouble())
                throw new InvalidInputException("Enter numeric value only");

            double newBalance = sc.nextDouble();
            b.setBalance(newBalance);

            System.out.println("Updated Balance: " + b.getBalance());

        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// ========== OCP ==========
class Bank {
    public double interest(double bal) { return bal * 0.05; }
}

class SavingAccount extends Bank {
    public double interest(double bal) { return bal * 0.07; }
}

class CurrentAccount extends Bank {
    public double interest(double bal) { return bal * 0.04; }
}

class OCPDemo {
    public void run() {
        Bank s = new SavingAccount();
        Bank c = new CurrentAccount();

        System.out.println("Saving Interest on 1000 = " + s.interest(1000));
        System.out.println("Current Interest on 1000 = " + c.interest(1000));
    }
}

// ========== LSP ==========
class BankPoly {
    public void withdraw(double a){
        System.out.println("Generic Withdrawal: " + a);
    }
}

class SavingPoly extends BankPoly {
    public void withdraw(double a){
        System.out.println("Saving Withdrawal: " + a);
    }
}

class CurrentPoly extends BankPoly {
    public void withdraw(double a){
        System.out.println("Current Withdrawal: " + a);
    }
}

class LSPDemo {
    public void run() {
        BankPoly a = new SavingPoly();
        BankPoly b = new CurrentPoly();
        a.withdraw(500);
        b.withdraw(700);
    }
}

// ========== ISP ==========
interface Deposit 
 { 
    void deposit(double a);
 }

interface Withdraw 
{ 
    void withdraw(double a);
 }

class SavingService implements Deposit, Withdraw {
    double bal = 0;

    public void deposit(double a){
        bal = bal + a;
        System.out.println("Deposited " + a + " | Balance: " + bal);
    }

    public void withdraw(double a){
        bal = bal - a;
        System.out.println("Withdraw " + a + " | Balance: " + bal);
    }
}

class ISPdemo {
    public void run(){
        SavingService s = new SavingService();
        s.deposit(1000);
        s.withdraw(200);
    }
}

// ========== DIP ==========
interface AccRepo {
    void save(String accNo);
}

class DBRepo implements AccRepo {
    public void save(String accNo) {
        System.out.println("Account saved in Database: " + accNo);
    }
}

class BankService {
    AccRepo repo;
    public BankService(AccRepo repo){ this.repo = repo; }
    public void openAccount(String acc){ repo.save(acc); }
}

class DIPDemo {
    public void run(){
        AccRepo repo = new DBRepo();
        BankService s = new BankService(repo);
        s.openAccount("ACC1001");
    }
}


class SOLIDMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n===== SOLID PRINCIPLE MENU =====");
            System.out.println("1. SRP ");
            System.out.println("2. OCP");
            System.out.println("3. LSP ");
            System.out.println("4. ISP");
            System.out.println("5. DIP");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            if(!sc.hasNextInt()) {
                sc.next();
                System.out.println("Invalid choice. Enter number 0-5 only.");
                continue;
            }

            int ch = sc.nextInt();

            switch(ch) {
                case 1 -> new EncapsulationDemo().run();
                case 2 -> new OCPDemo().run();
                case 3 -> new LSPDemo().run();
                case 4 -> new ISPdemo().run();
                case 5 -> new DIPDemo().run();
                case 0 -> {
                    System.out.println("Exiting program...");
                    return;
                }
                default -> System.out.println("Choose option between 0-5 only.");
            }
        }
    }
}
