public class MostNumberOfWords {

    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        int ans=mostWordsFound(sentences);
        System.out.println(ans);
    }

    public static int mostWordsFound(String[] sentences) {
        int lengthCount = 0;
        for (String sentence : sentences) {

            String[] word = sentence.trim().split("\\s+");
            for (int i = 0; i < word.length; i++) {
                if (word.length > lengthCount) {
                    lengthCount = word.length;
                }
            }

        }
        return lengthCount;
    }

}