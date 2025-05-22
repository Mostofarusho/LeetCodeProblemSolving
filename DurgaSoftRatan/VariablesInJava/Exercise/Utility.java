
public class Utility {

    static String toolName;
    String userName;

    static void printToolName(String userName) {
        
        System.out.println("Tool Name is " + toolName);
        
        System.out.println("Tool is used By "+userName);
        
    }

    void printUserName() {
      
        System.out.println("User Name is " +userName);
    }

    void printTotal() {

        System.out.println(" The Name of the tool is " + Utility.toolName + " This tool is used by " + userName);
    }
}
