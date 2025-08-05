package assignment;





public class prob4 {
    public static void main(String[] args) {
      
        String name1 = "Alice";
        String name2 = "Alice";

               String name3 = new String("Alice");

              String name4 = "alice";

        System.out.println("== comparison:");
        System.out.println("name1 == name2: " + (name1 == name2)); 
        System.out.println("name1 == name3: " + (name1 == name3));   

        System.out.println("\n.equals() comparison:");
        System.out.println("name1.equals(name2): " + name1.equals(name2));   
        System.out.println("name1.equals(name3): " + name1.equals(name3));   
        System.out.println("name1.equals(name4): " + name1.equals(name4));   
        System.out.println("\n.equalsIgnoreCase() comparison:");
        System.out.println("name1.equalsIgnoreCase(name4): " + name1.equalsIgnoreCase(name4));  
    }
}