public class Hero {
    String name;
    int age;
    double height;
    Address adr;
    Movies mov;

     Hero(String name, int age, double height, Address adr, Movies mov) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.adr = adr;
        this.mov = mov;
    }
    void disp(){
        System.out.println("Name of The Hero is "+name);
        System.out.println("Age of The Hero is "+age);
        System.out.println("Height of The Hero is "+height);
        System.out.println("Address of The Hero is "+adr.rodeNo+" "+adr.StreetName+" "+adr.StateName);
        System.out.println("Hero is from  "+mov.bollywood+" "+mov.tollywood);
    }
    public static void main(String[] args) {
        Address objAddress=new Address(111,"Kulapuri","Mumbai");
        Movies objMovie=new Movies("Ready","Prem");
        Hero obj=new Hero("Salaman", 57, 5.7,objAddress,objMovie);
        obj.disp();
        System.out.println("..........");
        // Address obj2Address=
        // Movies obj2Movies=
        Hero obj2=new Hero("Sharukh", 58, 5.8, new Address(222, "Bhanga", "Delhi"),new Movies("Ma Hu Na", "Jaywan"));
        obj2.disp();
    }
    
}
