package assignment3;


import java.io.*;

class p5 {
    public static void main(String[] args) {
        // Writing employee records
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt"))) {
            writer.write("101, John, 55000");
            writer.newLine();
            writer.write("102, Alice, 60000");
            System.out.println("Employee records saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading with try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            System.out.println("Reading employee records:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
