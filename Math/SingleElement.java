public class SingleElement{
    public static void main(String[] args) {
        int[] myArray={2,3,3,6,2,4,4};
        System.out.println(uniqueElement(myArray));

    }
    static  int uniqueElement(int[] myArray){
        int unique=0;
        for(int n:myArray){
            unique ^=n;
        }
        return unique;
    }
}