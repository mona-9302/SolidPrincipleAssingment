import java.util.*;


class InputException extends Exception {
    public InputException(String msg) {
        super(msg);
    }
}

// ========== Employee (Comparable) ==========
class EmployeeComparable implements Comparable<EmployeeComparable> {
    private int id;
    private String name;
    private String dept;
    private double salary;

    public EmployeeComparable(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId() { return id; }

    public int compareTo(EmployeeComparable e) {
        return this.id - e.id;
    }

    public String toString() {
        return id + " " + name + " " + dept + " " + salary;
    }
}

// ========== Employee (Comparator) ==========
class Employee {
    private int id;
    private String name;
    private String dept;
    private double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId(){ return id; }
    public String getName(){ return name; }
    public String getDept(){ return dept; }
    public double getSalary(){ return salary; }

    public String toString() {
        return id + " " + name + " " + dept + " " + salary;
    }
}


class EmployeeMenu {

    static Scanner sc = new Scanner(System.in);

    static int inputInt(String msg) throws InputException {
        System.out.print(msg);
        if(!sc.hasNextInt()){ sc.next(); throw new InputException("Enter valid integer only"); }
        int val = sc.nextInt();
        if(val <= 0) throw new InputException("Value must be greater than 0");
        return val;
    }

    static double inputDouble(String msg) throws InputException {
        System.out.print(msg);
        if(!sc.hasNextDouble()){ sc.next(); throw new InputException("Enter valid number only"); }
        double val = sc.nextDouble();
        if(val <= 0) throw new InputException("Salary must be positive");
        return val;
    }

    static String inputString(String msg) throws InputException {
        System.out.print(msg);
        String s = sc.next();
        if(s.trim().isEmpty()) throw new InputException("Input cannot be empty");
        if(!s.matches("[a-zA-Z]+")) throw new InputException("Only alphabets allowed");
        return s;
    }

    // ========== Comparable ==========
    static void comparableOperation() {
        try {
            int n = inputInt("\nHow many employees? (min 1): ");
            if(n < 1) throw new InputException("Employee count must be >= 1");

            List<EmployeeComparable> list = new ArrayList<>();

            for(int i = 0; i < n; i++) {
                System.out.println("\nEnter Employee " + (i+1));
                int id = inputInt("ID: ");
                String name = inputString("Name: ");
                String dept = inputString("Department: ");
                double salary = inputDouble("Salary: ");

                list.add(new EmployeeComparable(id, name, dept, salary));
            }

            Collections.sort(list);
            System.out.println("\nSorted by ID:");
            list.forEach(System.out::println);

            // === Updated delete with validation ===
            boolean found = false;
            while(!found) {
                try {
                    int id = inputInt("\nEnter ID to delete: ");
                    found = list.removeIf(e -> e.getId() == id);

                    if(found) {
                        System.out.println("Employee Deleted Successfully.");
                    } else {
                        System.out.println("Employee ID not found. Enter a valid ID.");
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    sc.nextLine();
                }
            }

            System.out.println("\nFinal List:");
            list.forEach(System.out::println);

        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // ========== Comparator ==========
    static void comparatorOperation() {
        try {
            int n = inputInt("\nHow many employees? (min 1): ");
            if(n < 1) throw new InputException("Employee count must be >= 1");

            ArrayList<Employee> list = new ArrayList<>();

            for(int i = 0; i < n; i++) {
                System.out.println("\nEnter Employee " + (i+1));

                int id = inputInt("ID: ");
                String name = inputString("Name: ");
                String dept = inputString("Department: ");
                double salary = inputDouble("Salary: ");

                list.add(new Employee(id, name, dept, salary));
            }

            Comparator<Employee> sortLogic = (a, b) -> {
                int nameCmp = a.getName().compareTo(b.getName());
                if(nameCmp != 0) return nameCmp;

                int deptCmp = a.getDept().compareTo(b.getDept());
                if(deptCmp != 0) return deptCmp;

                return Double.compare(b.getSalary(), a.getSalary());
            };

            Collections.sort(list, sortLogic);

            System.out.println("\nSorted (Name ASC, Dept ASC, Salary DESC):");
            list.forEach(System.out::println);

            // === Updated delete with validation ===
            boolean found = false;
            while(!found) {
                try {
                    int id = inputInt("\nEnter ID to delete: ");
                    found = list.removeIf(e -> e.getId() == id);

                    if(found) {
                        System.out.println("Employee Deleted Successfully.");
                    } else {
                        System.out.println("Employee ID not found. Enter valid ID.");
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    sc.nextLine();
                }
            }

            System.out.println("\nFinal List:");
            list.forEach(System.out::println);

        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // ========== Main Menu ==========
    public static void main(String[] args) {
        while(true) {
            System.out.println("\n===== EMPLOYEE MENU =====");
            System.out.println("1. Comparable (Sort + Delete)");
            System.out.println("2. Comparator (Sort + Delete)");
            System.out.println("0. Exit");

            try {
                System.out.print("Enter choice: ");
                if(!sc.hasNextInt()) {
                    sc.next();
                    throw new InputException("Enter number only (0-2)");
                }

                int ch = sc.nextInt();

                switch(ch) {
                    case 1 -> comparableOperation();
                    case 2 -> comparatorOperation();
                    case 0 -> { 
                        System.out.println("Exit..."); 
                        return; 
                    }
                    default -> System.out.println("Choose between 0-2 only");
                }

            } catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

