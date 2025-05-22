class StringSolutions{
    public static void main(String[] args){
        String x="ABC Tech";
        char[] myArray=x.toCharArray();
        int size=myArray.length;
        System.out.println(myArray.length);
        char[] newArray=new char[size];
        int i=0;
        while (i<myArray.length) { 
            newArray[i]=myArray[i];
            i++;
        }
        String result=new String(newArray);
        System.out.println(result);
    }
}