package assignment2;


//Base class
class Person {
 String name;
 int age;

 Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 void display() {
     System.out.println("Person: " + name + ", Age: " + age);
 }
}

//Derived class
class Employee extends Person {
 String department;

 Employee(String name, int age, String department) {
     super(name, age);
     this.department = department;
 }

 @Override
 void display() {
     super.display();
     System.out.println("Employee Department: " + department);
 }
}

//Further derived class
class Manager extends Employee {
 int teamSize;

 Manager(String name, int age, String department, int teamSize) {
     super(name, age, department);
     this.teamSize = teamSize;
 }

 @Override
 void display() {
     super.display();
     System.out.println("Manager of Team Size: " + teamSize);
 }
}

public class p2 {
 public static void main(String[] args) {
     Manager manager = new Manager("Alice", 40, "IT", 10);
     manager.display();
 }
}
