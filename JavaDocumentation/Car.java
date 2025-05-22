public class Car {
    int speed=0;
    String gearType="P";

    void changeGear(String newValue){
        gearType=newValue;
        if(gearType.equals("P") || gearType.equals("D") || gearType.equals("R")){
            
            System.out.println("Now You are In "+gearType+" Gear. ");
        }
        else{
            System.out.println("Invalid Gear "+newValue+" Please Choose P D or R");
        }
    }
    void accelerate(int increment){
        
        speed+=increment;
        if(speed>=200){
            System.out.println("You Crossed the Safety Limit Your Current Speed is "+speed+" mph. Please Reduce Your Speed");
            
        }
        else{
            System.out.println("You are Driving in a Safe Limit Your Current Speed is "+speed+" mph");
        }
    }
    void brake(int decrement){
        
        speed-=decrement;
        if(speed<=0){
            System.out.println("Your Car has Stopped Now Your Current Speed is "+speed +" mph");
            
        }
       else{
        System.out.println("Please Increase Your Car Speed Your Current Speed is "+speed+" mph");
       }
    }
    void printState() {
        System.out.println("Current speed: " + speed + " mph, Current gear: " + gearType);
    }

}
