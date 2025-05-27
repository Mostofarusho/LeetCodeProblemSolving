public class CountTheNumberOfWordsInASentence {
    public static void main(String[] args) {
        String myString="This is a Sentence";
        String words[]=myString.split(" ");
        int count=0;
        for(String word:words){
            count++;
        }
        System.out.println(count);

    }
}
