package leetcode.countandsay;

class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String prev = countAndSay(n - 1);
        StringBuilder output = new StringBuilder();
        char currentLetter = 0;
        char nextLetter;
        int currentLetterCount = 1;
        for (int i = 0; i < prev.length(); i++) {

            currentLetter = prev.charAt(i);

            if (i + 1 == prev.length()) {
                output.append("" + currentLetterCount + currentLetter);
                break;
            }

            nextLetter = prev.charAt(i + 1);

            if (currentLetter == nextLetter) {
                currentLetterCount++;
            } else {
                output.append("" + currentLetterCount + currentLetter);
                currentLetterCount = 1;
            }
        }

        return output.toString();
    }
}

