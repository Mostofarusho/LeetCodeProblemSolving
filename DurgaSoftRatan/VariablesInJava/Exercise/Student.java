import java.util.Scanner;

// Class to represent Student Details
public class Student {
    // Instance variables
    String name;
    int rollNumber;

    // Static variable for school name
    static String schoolName = "A K High School";

    // Method to set student details
    void setDetails(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("School Name: " + schoolName);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create first student object
        Student student1 = new Student();
        System.out.println("Enter details for Student 1:");
        System.out.print("Enter Name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNumber1 = sc.nextInt();
        sc.nextLine(); // Consume newline
        student1.setDetails(name1, rollNumber1);

        // Create second student object
        Student student2 = new Student();
        System.out.println("Enter details for Student 2:");
        System.out.print("Enter Name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNumber2 = sc.nextInt();
        student2.setDetails(name2, rollNumber2);

        // Display details for both students
        System.out.println("\nStudent Details:");
        student1.displayDetails();
        student2.displayDetails();
    }
}
