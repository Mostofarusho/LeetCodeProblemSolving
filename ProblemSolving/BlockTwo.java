
public class BlockTwo {

    {
        System.out.println("Block Two Class Instance Block");
    }

    static {
        System.out.println("Block Two Class Static Block");
    }

    void wish() {
        System.out.println("Block Two Class Instance Method");
    }

    public static void main(String[] args) {
        BlockTwo obj = new BlockTwo();
    }
}
