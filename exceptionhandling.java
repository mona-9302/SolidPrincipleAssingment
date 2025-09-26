/*class Parent{
	float salary=40000;
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println("Child bonus:"+c.bonus);
		System.out.println("Parent salary:"+c.salary);


		
	}
}
class Child extends Employee{
	int bonus=10000;

}*/

/*class Animal{
	void eat (){
		System.out.println("Animal");
	}
} 

class Dog extends Animal{
	void bark(){
		System.out.println("dog ");
	}
}
class Cat extends Dog{
	void miyao(){
		System.out.println("miyao");
	}
	public static void main(String[] args) {
		  Cat c=new Cat();
		  c.miyao();
		
	}
}*/

/*class Test{
	int roll,salary;
	String name;
	Test(int roll,String name,int salary){
		this.roll=roll;
		this.name=name;
		this.salary=salary;
	}
	void Show(){
		System.out.println(roll+" "+name+" "+salary);
	}
}
class Demo{
	public static void main(String[] args) {
		Test t=new Test(111,"monika",101);
		t.Show();

	}
}*/

class Test{
	void m1(Test t){
		System.out.println("monika");
	}
	void m2(){
		 m1(this);
	}
}
class Demo{
	public static void main(String[] args) {
		Test t=new Test();
		t.m2();
		
	}
}


