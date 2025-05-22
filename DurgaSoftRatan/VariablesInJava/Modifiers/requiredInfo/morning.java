// package VariablesInJava.Modifiers.requiredInfo;

public class morning {

    void mor() {
        System.out.println("Good Morning");
    }
    static int a = 10;

    static void m1() {
        System.out.println("M1 method");
    }

    static {
        System.out.println("Good Evening");
    }

    public static void main(String[] args) {
        morning obj = new morning();
        obj.mor();
        morning.m1();

    }
}
