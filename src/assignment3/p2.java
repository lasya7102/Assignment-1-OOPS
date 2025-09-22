package assignment3;


//Custom Exception
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

class p2 {
 static void registerVoter(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age must be 18 or above to register!");
     } else {
         System.out.println("Voter registered successfully.");
     }
 }

 public static void main(String[] args) {
     try {
         registerVoter(16); // Input age = 16
     } catch (InvalidAgeException e) {
         System.out.println("Registration failed: " + e.getMessage());
     }

     try {
         registerVoter(20); // Input age = 20
     } catch (InvalidAgeException e) {
         System.out.println("Registration failed: " + e.getMessage());
     }
 }
}
