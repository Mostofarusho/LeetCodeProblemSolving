public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int columnNumber1 = 1;
        int columnNumber2 = 28;
        int columnNumber3 = 701;
        String ans1 = convertToTitle(columnNumber1);
        String ans2 = convertToTitle(columnNumber2);
        String ans3 = convertToTitle(columnNumber3);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);

    }

    public static String convertToTitle(int columnNumber) {
        if (columnNumber == 0) {
            return "0";
        }
        String result = "";
        while (columnNumber > 0) {
            columnNumber--;
            int digit = columnNumber % 26;
            char digitChar = (char) ('A' + digit); 
            result = digitChar + result; 
            columnNumber = columnNumber / 26; 
        }
        return result;

    }
}
