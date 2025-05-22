
public class BlocksChatGPT {

    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Blocks");
    }

    BlocksChatGPT() {
        System.out.println("This is a Constructor");
    }

    void test() {
        System.out.println("This is a Test method");
    }

    public static void main(String[] args) {
        BlocksChatGPT obj = new BlocksChatGPT();
        obj.test();

    }

}
