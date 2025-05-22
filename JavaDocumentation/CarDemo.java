public class CarDemo extends Car{
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.changeGear("D");
        car1.accelerate(50); // Accelerate to 50 mph
        car1.brake(30); // Reduce speed to 20 mph
        car1.printState(); // Display current state

        Car car2 = new Car();
        car2.changeGear("R");
        car2.accelerate(10); // Reverse at 10 mph
        car2.brake(10); // Stop the car
        car2.printState(); // Display current state

        // Invalid scenarios
        car1.changeGear("X"); // Invalid gear
        car1.accelerate(200); // Safety warning
    }
}
