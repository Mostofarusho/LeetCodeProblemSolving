public class StudentChatGPT extends PersonChatGPT{
    
    double grade;

    void display(){
        System.out.println("Student Name is "+name+" Grade is "+grade+" and he is "+age+" Years of old");
    }
    public static void main(String[] args) {
        StudentChatGPT obj=new StudentChatGPT();
        obj.name="Rusho";
        obj.age=28;
        obj.grade=2.89;
        obj.display();
        obj.personInfo();
    }
}
