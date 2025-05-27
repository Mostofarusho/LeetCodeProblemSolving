public class SwapTwoStrings {
    public static void main(String[] args) {
    StringBuffer x=new StringBuffer("Mostofa");
    StringBuffer y=new StringBuffer("Rusho");
    StringBuffer z=new StringBuffer("");
    System.out.println(y+" "+x);
    z=y;
    y=x;
    x=z;
    System.out.println(y+" "+x);
    // String x="Mostofa";
    // String y="Rusho";
    // String z="";
    // z=y;
    // y=x;
    // x=z;
    // System.out.println(y+" "+x);
    }
}
 
