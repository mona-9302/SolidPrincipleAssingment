import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Class{

	 private int id;
	 private String name;

	 public Class(int id,String name){
	 	 this.id = id;
	 	 this.name = name;
	 }

	 public int getId(){
	 	return id;
	 }

	 public String getName(){
	 	return name;
	 }

	 public void setId(int id){
	 	this.id = id;
	 }

	 public void setName(String name){
	 	this.name = name;
	 }

	 public String toString(){
	 	return id+" "+name;
	 }
}

class Student {

    private int id;
    private String name;
    private Class class_id;
    private double marks;
    private String gender;
    private int age;
    private int rank;
    private String result;
    private String city;
    private int pincode;

    public Student(int id, String name, Class class_id, double marks, String gender, int age) {
        this.id = id;
        this.name = name;
        this.class_id = class_id;
        this.marks = marks;
        this.gender = gender;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
    	return id;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setCity(String city) {  // Fixed: added parameter
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setPincode(int pincode) {  // Fixed: added parameter
        this.pincode = pincode;
    }

    public int getPinCode() {
        return pincode;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }   

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClassId(Class class_id) {
        this.class_id = class_id;
    }

    public Class getClassId() {
        return class_id;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + class_id + " " + marks + " " + gender + " " + age + " " + city + " " + pincode + " " + result + " Rank:" + rank;
    }
}


class Address{

	 private int id;
	 private int pin_code;
	 private String city;
	 private  Student student_id;


	 public Address(int id,int pin_code,String city,Student student_id){
	 	this.id = id;
	 	this.pin_code = pin_code;
	 	this.city = city;
	 	this.student_id = student_id;
	 }

	 public void setId(int id){
	 	this.id = id;
	 }

	 public void setPinCode(int pin_code){
	 	this.pin_code = pin_code;
	 }

	 public void setCity(String city){
	 	this.city = city;
	 }

	 public void setStudentId(Student student_id){
	 	this.student_id = student_id;
	 }

	 public int getId(){
	 	return id;
	 }

	 public int getPinCode(){
	 	return pin_code;
	 }

	 public String getCity(){
	 	return city;
	 }

	 public Student getStudentId(){
	 	return student_id;
	 }

	 public String toString(){
	 	return id+" "+pin_code+" "+city+" "+student_id;
	 }
}


class TestStudentData {


    public static List<Student> getPaginatedStudents(List<Student> students, String gender, Integer age, String className,
                                                     String city, Integer pincode, String orderBy, int startIndex, int endIndex) {
        List<Student> filtered = students.stream()
            .filter(s -> (gender == null || s.getGender().equalsIgnoreCase(gender)))
            .filter(s -> (age == null || s.getAge() == age))
            .filter(s -> (className == null || s.getClassId().getName().equalsIgnoreCase(className)))
            .filter(s -> (city == null || s.getCity().equalsIgnoreCase(city)))
            .filter(s -> (pincode == null || s.getPinCode() == pincode))
            .collect(Collectors.toList());

        if(orderBy != null) {
            if(orderBy.equalsIgnoreCase("name")) filtered.sort(Comparator.comparing(Student::getName));
            else if(orderBy.equalsIgnoreCase("marks")) filtered.sort(Comparator.comparingDouble(Student::getMarks).reversed());
        }

        int fromIndex = Math.max(startIndex - 1, 0);
        int toIndex = Math.min(endIndex, filtered.size());
        if(fromIndex >= filtered.size()) return new ArrayList<>();
        return filtered.subList(fromIndex, toIndex);
    }

   
    public static void addStudent(Scanner sc, List<Student> students, List<Class> cls, List<Address> address) {
        System.out.println("\nEnter student id:");
        int stdId = sc.nextInt(); sc.nextLine();

        System.out.println("Enter student name:");
        String name = sc.nextLine();

        System.out.println("Enter class id from available classes:");
        int classId = sc.nextInt(); sc.nextLine();

        Class selectedClass = cls.stream().filter(c -> c.getId() == classId).findFirst().orElse(null);
        if(selectedClass == null) { System.out.println("Invalid Class ID."); return; }

        System.out.println("Enter marks (0-100):");
        double marks = sc.nextDouble(); sc.nextLine();

        System.out.println("Enter gender (M/F):");
        String gender = sc.nextLine();

        System.out.println("Enter age:");
        int age = sc.nextInt(); sc.nextLine();

        System.out.println("Enter city:");
        String city = sc.nextLine();

        System.out.println("Enter pincode:");
        int pincode = sc.nextInt(); sc.nextLine();

        Student s = new Student(stdId, name, selectedClass, marks, gender, age);
        s.setCity(city); s.setPincode(pincode); s.setResult(marks >= 50 ? "Pass" : "Fail");

        students.add(s);
        address.add(new Address(address.size() + 1, pincode, city, s));

        System.out.println("Student added successfully!");
    }

   
    public static void viewStudents(List<Student> students) {
        System.out.println("\nAll Students:");
        students.forEach(System.out::println);
    }

    
    public static void findStudentByPincode(List<Address> address, int pincode) {
        System.out.println("\nStudents with Pincode: " + pincode);
        for(Address add : address) {
            if(add.getPinCode() == pincode) System.out.println(add.getStudentId());
        }
    }

  
    public static void findStudentByCity(List<Address> address, String city) {
        System.out.println("\nStudents in City: " + city);
        for(Address add : address) {
            if(add.getCity().equalsIgnoreCase(city)) System.out.println(add.getStudentId());
        }
    }

   
    public static void findStudentByClass(List<Student> students, String className) {
        System.out.println("\nStudents in Class: " + className);
        for(Student s : students) {
            if(s.getClassId().getName().equalsIgnoreCase(className)) System.out.println(s);
        }
    }

    
    public static void getPassedStudents(List<Student> students) {
        System.out.println("\nPassed Students:");
        students.stream().filter(s -> s.getResult().equalsIgnoreCase("Pass")).forEach(System.out::println);
    }

  
    public static void getFailedStudents(List<Student> students) {
        System.out.println("\nFailed Students:");
        students.stream().filter(s -> s.getResult().equalsIgnoreCase("Fail")).forEach(System.out::println);
    }

    
    public static void deleteStudent(List<Student> students, List<Address> address, List<Class> classes, int studentId) {
        students.removeIf(s -> s.getId() == studentId);
        address.removeIf(a -> a.getStudentId().getId() == studentId);
        classes.removeIf(c -> students.stream().noneMatch(s -> s.getClassId().getId() == c.getId()));
        System.out.println("Student deleted successfully!");
    }

    public static void findStudentByRank(List<Student> students, int rank) {
    // Sort students by marks descending
    List<Student> sorted = students.stream()
                                   .sorted(Comparator.comparingDouble(Student::getMarks).reversed())
                                   .collect(Collectors.toList());

    if(rank <= 0 || rank > sorted.size()) {
        System.out.println("Invalid rank. Rank should be between 1 and " + sorted.size());
        return;
    }

    Student s = sorted.get(rank - 1); // rank 1 = index 0
    System.out.println("Student with rank " + rank + ": " + s);
}

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        List<Class> cls = new ArrayList<>();
        List<Address> address = new ArrayList<>();

        // Sample Classes
        cls.add(new Class(1, "A"));
        cls.add(new Class(2, "B"));
        cls.add(new Class(3, "C"));
        cls.add(new Class(4, "D"));

        boolean exit = false;

        while(!exit) {


            System.out.println("\n============Available Classes==============");
            for(Class classData : cls){
                System.out.println(classData);
            }

            System.out.println("\n========= Student Management Menu =========");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Find Students by Pincode");
            System.out.println("4. Find Students by City");
            System.out.println("5. Find Students by Class");
            System.out.println("6. Find Students by Rank");
            System.out.println("7. Get Passed Students");
            System.out.println("8. Get Failed Students");
            System.out.println("9. Paginated Students");
            System.out.println("10. Delete Student");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt(); sc.nextLine();

            switch(choice) {
                case 1: addStudent(sc, students, cls, address); 
                        break;

                case 2: viewStudents(students);
                        break;

                case 3:
                    System.out.println("Enter pincode:");
                    int p = sc.nextInt(); sc.nextLine();
                    findStudentByPincode(address, p); 
                    break;

                case 4:
                    System.out.println("Enter city:");
                    String city = sc.nextLine();
                    findStudentByCity(address, city); 
                    break;

                case 5:
                    System.out.println("Enter class name:");
                    String className = sc.nextLine();
                    findStudentByClass(students, className); 
                    break;
                
                case 6:
                    System.out.println("Enter Student Rank");
                    int rank = sc.nextInt();
                    findStudentByRank(students,rank);
                    break;

                case 7: getPassedStudents(students); 
                        break;

                case 8: getFailedStudents(students); 
                        break;

                case 9:
                    System.out.println("Enter gender filter (M/F or blank):");
                    String g = sc.nextLine(); if(g.isEmpty()) g=null;

                    System.out.println("Enter class name filter (or blank):");
                    String cName = sc.nextLine(); if(cName.isEmpty()) cName=null;

                    System.out.println("Enter city filter (or blank):");
                    String cityFilter = sc.nextLine(); if(cityFilter.isEmpty()) cityFilter=null;

                    System.out.println("Enter pincode filter (or blank):");
                    String pinInput = sc.nextLine(); Integer pin = pinInput.isEmpty()?null:Integer.parseInt(pinInput);

                    System.out.println("Enter orderBy (name/marks or blank):");
                    String orderBy = sc.nextLine(); if(orderBy.isEmpty()) orderBy=null;

                    System.out.println("Enter start index:");
                    int start = sc.nextInt();
                    System.out.println("Enter end index:");
                    int end = sc.nextInt(); sc.nextLine();

                    List<Student> paginated = getPaginatedStudents(students, g, null, cName, cityFilter, pin, orderBy, start, end);
                    System.out.println("\nPaginated Students:");
                    paginated.forEach(System.out::println);
                    break;


                case 10:
                    System.out.println("Enter student ID to delete:");
                    int delId = sc.nextInt(); sc.nextLine();
                    deleteStudent(students, address, cls, delId);
                    break;


                case 11: exit = true; System.out.println("Exiting program. Goodbye!"); 
                         break;

                default: System.out.println("Invalid choice. Try again."); 
                         break;
            }
        }
    }
}
