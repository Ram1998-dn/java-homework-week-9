package Week9homework;

import java.util.Scanner;

public class Programme_2_MarkSheet {

    public static int inputMarks(Scanner scanner, String subject) {
        int marks;
        while (true) {
            System.out.print("Enter marks for " + subject + " (0 to 100): ");
            marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100) {
                break; // valid marks
            } else {
                System.out.println("Invalid Input, Marks should be between 0 to 100.");
            }
        }
        return marks;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int rollNo;
        int mathMarks, scienceMarks, englishMarks;

        // Input student details
        System.out.println("Enter Student Name :");
        name = scanner.nextLine();

        System.out.println("Enter roll number :");
        rollNo = scanner.nextInt();


        // Input marks for each subject with validation
        mathMarks = inputMarks(scanner, "Math");
        scienceMarks = inputMarks(scanner, "Science");
        englishMarks = inputMarks(scanner, "English");

        // Calculate total, percentage, and determine result and grade
        int total = mathMarks + scienceMarks + englishMarks;
        double percentage = total / 3.0;
        String result = (percentage >= 35) ? "Pass" : "Fail";
        String grade;

        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Print Mark Sheet
        System.out.println(" _______________________________");
        System.out.println("|                               |");
        System.out.println("|          Mark Sheet           |");
        System.out.println("|_______________________________|");
        System.out.printf("| Name      : %-17s|\n", name);
        System.out.printf("| Roll No   : %-17d|\n", rollNo);
        System.out.println("|_______________________________|");
        System.out.println("| Subjects        : Marks       |");
        System.out.println("|_______________________________|");
        System.out.printf("| Math           : %-10d      |\n", mathMarks);
        System.out.printf("| Science        : %-10d      |\n", scienceMarks);
        System.out.printf("| English        : %-10d      |\n", englishMarks);
        System.out.println("|_______________________________|");
        System.out.printf("| Total          : %-10d      |\n", total);
        System.out.println("|_______________________________|");
        System.out.printf("| Percentage     : %-10.1f      |\n", percentage);
        System.out.printf("| Result         : %-10s      |\n", result);
        System.out.printf("| Grade          : %-10s      |\n", grade);
        System.out.println("|_______________________________|");

        scanner.close();


    }

}
