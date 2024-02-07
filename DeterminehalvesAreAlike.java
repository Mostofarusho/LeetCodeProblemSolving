public class DeterminehalvesAreAlike {

    public static void main(String[] args) {
        String s = "book";
        boolean input=halvesAreAlike(s);
        System.out.println(input);
    }
    // String actualWord = word.substring(0, word.length() - 1);
    static boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        char ch[]=s.toCharArray();
        int size=ch.length;
        char part1[]=new char[size/2];
        char part2[]=new char[size/2];
        int i=0;
        char vowels[]={'a','e','i','o','u'};
        while (i!=size) {
            if(i<size/2){
                part1[i]=ch[i];
            }
           else{
            part2[i-size/2]=ch[i];
           }
            ++i;
        }
        int part1Count=0;
        for(int part1Index=0;part1Index<part1.length;part1Index++){
            for(int vo=0;vo<vowels.length;vo++){
                if(part1[part1Index]==vowels[vo]){
                    part1Count++;
                }
            }
        }
        int part2Count=0;
        for(int part2Index=0;part2Index<part1.length;part2Index++){
            for(int vo=0;vo<vowels.length;vo++){
                if(part2[part2Index]==vowels[vo]){
                    part2Count++;
                }
            }
        }
        if(part1Count==part2Count){
            return true;
        }
        return false;
        
    }
}