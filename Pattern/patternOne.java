
public class patternOne {

    public static void main(String[] args) {

        patternFive(5);

    }

    static void patternOne(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void patternTwo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void patternThree(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void patternFour(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void patternFive(int n) {
        for (int row = 1; row <= (2 * n - 1); row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
                if(col==n){
                    for(int coll=n-1;coll>=1;coll--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                
            }
            System.out.println();

        }
    }

}
