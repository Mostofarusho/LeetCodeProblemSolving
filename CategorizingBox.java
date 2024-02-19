public class CategorizingBox {
    public static void main(String[] args) {

        String ans = categorizeBox(2909, 3968, 3272, 727);
        System.out.println(ans);
    }

    static String categorizeBox(int length, int width, int height, int mass) {
        long volume = (long) length * width * height; 
        boolean checkerBulky = volume >= 1000000000 || length >= 10000 || width >= 10000 || height >= 10000;
        boolean checkerHeavy = mass >= 100;
        if (checkerBulky && checkerHeavy) {
            return "Both";
        } else if (checkerBulky) {
            return "Bulky";
        } else if (checkerHeavy) {
            return "Heavy";
        } else {
            return "Neither";
        }

    }
}
