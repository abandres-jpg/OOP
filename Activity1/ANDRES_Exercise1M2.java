import java.util.Scanner;

public class ANDRES_Exercise1M2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String fullName = input.nextLine();

        System.out.print("Enter student number: ");
        String studentNumber = input.nextLine();

        System.out.print("Enter program: ");
        String program = input.nextLine();

        System.out.print("Enter year level: ");
        int yearLevel = input.nextInt();

        System.out.print("Enter current GPA: ");
        double gpa = input.nextDouble();

        System.out.println("\nSTUDENT PROFILE");
        System.out.println("Name: " + fullName);
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Program: " + program);
        System.out.println("Year Level: " + yearLevel);
        System.out.println("GPA: " + gpa);

        input.close();
    }
}
