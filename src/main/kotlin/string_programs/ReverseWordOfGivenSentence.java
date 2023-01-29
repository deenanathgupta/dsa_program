package string_programs;

public class ReverseWordOfGivenSentence {
    public static void main(String[] args) {
        String s = "  hello world";//olleh dlrow->
        System.out.println(s);
        reverseWords(s);
    }

    static char[] reverseWords(String str)
    {
        char[] s = str.toCharArray();
        int word_begin = -1;

        //  /* temp is for word boundary */
        int i = 0;

        /*STEP 1 of the above algorithm */
        while (i < s.length) {

      /*This condition is to make sure that the
              string start with valid character (not
              space) only*/
            if ((word_begin == -1) && (s[i] != ' ')) {
                word_begin = i;
            }
            if (word_begin != -1
                    && ((i + 1 == s.length)
                    || (s[i + 1] == ' '))) {
                reverse(s, word_begin, i);
                word_begin = -1;
            }
            i++;
        } /* End of while */

        /*STEP 2 of the above algorithm */
        reverse(s, 0, (s.length - 1));
        return s;
    }


    private static void shiftCharacter(char[] chArr) {

    }

    private static void reverse(char[] chArr, int start, int end) {
        while (start<end) {
            char temp = chArr[start];
            chArr[start]= chArr[end];
            chArr[end] = temp;
            start++;
            end--;
        }
    }
}
