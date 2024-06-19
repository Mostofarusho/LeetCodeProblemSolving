package String;
public class Furthest_Point_From_Origin {

    public static void main(String[] args) {
        String moves = "L_RL__R";
        int ans = furthestDistanceFromOrigin(moves);
        System.out.println(ans);
    }

    static int furthestDistanceFromOrigin(String moves) {
        char move[] = moves.toCharArray();
        int x = 0;
        int left = 0, right = 0;
        for (int i = 0; i < move.length; i++) {
            if (move[i] == 'L') {
                x--;
                left++;
            } else if (move[i] == 'R') {
                x++;
                right++;
            }
        }
        for (int j = 0; j < move.length; j++) {
            if (move[j] == '_') {
                if(left==right){
                    x--;
                }
                else if (left > right) {
                    x--;
                } else if (left < right) {
                    x++;
                }
            }

        }
        return Math.abs(x);
    }
}