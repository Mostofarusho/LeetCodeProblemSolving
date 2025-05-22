public class TestClientOneForPoly {
    public static void main(String[] args) {
        EncapsulationOne obj=new EncapsulationOne();
        obj.setEid(11);
        obj.setEname("Rusho");
        int a=obj.getEid();
        String b= obj.getEname();
        System.out.println("Eid is "+a+" Ename is "+b);

    }
}
