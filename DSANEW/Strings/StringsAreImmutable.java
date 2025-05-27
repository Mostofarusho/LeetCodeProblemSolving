public class StringsAreImmutable {
    public static void main(String[] args) {
        StringBuffer x=new StringBuffer("Mostofa");
        StringBuffer y=new StringBuffer("Rusho");
        x.append(y);
        System.out.println(x);
    }
    
}

