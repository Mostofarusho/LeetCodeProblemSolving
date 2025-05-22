class diagonalPrime{
    public static void main(String[] args) {
        int[][] myArray={{1,2,3},{4,5,6},{7,8,9}};
        int ans=diagonalPrime(myArray);
        System.out.println(ans);
    }
    static int diagonalPrime(int[][] myArray) {
        int sum=0;
        for(int i=0;i<myArray.length;i++){
            for(int j=0;j<myArray.length;j++){
                if(i+j==myArray.length-1 || i==j){
                    sum=sum+myArray[i][j];
                }
            }
        }
        return sum;
    }
}