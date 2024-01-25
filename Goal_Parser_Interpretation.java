public class Goal_Parser_Interpretation {
    public static void main(String[] args) {
        String x = "SPIDERSLIES";
        char ch[] = x.toCharArray();
        int size = ch.length;
        char key = 'I';
        int i = 0;
        String res = "";

        while (i != size) {
            if (ch[i] != key) {
                res = res + ch[i];
            }
            ++i;
        }

        System.out.println(res);
    }
}