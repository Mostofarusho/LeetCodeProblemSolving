
public class constructorAssignment {

    String customarName;
    int productID;
    double productCost;
    int productQuantity;
    static int gst = 10;
    static String brandName = "HoneyWell";
    static double discount = 0.05;

    constructorAssignment(String customarName, int productID, double productCost, int productQuantity) {
        this.customarName = customarName;
        this.productID = productID;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
    }

    void totalBill() {

        double totalCost = productCost * productQuantity;

        double finalbill = 0.0;
        double free = 0.0;
        if (totalCost > 2000) {
            free = (totalCost * constructorAssignment.discount) - constructorAssignment.gst;
            finalbill = totalCost - free;
            System.out.println("Hello Mr " + customarName + " Your Product id is " + productID + " Your Product Name is " + constructorAssignment.brandName + " Your bill is " + totalCost + "And your discount is " + free + " Which means your final bill is" + finalbill);
        } else {

            free = (totalCost * constructorAssignment.discount);
            finalbill = totalCost - free;
            System.out.println("Hello Mr " + customarName + " Your Product id is " + productID + " Your Product Name is " + constructorAssignment.brandName + " Your bill is " + totalCost + "And your discount is " + free + " Which means your final bill is " + finalbill);
        }
    }

    public static void main(String[] args) {
        constructorAssignment obj = new constructorAssignment("Mostofa", 11, 3000.5, 10);
        obj.totalBill();
        constructorAssignment obj2 = new constructorAssignment("Mostofa", 11, 300.5, 1);
        obj2.totalBill();
    }
}
