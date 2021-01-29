package leetcode.implementstrstr;

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (haystack.length() == 0) return -1;

        for (int outer = 0; outer < haystack.length(); outer++) {
            if (outer + needle.length() > haystack.length()) break;
            for (int inner = 0; inner < needle.length(); inner++) {
                if (haystack.charAt(outer + inner) != needle.charAt(inner)) break;
                if (inner == needle.length() - 1) return outer;
            }
        }

        return -1;
    }
}