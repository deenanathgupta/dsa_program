package leetcode;

import java.math.BigInteger;
import java.util.HashMap;

public class MultiplyString {

    public static String multiply(String num1, String num2) {
        BigInteger result = BigInteger.valueOf(0);
        if (num1.length() >= 1 && num2.length() >= 1 && num2.length() <= 200) {
            int n1 = convertStringToNum(num1);
            int n2 = convertStringToNum(num2);
            result = BigInteger.valueOf(n1*n2);
        }
        return String.valueOf(result);
    }

    private static int convertStringToNum(String num) {
        int n = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) >= '0' && num.charAt(i) <= '9') {
                n = n * 10 + (num.charAt(i) - 48);
            }
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(multiply("123456789","123456789"));
        Integer i = null;
    }
}
