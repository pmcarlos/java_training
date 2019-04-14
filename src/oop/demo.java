package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	void eat(){
		System.out.println(name + " is eating");
	}
	void sleep(){
		System.out.println(name + " is sleeping");
	}
}
public class demo {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "JOe";
		person1.email = "email@email.com";
		
		person1.walk();
		person1.sleep();
		person1.eat();
		

	}

}
