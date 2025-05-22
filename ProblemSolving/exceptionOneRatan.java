
import java.util.Scanner;


public class exceptionOneRatan {

    static void validate(int age){
        if(age<18){
            throw new YoungAgeException();
        }
        else if(age>18 && age<35){
            System.out.println("Eligible For Merrage");
        }
        else  {
            throw new InvalidAgeException("You are Not eligible You should try before");
        }
    }
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter Your Age");
        int age=sc.nextInt(); 
        exceptionOneRatan.validate(age);

    }

}
