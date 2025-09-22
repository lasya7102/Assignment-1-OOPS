package assignment2;


//Interface 1
interface Switchable {
 void turnOn();
}

//Interface 2
interface TimerOperated {
 void setTimer(int minutes);
}

//SmartFan implements both
class SmartFan implements Switchable, TimerOperated {
 public void turnOn() {
     System.out.println("SmartFan is now ON.");
 }

 public void setTimer(int minutes) {
     System.out.println("SmartFan will turn off automatically after " + minutes + " minutes.");
 }
}

public class p4 {
 public static void main(String[] args) {
     SmartFan fan = new SmartFan();
     fan.turnOn();
     fan.setTimer(30);
 }
}
