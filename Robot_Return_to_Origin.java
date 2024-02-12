public class Robot_Return_to_Origin {
    public static void main(String[] args) {
        String moves = "UDDUURLRLLRRUDUDLLRLURLRLRLUUDLULRULRLDDDUDDDDLRRDDRDRLRLURRLLRUDURULULRDRDLURLUDRRLRLDDLUUULUDUUUUL";
        boolean ans = judgeCircle(moves);
        System.out.println(ans);
    }

    static boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        boolean ans=false;
        for(char move : moves.toCharArray()){
            switch (move) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
            
                default:
                    break;
            }
        }
        if(x==0 && y==0){
            return !ans;
        }
        return ans;
    }
}