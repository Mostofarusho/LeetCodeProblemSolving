import java.util.Scanner;

public class StudentInfo {

    long studentId;
    String studentName;
    StudentParent stp;
    StudentMarks stm;
    StudentAddress std;

    StudentInfo(long studentId, String studentName, StudentParent stp, StudentMarks stm, StudentAddress std) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.stp = stp;
        this.stm = stm;
        this.std = std;
    }

    void studentStatus() {
        double sum = 0,average=0;
         sum = stm.markOne + stm.markTwo + stm.markThree;
          average=(sum/3);
        if (sum >= 150) {
            System.out.println("Congratulations " + studentName + " " + "You are Passed " + "Your Student id is " + studentId + " " + "Your Father Name is" + stp.fatherName + "Your Mother Name is " + stp.motherName);
            System.out.println("Your Marks are " + "Mark One " + stm.markOne + "Mark Two " + stm.markTwo + "Mark Three " + stm.markThree+" Your Average is "+average);
            System.out.println("Your House Number is " + std.houseNumber + "Your Street Number is " + std.street + " Your Pincode is " + std.pincode + "You are living in " + std.state + " state" + "Your Country is " + std.country);
        } else {
            System.out.println("Sorry " + studentName + " " + "You are Failed " + "Your Student id is " + studentId + " " + "Your Father Name is " + stp.fatherName + "Your Mother Name is " + stp.motherName);
            System.out.println("Your Marks are " + "Mark One " + stm.markOne + " Mark Two " + stm.markTwo + " Mark Three " + stm.markThree+" Your Average is "+average);
            System.out.println("Your House Number is " + std.houseNumber + " Your Street Number is " + std.street + " Your Pincode is " + std.pincode + " You are living in " + std.state + " state " + " Your Country is " + std.country);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter mark one: ");
        double markOne = sc.nextDouble();

        System.out.print("Enter mark two: ");
        double markTwo = sc.nextDouble();

        System.out.print("Enter mark three: ");
        double markThree = sc.nextDouble();

        // scanner.close();
        StudentInfo obj = new StudentInfo(20131101011L, "Mostofa Omar Fattha", new StudentParent("Mostofa Abdud Dayan", "Panna Mostofa"), new StudentMarks(markOne, markTwo, markThree), new StudentAddress("11/A", "Goyal Barir More", 1236, "Dhaka", "Bangladsh"));
        obj.studentStatus();
    }
}
