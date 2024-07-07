public class Length_of_Last_Word {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";
        int ans1 = lengthOfLastWord(s1);
        int ans2 = lengthOfLastWord(s2);
        int ans3 = lengthOfLastWord(s3);
        System.out.println(ans1);// 5:5
        System.out.println(ans2); // 4:3
        System.out.println(ans3); // 6:5

    }

    public static int lengthOfLastWord(String s) {
        int lastWordLength = 0;
       
        String[] words = s.trim().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if(words[words.length-1].length()>lastWordLength)
            lastWordLength= words[words.length-1].length();
        }
        return lastWordLength;
        // String[] words = s.trim().split("\\s+");
        // for (String word : words) {
        //     if (words[word.length()-1].length()> lastWordLength) {
        //         lastWordLength = words[word.length()-1].length();
        //     }
        // }
        // return lastWordLength;
        // for (String words : s) {
        // String[] word= s.trim().split("\\s+");
        // if(word.length-1>lastWordLength){
        // lastWordLength=word.length-1;
        // }
        // return lastWordLength;
        // }
    }

}
