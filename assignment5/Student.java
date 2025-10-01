import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) { super(message); }
}

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) { super(message); }
}

class DuplicateIdFoundException extends Exception{
    public DuplicateIdFoundException(String message){super(message);}
}
class Student {
    private int id;
    private String name;
    private ClassData classData;
    private double marks;
    private String gender;
    private int age;
    private String city;
    private int pincode;
    private String result;

    public static final String STUDENT_FILE = "students.txt";
    public static final String TOP5_FILE = "top5.txt";

    public Student(int id, String name, ClassData classData, double marks, String gender, int age, String city, int pincode) {
        this.id = id;
        this.name = name;
        this.classData = classData;
        this.marks = marks;
        this.gender = gender;
        this.age = age;
        this.city = city;
        this.pincode = pincode;
        this.result = marks >= 50 ? "Pass" : "Fail";
    }

    public int getId() { return id; }
    public double getMarks() { return marks; }
    public String getName() { return name; }
    public ClassData getClassData() { return classData; }
    public String getResult() { return result; }

    public String toCSV() {
        return id + "," + name + "," + classData.getId() + "," + marks + "," + gender + "," + age + "," + city + "," + pincode + "," + result;
    }

 
    public String toString() {
        return id + " | " + name + " | Class: " + classData.getName() + " | Marks: " + marks + " | Age: " + age + " | City: " + city + " | " + result;
    }

    
    public static List<Student> readStudents(List<ClassData> classes) {
        List<Student> list = new ArrayList<>();
        File file = new File(STUDENT_FILE);
        if (!file.exists()) return list;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(",");
                int cid = Integer.parseInt(p[2]);
                ClassData c = classes.stream().filter(x -> x.getId() == cid).findFirst().orElse(null);
                if (c != null) {
                    list.add(new Student(
                        Integer.parseInt(p[0]), p[1], c,
                        Double.parseDouble(p[3]), p[4],
                        Integer.parseInt(p[5]), p[6], Integer.parseInt(p[7])
                    ));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading student file.");
        }
        return list;
    }

    public static void saveStudents(List<Student> students) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(STUDENT_FILE))) {
            for (Student s : students) {
                bw.write(s.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving student file.");
        }
    }

    public static void saveTop5(List<Student> students) {
        List<Student> top5 = students.stream()
                .sorted(Comparator.comparingDouble(Student::getMarks).reversed())
                .limit(5)
                .collect(Collectors.toList());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(TOP5_FILE))) {
            bw.write("ID,Name,Marks,Rank");
            bw.newLine();
            int rank = 1;
            for (Student s : top5) {
                bw.write(s.getId() + "," + s.getName() + "," + s.getMarks() + "," + rank++);
                bw.newLine();
            }
            System.out.println("Top 5 students saved in " + TOP5_FILE);
        } catch (IOException e) {
            System.out.println("Error saving top 5 file.");
        }
    }

    public static void printTop5FromFile() {
    File file = new File(Student.TOP5_FILE);

    if (!file.exists()) {
        System.out.println("Top 5 file not found!");
        return;
    }

    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        boolean firstLine = true; // Skip header
        System.out.println("===== TOP 5 STUDENTS =====");
        while ((line = br.readLine()) != null) {
            if (firstLine) {
                firstLine = false;
                continue;
            }
            String[] parts = line.split(",");
            // parts[0] = ID, parts[1] = Name, parts[2] = Marks, parts[3] = Rank
            System.out.println("ID: " + parts[0] + ", Name: " + parts[1] + ", Marks: " + parts[2] + ", Rank: " + parts[3]);
        }
    } catch (IOException e) {
        System.out.println("Error reading top 5 file.");
        e.printStackTrace();
    }
}


}


class Operation {

    public static void addStudent(Scanner sc, List<Student> students, List<ClassData> classes, List<Address> addresses) {
    try {
        System.out.print("Enter ID: ");
        int id = sc.nextInt(); sc.nextLine();

        // Check for duplicate ID
        boolean exists = students.stream().anyMatch(s -> s.getId() == id);
        if (exists) {
            System.out.println("Student ID already exists! Cannot add duplicate.");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt(); sc.nextLine();
        if (age > 20) throw new InvalidAgeException("Age cannot be greater than 20!");

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble(); sc.nextLine();
        if (marks < 0 || marks > 100) throw new InvalidMarksException("Marks must be between 0 and 100!");

        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();

        System.out.println("Available Classes:");
        classes.forEach(System.out::println);

        System.out.print("Enter Class ID: ");
        int classId = sc.nextInt(); sc.nextLine();

        ClassData selectedClass = classes.stream().filter(c -> c.getId() == classId).findFirst().orElse(null);
        if (selectedClass == null) {
            System.out.println("Invalid class ID!");
            return;
        }

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter Pincode: ");
        int pincode = sc.nextInt(); sc.nextLine();

        Student s = new Student(id, name, selectedClass, marks, gender, age, city, pincode);
        students.add(s);
        addresses.add(new Address(addresses.size() + 1, city, pincode, id));
        System.out.println("Student added successfully!");

    } catch (InvalidAgeException | InvalidMarksException e) {
        System.out.println(e.getMessage());
    } catch (InputMismatchException e) {
        System.out.println("Invalid input type!");
        sc.nextLine();
    }
}

    public static void viewStudents(List<Student> students) {
        if (students.isEmpty()) System.out.println("No student records!");
        else students.forEach(System.out::println);
    }

    public static void deleteStudent(Scanner sc, List<Student> students, List<Address> addresses) {
        try {
            System.out.print("Enter student ID to delete: ");
            int id = sc.nextInt(); sc.nextLine();

            boolean removed = students.removeIf(s -> s.getId() == id);
            addresses.removeIf(a -> a.toCSV().endsWith("," + id));

            if (removed) System.out.println("Student deleted.");
            else System.out.println("Student not found!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            sc.nextLine();
        }
    }

    public static void saveAll(List<Student> students, List<ClassData> classes, List<Address> addresses) {
        Student.saveStudents(students);
        ClassData.saveClasses(classes);
        Address.saveAddresses(addresses);
        System.out.println("All data saved to files.");
    }
}



class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<ClassData> classes = ClassData.readClasses();
        List<Student> students = Student.readStudents(classes);
        List<Address> addresses = Address.readAddresses();
       
        System.out.println("========> class data available <=========");
        for(ClassData cls : classes){
            System.out.println(cls);
    }
        if (classes.isEmpty()) {
            classes.add(new ClassData(1, "A"));
            classes.add(new ClassData(2, "B"));
            classes.add(new ClassData(3, "C"));
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Save All Files");
            System.out.println("5. Show Top 5 Students");
            System.out.println("6. Read Top5 students");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> Operation.addStudent(sc, students, classes, addresses);
                    case 2 -> Operation.viewStudents(students);
                    case 3 -> Operation.deleteStudent(sc, students, addresses);
                    case 4 -> Operation.saveAll(students, classes, addresses);
                    case 5 -> Student.saveTop5(students);
                    case 6 -> Student.printTop5FromFile();

                    case 0 -> exit = true;
                    default -> System.out.println("Invalid choice!");
               }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
