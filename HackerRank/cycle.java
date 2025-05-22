class motorcycle{
    String getDetails(){
        return "Hello I am a motorcycle, I am a cycle with an engine.";
    }
}
public class cycle extends motorcycle{
    @Override
    String getDetails(){
        System.out.println(super.getDetails());
        return "My ancestor is a cycle who is a vehicle with pedals.";
    }
    public static void main(String[] args) {
        cycle obj=new cycle();
        System.out.println(obj.getDetails());
    }
}