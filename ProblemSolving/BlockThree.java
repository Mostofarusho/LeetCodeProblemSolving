
public class BlockThree {

    public static void main(String[] args) throws Exception {
        // BlockThree obj = new BlockThree();
        // BlockTwo obj2=new BlockTwo();
        // obj2.wish();
        Class c = Class.forName("BlockTwo");
        BlockTwo two = (BlockTwo) c.newInstance();
        two.wish();
    }
}
