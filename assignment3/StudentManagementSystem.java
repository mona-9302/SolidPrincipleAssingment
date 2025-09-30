import java.util.*;
import java.util.List;
import java.util.Scanner;
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

class Student{

	 private int id;
	 private String name;
	 private Class class_id;
	 private double marks;
	 private String gender;
	 private int age;

	 public Student(int id,String namme,Class class_id,double marks,String gender,int age){
	 	   this.id  = id;
	 	   this.name = name;
	 	   this.class_id = class_id;
	 	   this.marks = marks;
	 	   this.gender = gender;
	 	   this.age = age;
	 }

	 public void setId(int id){
	 	 this.id = id;
	 }

     public void setName(String name){
     	this.name = name;
     }

	 public void setClassId(Class class_id){
	 	 this.class_id = class_id;
	 }

    public void setMarks(double marks){
    	this.marks = marks;
    }

    public void setGender(String gender){
    	this.gender = gender;
    }

    public void setAge(int age){
    	this.age = age;
    }

    public int getId(){
	 	  return id;
	 }

     public String getName(){
     	return name;
     }

	 public Class getClassId(){
	 	return class_id;
	 }

    public double getMarks(){
    	return marks;
    }

    public String getGender(){
    	return gender;
    }

    public int getAge(){
    	return age;
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


class TestStudentData{

	public static void main(String[] args) {
	   
	    Scanner sc = new Scanner(System.in);
        List<Student> std = new ArrayList<>();
        List<Class>cls = new  ArrayList<>();
        List<Address> address = new ArrayList<>();

        cls.add(new Class(1,"A"));
        cls.add(new Class(2,"B"));
        cls.add(new Class(3,"C"));
        cls.add(new Class(4,"D"));
        cls.add(new Class(5,"E"));
        cls.add(new Class(6,"F"));

        System.out.println("class data available");
        for(Class c : cls){

            System.out.println(c);
        }
        
        System.out.println("Enter student id");
        int stdId = sc.nextInt();

        System.out.println("Enter student name");
        String name = sc.nextLine();
        sc.nextLine();

        System.out.println("Enter id from above list");
        int classId = sc.nextInt();

        System.out.println("Enter  marks");
        double marks = sc.nextDouble();

        System.out.println("Enter student gender");
        String gender = sc.nextLine();

        System.out.println("Enter student age");
        int age = sc.nextInt();

        Class selectedClass = null;
        for (Class c : cls) {
            if (c.getId() == classId) {
                selectedClass = c;
                break;
            }
        }

        if (selectedClass == null) {
            System.out.println("Invalid Class ID  Student not added.");
            return;
        }

      
        Student s = new Student(stdId, name, selectedClass, marks, gender, age);
        std.add(s);

        
        System.out.println("\nStudent Added Successfully:");
        for (Student st : std) {
            System.out.println(st);
        }
    }
	
}