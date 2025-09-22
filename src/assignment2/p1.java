package assignment2;


//Flyable interface
interface Flyable {
 void fly();
}

//Swimmable interface
interface Swimmable {
 void swim();
}

//Bird class implements both interfaces
class Bird implements Flyable, Swimmable {
 public void fly() {
     System.out.println("The bird is flying high in the sky.");
 }

 public void swim() {
     System.out.println("The bird is swimming in the water.");
 }
}

public class p1 {
 public static void main(String[] args) {
     Bird bird = new Bird();
     bird.fly();
     bird.swim();
 }
}
