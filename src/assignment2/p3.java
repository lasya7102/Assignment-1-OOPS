package assignment2;


//Base class
class Vehicle {
 String brand = "Generic Vehicle";

 void displayDetails() {
     System.out.println("This is a vehicle of brand: " + brand);
 }
}

//Derived class
class Car extends Vehicle {
 String model = "Sedan";

 @Override
 void displayDetails() {
     System.out.println("This is a Car. Brand: " + brand + ", Model: " + model);
 }
}

public class p3 {
 public static void main(String[] args) {
     Car car = new Car();
     car.displayDetails();
 }
}
