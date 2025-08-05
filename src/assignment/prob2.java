package assignment;


import java.util.*;

public class prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int NumOfStud = sc.nextInt();
        System.out.println("Enter the number of subjects: ");
        int NumOfSub = sc.nextInt();

        String[] students = new String[NumOfStud];
        int[][] marks = new int[NumOfStud][NumOfSub];

        // Input section
        for (int i = 0; i < NumOfStud; i++) {
            System.out.println("\nEnter the name of student " + (i + 1) + ": ");
            students[i] = sc.next();
            for (int j = 0; j < NumOfSub; j++) {
                System.out.print("Enter the marks of subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Output passed students
        System.out.println("\nStudents who passed all subjects:");
        boolean anyPassed = false;

        for (int i = 0; i < NumOfStud; i++) {
            boolean passedAll = true; // 👈 Moved inside loop

            for (int j = 0; j < NumOfSub; j++) {
                if (marks[i][j] < 35) {
                    passedAll = false;
                    break;
                }
            }

            if (passedAll) {
                System.out.println("- " + students[i]);
                anyPassed = true;
            }
        }

        if (!anyPassed) {
            System.out.println("No student passed all subjects.");
        }

        sc.close();
    }
}
