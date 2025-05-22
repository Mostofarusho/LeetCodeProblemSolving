public class CarChatGPT extends VehicleChatGPT {
    String brand;
    
    void displayInfo(){
        System.out.println("This Car  Brand is "+brand+" Speed is "+speed+" mph");
    }
    public static void main(String[] args) {
        CarChatGPT obj=new CarChatGPT();

        obj.brand="Toyota";
        obj.speed=100;
        obj.displayInfo();
        obj.move();
    }
}
