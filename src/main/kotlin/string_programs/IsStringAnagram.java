package string_programs;

public class IsStringAnagram {
    public static void main(String[] args) {
        Boolean b = isAnagram("deena","aneed");
        System.out.println(b.toString());
    }

    public static Boolean isAnagram(String s, String t) {
        if(s.length() < t.length()) {
            return false;
        }

        int[] counter = new int[26];
        for (int i=0;i<s.length();i++){
            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
        }

        for (int j : counter) {
            if (j != 0) return false;
        }


        return  true;
    }
}
