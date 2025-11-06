import java.util.*;
import java.util.stream.Collectors;

class InputException extends Exception {
    public InputException(String msg){
        super(msg);
    }
}

class StudentClass {
    private int id;
    private String name;

    public StudentClass(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){ return id; }
    public String getName(){ return name; }

    public String toString(){ return id + " " + name; }
}

class Student {
    private int id;
    private String name;
    private StudentClass classId;
    private double marks;
    private String gender;
    private int age;
    private int rank;
    private String result;
    private String city;
    private int pincode;

    public Student(int id, String name, StudentClass classId, double marks, String gender, int age) {
        this.id = id;
        this.name = name;
        this.classId = classId;
        this.marks = marks;
        this.gender = gender;
        this.age = age;
    }

    public int getId(){ return id; }
    public String getName(){ return name; }
    public StudentClass getClassId(){ return classId; }
    public double getMarks(){ return marks; }
    public String getGender(){ return gender; }
    public int getAge(){ return age; }
    public String getCity(){ return city; }
    public int getPinCode(){ return pincode; }
    public String getResult(){ return result; }
    public int getRank(){ return rank; }

    public void setCity(String city){ this.city = city; }
    public void setPincode(int pincode){ this.pincode = pincode; }
    public void setResult(String result){ this.result = result; }
    public void setRank(int rank){ this.rank = rank; }

    public String toString(){
        return id+" "+name+" Class:"+classId.getName()+" Marks:"+marks+" "+gender+
               " Age:"+age+" City:"+city+" Pin:"+pincode+" Result:"+result+" Rank:"+rank;
    }
}

class Address {
    private int id;
    private int pinCode;
    private String city;
    private Student student;

    public Address(int id, int pinCode, String city, Student student){
        this.id = id;
        this.pinCode = pinCode;
        this.city = city;
        this.student = student;
    }

    public int getPinCode(){ return pinCode; }
    public String getCity(){ return city; }
    public Student getStudent(){ return student; }
}

class TestStudentData {

    static Scanner sc = new Scanner(System.in);

    static int inputInt(String msg) {
        while(true){
            try{
                System.out.print(msg);
                if(!sc.hasNextInt()){ sc.next(); throw new InputException("Enter valid integer."); }
                int v = sc.nextInt();
                if(v <= 0) throw new InputException("Value must be > 0");
                return v;
            } catch(Exception e){ System.out.println("Error: " + e.getMessage()); }
        }
    }

    static double inputMarks() {
        while(true){
            try {
                System.out.print("Enter Marks (0-100): ");
                if(!sc.hasNextDouble()){ sc.next(); throw new InputException("Enter valid marks."); }
                double m = sc.nextDouble();
                if(m < 0 || m > 100) throw new InputException("Marks must be between 0-100");
                return m;
            } catch(Exception e){ System.out.println("Error: "+e.getMessage()); }
        }
    }

    static String inputName(String msg) {
        while(true){
            try {
                System.out.print(msg);
                String s = sc.next();
                if(!s.matches("[a-zA-Z]+")) throw new InputException("Only alphabets allowed.");
                return s;
            } catch(Exception e){ System.out.println("Error: "+e.getMessage()); }
        }
    }

    static String inputGender() {
        while(true){
            System.out.print("Enter Gender (M/F): ");
            String gender = sc.next();
            if(gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")) return gender;
            System.out.println("Invalid gender! Enter only M or F.");
        }
    }

    static int inputPincode() {
        while(true){
            try{
                System.out.print("Enter 6 digit Pincode: ");
                if(!sc.hasNextInt()){ sc.next(); throw new InputException("Digits only."); }
                int pincode = sc.nextInt();
                if(pincode < 100000 || pincode > 999999) throw new InputException("Pincode must be 6 digits.");
                return pincode;
            } catch(Exception e){ System.out.println("Error: "+e.getMessage()); }
        }
    }

    static void addStudent(List<Student> students, List<StudentClass> classes, List<Address> addressList) {

        int id = inputInt("Enter Student ID: ");
        String name = inputName("Enter Name: ");

        System.out.println("Available Classes:");
        classes.forEach(System.out::println);

        int classId = inputInt("Enter Class ID: ");

        StudentClass studentClass = null;
        for(StudentClass c : classes){
            if(c.getId() == classId){
                studentClass = c;
                break;
            }
        }

        if(studentClass == null){
            System.out.println("Invalid Class ID!");
            return;
        }

        double marks = inputMarks();
        String gender = inputGender();
        int age = inputInt("Enter Age: ");

        System.out.print("Enter City: ");
        String city = sc.next();

        int pin = inputPincode();

        Student s = new Student(id, name, studentClass, marks, gender, age);
        s.setCity(city);
        s.setPincode(pin);
        s.setResult(marks >= 50 ? "Pass" : "Fail");

        students.add(s);
        addressList.add(new Address(addressList.size()+1, pin, city, s));

        System.out.println("Student Added Successfully!");
    }

    
    static List<Student> paginate(List<Student> students, String gender, String className, String city, Integer pincode, String orderBy, int start, int end){

        List<Student> temp = new ArrayList<>();

        for(Student s : students){
            if(gender!=null && !s.getGender().equalsIgnoreCase(gender)) continue;
            if(className!=null && !s.getClassId().getName().equalsIgnoreCase(className)) continue;
            if(city!=null && !s.getCity().equalsIgnoreCase(city)) continue;
            if(pincode!=null && s.getPinCode()!=pincode) continue;
            temp.add(s);
        }

        if(orderBy!=null){
            for(int i=0;i<temp.size()-1;i++){
                for(int j=i+1;j<temp.size();j++){
                    if(orderBy.equalsIgnoreCase("name")){
                        if(temp.get(i).getName().compareTo(temp.get(j).getName()) > 0){
                            Student t = temp.get(i);
                            temp.set(i,temp.get(j));
                            temp.set(j,t);
                        }
                    } else if(orderBy.equalsIgnoreCase("marks")){
                        if(temp.get(i).getMarks() < temp.get(j).getMarks()){
                            Student t = temp.get(i);
                            temp.set(i,temp.get(j));
                            temp.set(j,t);
                        }
                    }
                }
            }
        }

        List<Student> result = new ArrayList<>();
        for(int i = start-1; i < end && i < temp.size(); i++){
            if(i >= 0) result.add(temp.get(i));
        }

        return result;
    }

    static void paginationMenu(List<Student> students){

        System.out.print("Filter Gender (M/F or blank): ");
        String g = sc.next();
        if(g.equalsIgnoreCase("blank")) g = null;

        System.out.print("Filter Class (A/B/C/D or blank): ");
        String c = sc.next();
        if(c.equalsIgnoreCase("blank")) c = null;

        System.out.print("Filter City (or blank): ");
        String city = sc.next();
        if(city.equalsIgnoreCase("blank")) city = null;

        System.out.print("Filter Pincode (or 0): ");
        int pin = sc.nextInt();
        Integer p = (pin==0) ? null : pin;

        System.out.print("Order by (name/marks or blank): ");
        String order = sc.next();
        if(order.equalsIgnoreCase("blank")) order = null;

        int start = inputInt("Start Index: ");
        int end   = inputInt("End Index: ");

        List<Student> res = paginate(students,g,c,city,p,order,start,end);

        System.out.println("\nPaginated Students:");
        res.forEach(System.out::println);
    }

    static void viewStudents(List<Student> students){
        System.out.println("\n==== All Students ====");
        students.forEach(System.out::println);
    }

    static void findByPincode(List<Address> address){
        int pin = inputPincode();
        boolean found = false;

        for(Address a : address){
            if(a.getPinCode()==pin){
                System.out.println(a.getStudent());
                found = true;
            }
        }

        if(!found) System.out.println("No student found with this pincode.");
    }

    static void findByCity(List<Address> address){
        System.out.print("Enter City: ");
        String city = sc.next();
        boolean found = false;
        for(Address a : address){
            if(a.getCity().equalsIgnoreCase(city)){
                System.out.println(a.getStudent());
                found = true;
            }
        }
        if(!found) System.out.println("No student found in this city.");
    }

    static void findByClass(List<Student> students){
        System.out.print("Enter Class Name: ");
        String c = sc.next();
        boolean found = false;
        for(Student s : students){
            if(s.getClassId().getName().equalsIgnoreCase(c)){
                System.out.println(s);
                found = true;
            }
        }
        if(!found) System.out.println("No student in this class.");
    }

    static void findByRank(List<Student> students){
        int rank = inputInt("Enter Rank: ");

        List<Student> sorted = students.stream()
                .sorted(Comparator.comparingDouble(Student::getMarks).reversed())
                .collect(Collectors.toList());

        if(rank > sorted.size()){
            System.out.println("Invalid rank!");
            return;
        }

        System.out.println("Rank "+rank+" -> "+sorted.get(rank-1));
    }

    static void deleteStudent(List<Student> students, List<Address> address){
        int id = inputInt("Enter Student ID to delete: ");

        boolean exist = false;
        for(Student s : students){
            if(s.getId()==id){
                exist = true;
                break;
            }
        }

        if(!exist){
            System.out.println("Student ID not found!");
            return;
        }

        students.removeIf(s -> s.getId()==id);
        address.removeIf(a -> a.getStudent().getId()==id);

        System.out.println("Student Deleted!");
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        List<StudentClass> classes = Arrays.asList(
                new StudentClass(1,"A"),
                new StudentClass(2,"B"),
                new StudentClass(3,"C"),
                new StudentClass(4,"D")
        );
        List<Address> addressList = new ArrayList<>();

        while(true) {

            System.out.println("\n===== STUDENT MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search by Pincode");
            System.out.println("4. Search by City");
            System.out.println("5. Search by Class");
            System.out.println("6. Search by Rank");
            System.out.println("7. Delete Student");
            System.out.println("8. Paginated Students");
            System.out.println("9. Exit");

            int choice = inputInt("Enter choice: ");

            switch(choice) {
                case 1 -> addStudent(students, classes, addressList);
                case 2 -> viewStudents(students);
                case 3 -> findByPincode(addressList);
                case 4 -> findByCity(addressList);
                case 5 -> findByClass(students);
                case 6 -> findByRank(students);
                case 7 -> deleteStudent(students, addressList);
                case 8 -> paginationMenu(students);
                case 9 -> { System.out.println("Thank you!"); return; }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
