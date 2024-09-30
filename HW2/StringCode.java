import java.sql.Array;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isDigit;
import static java.lang.Math.max;

// CS108 HW1 -- String static methods

public class StringCode {

    /**
     * Given a string, returns the length of the largest run.
     * A a run is a series of adajcent chars that are the same.
     * @param str
     * @return max run length
     */
    public static int maxRun(String str) {
        int length = 1;
        int Max = 0;
        for (int i = 1; i < str.length(); i++) {
           if (str.charAt(i) == str.charAt(i-1)) {
               length++;
           }
           else {
               Max = max(Max, length);
               length = 1;
           }
        }
        Max = max(Max, length);
        return Max;
    }


    /**
     * Given a string, for each digit in the original string,
     * replaces the digit with that many occurrences of the character
     * following. So the string "a3tx2z" yields "attttxzzz".
     * @param str
     * @return blown up string
     */
    public static String blowup(String str) {
        String s = "";
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (isDigit(str.charAt(i))) {
                s += str.charAt(i);
            }
            else {
                res += str.charAt(i);
            }
            if (isDigit(str.charAt(i)) && isAlphabetic(str.charAt(i+1))) {
                Integer num = Integer.valueOf(s);
                for (int j = 0; j < num; j++) {
                    res += str.charAt(i+1);
                }
                s = "";
            }
        }
        return res; // YOUR CODE HERE
    }



    /**
     * Given 2 strings, consider all the substrings within them
     * of length len. Returns true if there are any such substrings
     * which appear in both strings.
     * Compute this in linear time using a HashSet. Len will be 1 or more.
     */
public static boolean stringIntersect(String a, String b, int len) {
    for (int i = 0; i < a.length()-2; i++) {
        String s = "";
        for (int j = i; j < i + len; j++) {
            s += a.charAt(j);
        }
        if (b.contains(s)) return true;
    }
    return false; // YOUR CODE HERE
}

    public static void main(String[] args) {
        StringCode Sc = new StringCode();
        String s="awdaswgf1a";
        String ss= "awdafwafsa";
        System.out.println( StringCode.stringIntersect(s,ss,3));
    }
}
