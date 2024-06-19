package String;
public class Shuffle_String {
    public static void main(String[] args) {
        String ans=restoreString("codeleet",new int[]{4,5,6,7,0,2,1,3});
        System.out.println(ans);
    }
    static String restoreString(String s, int[] indices){
        char[] result = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }

        return new String(result);
    }
}
