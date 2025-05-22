abstract class PolyThree extends PolyTwo{

    PolyThree(){
        this(10);
        System.out.println("Abstrct Class Poly Three 0---args  Constructor");
    }

     PolyThree(int a) {
        System.out.println("Abstrct Class Poly Three 1---args  Constructor "+a);
    }

    {
        System.out.println("Parent class Instance Block");
    }
    static {
        System.out.println("Parent Class Static Block");
    }
    
    void m2(){
        System.out.println("This is mY M-2 Method");
       }
}