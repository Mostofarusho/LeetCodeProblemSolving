public class ValidWordsCounter {

    public static void main(String[] args) {
        String sentence1 = "cat and  dog";
        String sentence2 = "!this  1-s b8d!";
        String sentence3 = "alice and  bob are playing stone-game10";
        String sentence4 = " o6 t";

        System.out.println(countValidWords(sentence1)); // Output: 3
        System.out.println(countValidWords(sentence2)); // Output: 0
        System.out.println(countValidWords(sentence3)); // Output: 5
        System.out.println(countValidWords(sentence4)); // Output: 5
    }

    public static int countValidWords(String sentence) {
        
        String[] words = sentence.trim().split("\\s+");

        
        int validCount = 0;

        
        for (String word : words) {
            if (isValid(word)) {
                validCount++;
            }
        }

        return validCount;
    }

    public static boolean isValid(String word) {

        if (word.isEmpty()) {
            return false;
        }
       
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                return false;
            }
        }

      
        int hyphenCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '-') {
                hyphenCount++;
                if (hyphenCount > 1) {
                    return false;
                }
                
                if (i == 0 || i == word.length() - 1) {
                    return false;
                }
                if (!Character.isLowerCase(word.charAt(i - 1)) || !Character.isLowerCase(word.charAt(i + 1))) {
                    return false;
                }
            }
        }

        
        int punctuationCount = 0;
        String punctuationMarks = "!.,";
        for (int i = 0; i < word.length(); i++) {
            if (punctuationMarks.indexOf(word.charAt(i)) != -1) {
                punctuationCount++;
                if (punctuationCount > 1 || i != word.length() - 1) {
                    return false;
                }
            }
        }

        
        return true;
    }
}
