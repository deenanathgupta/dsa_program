package string_programs;

public class CheckStringIsPalandrom {
    public static void main(String[] args) {
        String s = "abcbax";
        System.out.println(isPalindrome(s));
    }

    static Boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = removeSpace(s);
        char[] cArr = s.toCharArray();
        int start = 0;
        int end = cArr.length - 1;

        while (start < end) {
            if (cArr[start] != cArr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static String removeSpace(String s) {
        char[] cArr = s.toCharArray();
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] == ' ') {

            }
        }
        return null;
    }
}
