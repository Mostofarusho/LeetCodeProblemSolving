public class inheritanceByRatan extends inheritanceThree{
   
    public static void main(String[] args){
        inheritanceByRatan obj=new inheritanceByRatan();
        inheritanceOne one=new inheritanceOne();
        inheritanceTwo two=new inheritanceTwo();
        inheritanceThree three=new inheritanceThree();
        System.out.println(one instanceof Object);
        System.out.println(two instanceof Object);
        System.out.println(three instanceof Object);
        System.out.println(one instanceof inheritanceByRatan);
        // obj.m1();
        // obj.m2();
        // obj.m3();
        // obj.m4();
        // obj.m5();
        // obj.m6();
    }
}
