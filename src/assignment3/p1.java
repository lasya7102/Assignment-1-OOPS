package assignment3;


class p1 {
    public static void main(String[] args) {
        String dbConnection = null; // Simulating database connection

        try {
            System.out.println("Opening database connection...");
            dbConnection = "Connected";

            try {
                int balance = 5000;
                int withdrawAmount = 0; // risky value

                // ArithmeticException possible here
                int perPersonShare = balance / withdrawAmount; 
                System.out.println("Share: " + perPersonShare);

                // NullPointerException simulation
                String accountHolder = null;
                System.out.println(accountHolder.length());

            } catch (ArithmeticException ae) {
                System.out.println("Error: Division by zero - " + ae.getMessage());
            } catch (NullPointerException ne) {
                System.out.println("Error: Null reference - " + ne.getMessage());
            } finally {
                System.out.println("Inner finally: Transaction completed (success or failure).");
            }

        } catch (Exception e) {
            System.out.println("Outer catch: " + e.getMessage());
        } finally {
            System.out.println("Closing database connection...");
            dbConnection = null;
        }
    }
}
