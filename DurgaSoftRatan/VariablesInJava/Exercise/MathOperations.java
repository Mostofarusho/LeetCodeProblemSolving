public class MathOperations {
    int calculate(int number){
        int result=number*number;
        System.out.println(result);
        return result;
    }
    double calculate(double number){
        double result=number*number;
        System.out.println(result);
        return result;
    }
    int calculate(int numberOne,int numberTwo){
        int result=numberOne*numberTwo;
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        MathOperations obj=new MathOperations();
        obj.calculate(8,9);
    }
}
