package String;
public class numJewelsInStones {
    public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZ";
        int input = numJewelsInStone(jewels, stones);
        System.out.println(input);
    }

    static int numJewelsInStone(String jewels, String stones) {
        char stone[] = stones.toCharArray();
        char jewel[] = jewels.toCharArray();

        int count=0;
        for(int i=0;i<stone.length;i++){
            for(int j=0;j<jewel.length;j++){
                if(stone[i]==jewel[j]){
                    count++;
                }
            }
        }
        return count;
    }
   
}
