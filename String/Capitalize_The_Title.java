package String;
public class Capitalize_The_Title {
    public static void main(String[] args) {
        String title = "L hV";
        String ans = capitalizeTitle(title);
        System.out.println(ans);
    }

    static String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        int size = words.length;
        // String[] result = new String[size];
        StringBuilder res =new StringBuilder();
        for (String word : words) {
            if (word.length() > 2) {
                 word=word.substring(0, 1).toUpperCase()+word.substring(1).toLowerCase();
            }
            else{
                word=word.toLowerCase();
            }
            res.append(word).append(" ");
        }
        return res.toString().trim();

    }

}
