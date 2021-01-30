package leetcode.validanagram;

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] charArrayS = sortedCharArray(s);
        char[] charArrayT = sortedCharArray(t);

        for (int i = 0; i < charArrayS.length; i++) {
            if (charArrayS[i] != charArrayT[i]) {
                return false;
            }
        }

        return true;
    }

    private char[] sortedCharArray(String s) {
        char[] result = s.toCharArray();
        Arrays.sort(result);
        return result;
    }
}