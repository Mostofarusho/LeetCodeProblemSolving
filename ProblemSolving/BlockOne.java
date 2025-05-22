
public class BlockOne {

    BlockOne() {
        this(10);
        System.out.println("0---arguments constructor");
    }

    BlockOne(int a) {
        System.out.println("1---arguments constructor " + a);
    }

    {
        System.out.println("Instance Blocks One");

    }

    {
        System.out.println("Instance Blocks Two");

    }

    static {
        System.out.println("Static Blocks One");
    }

    static {
        System.out.println("Static Blocks Two");
    }

    public static void main(String[] args) {
        new BlockOne();
        

    }
}
