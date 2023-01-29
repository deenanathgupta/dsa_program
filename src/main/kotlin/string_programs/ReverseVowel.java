package string_programs;

import java.util.Arrays;

public class ReverseVowel {
    public static void main(String[] args) {
        String s = "srinivas";
        String res = reverseVowels(s);
        System.out.println(res);
    }

    static String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] chars = s.toCharArray();

        while (start < end) {
            if (!isVowel(chars[start])) {
                start++;
            }
            if (!isVowel(chars[end])) {
                end--;
            }
            if(isVowel(chars[start]) && isVowel(chars[end])) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }

        return new String(chars);
    }

    private static boolean isVowel(Character c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
