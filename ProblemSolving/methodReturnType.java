
public class methodReturnType {

    int num1 = 10, num2 = 20;

    void add(int num1, int num2) {
        System.out.println(this.num1 + this.num2);
        System.out.println(num1 + num2);

    }

    double totalBill(String pname, double cost, int quantity) {
        double bill;
        bill = cost * quantity;
        return bill;
    }

    static int productOrder(String name, String location, int cost) {
        if (cost > 100) {
            return 1234;
        } else {
            return 5678;
        }
    }

    int a = 10;

    int m1(int a) {
        return this.a;
    }

    public static void main(String[] args) {
        methodReturnType obj = new methodReturnType();
        System.out.println(obj.totalBill("Mouse", 500.8, 5));
        System.out.println(methodReturnType.productOrder("Mouse", "Dhaka", 500));
        obj.add(100, 200);
        int num=obj.m1(100);
        System.out.println("Number is"+obj.m1(obj.a));
        System.out.println("Number is Instance "+num);
    }
}
