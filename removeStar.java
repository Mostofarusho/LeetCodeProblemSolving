public class removeStar {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        String ans=removeStars(s);
        System.out.println(ans.toString());
    }
    static String removeStars(String s) {
        StringBuilder sb = new StringBuilder(s);
        char star = '*';
        int i=0;
        while (i<sb.length()) {
            if(sb.charAt(i)==star && i>0){
                sb.delete(i-1, i+1);
                i--;
            }
            else{
               
                i++;
            }
        }
        return sb.toString();
    }
}
