import java.util.Scanner;


class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}


class FactorialProgram {

    public long factorialRecursive(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorialRecursive(n - 1);
    }

   
    public long factorialIterative(int n) {
        long result = 1;
        for(int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public long calculateFactorial(int n, boolean useRecursion) throws InvalidNumberException {
        if (n < 0) {
            throw new InvalidNumberException("Negative numbers are not allowed.");
        }
        
        if (n > 20) {
            throw new InvalidNumberException("Value cannot be greater than 20 (long range limit).");
        }

        if (useRecursion) {
            return factorialRecursive(n);
        } else {
            return factorialIterative(n);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FactorialProgram obj = new FactorialProgram();

        while(true) {

            try {

                System.out.println("\n1. Factorial using Recursion");
                System.out.println("2. Factorial using Loop");
                System.out.print("Enter your choice (1/2): ");

                if (!sc.hasNextInt()) {
                    sc.next();
                    throw new Exception("Please enter only numeric choice.");
                }
                int choice = sc.nextInt();

                if(choice != 1 && choice != 2) {
                    throw new Exception("Invalid choice. Please enter 1 or 2.");
                }

                System.out.print("Enter a number: ");

                if (!sc.hasNextInt()) {
                    sc.next();
                    throw new Exception("Please enter only integer values.");
                }
                int num = sc.nextInt();

                long result = obj.calculateFactorial(num, choice == 1);
                System.out.println("Factorial of " + num + " = " + result);
                break;

            } 
            catch(InvalidNumberException e) {
                System.out.println("Error: " + e.getMessage());
            } catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
