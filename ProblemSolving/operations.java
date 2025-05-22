


public class operations {

    void wish() {
        System.out.println("Good Morning");
    }

    void add(int num1, int num2) {
        int res = num1 + num2;
        System.out.println(res);
    }

    static void login(String username, String password) {
        if (username.equals("Mostofa") && password.equals("rusho")) {
            System.out.println("Login Successful " + username);
        } else {
            System.out.println("Login Failed....");
        }
    }

    static void courseInfo(String name, String course) {
        if (course.equals("corejava")) {
            System.out.println("Your Course Fee is 3000" + course);
        } else if (course.equals("python")) {
            System.out.println("Your Course Fee is 5000" + course);
        } else {
            System.out.println("This course is not available "+name);
        }
    }

    static void display(int a, char ch, double d, boolean b) {
        System.out.println("int is " + a + " char is " + ch + " double is " + d + " boolean is " + b);
    }
}
