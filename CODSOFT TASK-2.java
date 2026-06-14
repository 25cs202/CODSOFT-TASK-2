import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subs = sc.nextInt();

        int total = 0;

        
        for (int i = 1; i <= subs; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        
        double avgper = (double) total / subs;

        
        String grade;

        if (avgper >= 90) {
            grade = "A+";
        } else if (avgper >= 80) {
            grade = "A";
        } else if (avgper >= 70) {
            grade = "B";
        } else if (avgper >= 60) {
            grade = "C";
        } else if (avgper >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        
        System.out.println("\n       Result       ");
        System.out.println("Total Marks = " + total);
        System.out.println("Average Percentage = " + avgper + "%");
        System.out.println("Grade = " + grade);

        sc.close();
    }
}