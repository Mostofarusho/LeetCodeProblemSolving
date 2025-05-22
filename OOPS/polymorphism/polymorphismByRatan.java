public class polymorphismByRatan{

    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(double a,double b){
        System.out.println(a+b);
    }

    public polymorphismByRatan() {
    }
    polymorphismByRatan(int a,int b){
        System.out.println(a+b);
    }
    polymorphismByRatan(String a,String b){
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        polymorphismByRatan obj=new polymorphismByRatan();
        obj.sum(10.7, 20.9);
        new polymorphismByRatan(1,2);
        new polymorphismByRatan("Mostofa","Rusho");
    }
}