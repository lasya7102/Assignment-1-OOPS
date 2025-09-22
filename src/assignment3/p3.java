package assignment3;


import java.io.*;

class Employee implements Serializable {
    String name;
    int id;
    double salary;
    transient String password;

    Employee(String name, int id, double salary, String password) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.password = password;
    }

    public void display() {
        System.out.println("Employee [Name=" + name + ", ID=" + id + ", Salary=" + salary + ", Password=" + password + "]");
    }
}

class p3 {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 101, 55000.0, "secret123");

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(emp);
            System.out.println("Employee object serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee empRestored = (Employee) ois.readObject();
            System.out.println("Employee object deserialized:");
            empRestored.display(); // Password will be null
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
